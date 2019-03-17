package Server;

import javax.net.ssl.SSLServerSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
    private ArrayList<Game> waitingGames;

    public ServerThread(int port) {
        this.port = port;
        gameInstances = new ArrayList<>();
        waitingGames = new ArrayList<>();
    }

    /**
     * Runs the server thread on the given port and creates a thread with this running.
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
            Player newPlayer = listening();

            // If there is a new player the server will either pair them with someone waiting
            // or put them in the waiting queue
            if (newPlayer != null) {
                addPlayer(newPlayer);
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
     * Adds a new player to the waiting games list either in a new game or to an existing one
     * Checks to see if a waiting game still has its first player connected, if not it will be removed
     * and the player is added using a recursive call
     * @param newPlayer new player to be added
     */
    private void addPlayer(Player newPlayer) {
        if (waitingGames.isEmpty()) {
            waitingGames.add(new Game(newPlayer));
        } else {
            if (waitingGames.get(0).waitingCheck()) {
                Game nextGame = waitingGames.get(0);
                nextGame.addPlayer(newPlayer);
                gameInstances.add(nextGame);
                waitingGames.remove(nextGame);

                createThread(nextGame);
            } else {
                waitingGames.remove(0);
                addPlayer(newPlayer);
            }
        }
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
            SSLServerSocketFactory ssf = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            this.serverSocket = ssf.createServerSocket(this.port);
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

    private Player listening() {
        try {
            // Accepts connection from a new user and sends them a message to confirm
            Socket clientSocket = this.serverSocket.accept();
            System.out.println("Connection received from " + clientSocket.getPort());

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println("Connection established, authentication in progress.");

            // Once this happens the client will send input authentication to be checked against the database
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            String username = in.readLine();
            String password = in.readLine();
            out.println("AUTHENTICATED");
            return new Player(username, clientSocket);
            // TODO Need to add database interaction to check username and password and then create a player instance

        } catch (IOException e) {
            if (!running) {
                System.out.println("Server is stopped");
            }
            System.out.println("Problem accepting connection");
            return null;
        }
    }
}