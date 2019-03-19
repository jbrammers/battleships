package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerThread implements Runnable {
    private int port;
    private ServerSocket serverSocket;
    private boolean running = false;
    private Thread currentThread;
    private ExecutorService threadpool = Executors.newCachedThreadPool();
    private ArrayList<Game> gameInstances;
    private ArrayList<Player> waitingPlayers;
    private int idIterator = 1;

    public ServerThread(int port) {
        this.port = port;
        gameInstances = new ArrayList<>();
        waitingPlayers = new ArrayList<>();
    }

    /**
     * Runs the server on the given port and creates a thread with this running.
     */
    @Override
    public void run() {

        // Ensures current thread is synchronized
        synchronized (this) {
            this.currentThread = Thread.currentThread();
        }

        // Begins server progress
        startServer();


        // Loops the server until it is stopped
        while (running) {

            // Checks to see if there is a new player each loop
            listening();

            while (waitingPlayers.size() > 1) {

                    Player player1 = waitingPlayers.get(0);
                    waitingPlayers.remove(player1);
                    Player player2 = waitingPlayers.get(0);
                    waitingPlayers.remove(player2);
                    newGame(player1,player2);
            }

            // Iterates over the game list and executes them
            // TODO games might require threads to yield so one game doesn't have to run to completetion before the next
            for (int i = 0; i < gameInstances.size(); i++) {
                Game g = gameInstances.get(i);
                // Closes a game if its finished
                if (g.isGameFinished()) {
                    gameInstances.remove(g);
                    i--;
                }
            }
        }
    }

    /**
     * Creates a new game with 2 players in the waiting list
     * @param player1 new player to be added
     * @param player2 2nd player to be added
     */
    public void newGame(Player player1, Player player2) {
        Game newGame = new Game(player1, idIterator++);
        newGame.addPlayer(player2);
        createThread(newGame);
        gameInstances.add(newGame);
    }

    public void addPlayer(Player newPlayer) {
        waitingPlayers.add(newPlayer);
    }

    /**
     * Puts a newly initiated game on a thread from the threadpool and runs it
     * @param newGame new game to be executed
     */
    private void createThread(Game newGame) {
        Thread temp = new Thread(newGame);
        threadpool.execute(temp);
    }

    /**
     * Used internally to start a server running on the given port.
     */
    private void startServer() {
        try {
            // Creates a secure server socket for password transmission
            this.serverSocket = new ServerSocket(this.port);
            serverSocket.setSoTimeout(1000);
            running = true;
            System.out.printf("Server started on port %d \n", port);
        } catch (IOException e) {
            System.out.println("Problem starting server on port: " + this.port);
        }
    }

    /**
     * Used externally to stop the server running
     */
    public synchronized void stopServer() {
        this.running = false;
        try {
            this.serverSocket.close();
        } catch (IOException e) {
            System.out.println("Problem stopping server.");
        }
    }

    private void listening() {
        try {
            // Accepts connection from a new user and sends them a message to confirm
            Socket clientSocket = this.serverSocket.accept();
            threadpool.execute(new Thread(new ConnectionHandler(clientSocket, this)));
        } catch (IOException e) {
            if (!running) {
                System.out.println("Server is stopped");
            }
        }
    }
}
