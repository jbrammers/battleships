package ServerProgram.Server;

import ServerProgram.Database.DatabaseManager;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server implements Runnable {
    private int port;
    private ServerSocket serverSocket;
    private DatabaseManager db;
    private boolean running = false;
    private Thread currentThread;
    private ExecutorService threadpool = Executors.newCachedThreadPool();
    private ArrayList<Game> gameInstances;
    private ArrayList<Player> waitingPlayers;
    private int idIterator = 1;

    public Server(int port) {
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

            // Iterates over the game list and checks if they have finished
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

    /**
     * Adds a new player to the waiting list and begins their listener
     * @param newPlayer player to be added
     */
    public void addPlayer(Player newPlayer) {
        waitingPlayers.add(newPlayer);
        threadpool.execute(newPlayer);
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

            // Setup database manager
            db = new DatabaseManager();
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

    /**
     * Method that listens for new connections and accepts them. Connections are handed off to a new thread to
     * increase listening time.
     */
    private void listening() {
        try {
            // Accepts connection from a new user and hands to a new thread to be dealt with
            Socket clientSocket = this.serverSocket.accept();
            threadpool.execute(new Thread(new ConnectionHandler(clientSocket, this)));
        } catch (IOException e) {
            if (!running) {
                // If server hasn't been started for any reason this triggers
                System.out.println("Server is stopped");
            }
        }
    }

    public DatabaseManager getDb() {
        return db;
    }
}
