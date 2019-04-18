package ServerProgram.Server;

import ServerProgram.Database.DatabaseManager;

import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.sql.SQLException;
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
                    Player player2 = waitingPlayers.get(1);
                    boolean p1 = player1.isConnected();
                    boolean p2 = player2.isConnected();
                    if (p1 && p2) {
                        waitingPlayers.remove(player1);
                        waitingPlayers.remove(player2);
                        newGame(player1, player2);
                    }
                    else if (!p1) {
                        waitingPlayers.remove(player1);
                    }
                    else if (!p2) {
                        waitingPlayers.remove(player2);
                    }
                    else {
                        break;
                    }
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
    private void newGame(Player player1, Player player2) {
        Game newGame = new Game(player1, idIterator++);
        newGame.addPlayer(player2);
        createThread(newGame);
        gameInstances.add(newGame);
    }

    /**
     * Adds a new player to the waiting list and begins their listener
     * @param newPlayer player to be added
     */
    void addPlayer(Player newPlayer) {
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
            ServerSocketFactory ssf =  ServerSocketFactory.getDefault();
            this.serverSocket = ssf.createServerSocket(port);
            serverSocket.setSoTimeout(1000);
            running = true;
            System.out.printf("Server started on port %d \n", port);
            System.out.println("Local IP Address is: " + InetAddress.getLocalHost());

            String systemip;

            try {
                URL url = new URL("http://bot.whatismyipaddress.com");

                BufferedReader br = new BufferedReader(
                        new InputStreamReader(url.openStream())
                );

                systemip = br.readLine().trim();

            } catch (Exception e) {
                systemip = "Could not read IP";
            }
            System.out.println("Public IP Address is " + systemip);

            // Setup database manager
            db = new DatabaseManager();
        } catch (IOException e) {
            System.err.println("Problem starting server on port: " + this.port);
            System.exit(1);
        } catch (SQLException e) {
            System.err.print("Problem connecting to database.");
            System.exit(1);
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

    DatabaseManager getDb() {
        return db;
    }

}
