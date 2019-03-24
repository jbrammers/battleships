package Server;

import Database.DatabaseManager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

/**
 * Class that runs the handling of a new connection, either of exsisting or
 * Created by jxb1175 on 18/03/19.
 */
public class ConnectionHandler implements Runnable {
    private Socket clientSocket;
    private Server serverThread;
    private DatabaseManager db;

    public ConnectionHandler(Socket clientSocket, Server serverThread) {
        this.clientSocket = clientSocket;
        this.serverThread = serverThread;
        this.db = new DatabaseManager();
    }


    /**
     * Runs the handler checks the authenticity of an existing user or can create a new user
     */
    @Override
    public void run() {
        try {
            // Confirms connection on the server side
            System.out.println("Connection received from " + clientSocket.getPort());


            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            // Confirms connection on the client side
            out.println("Connection established, authentication in progress.");

            // Once this happens the client will send input authentication to be checked against the database
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));

            boolean authFinished = false;
            String username = null;
            while (!authFinished) {

                String type = in.readLine();
                username = in.readLine().substring(6);
                String password = in.readLine().substring(6);

                // if the user is new, they are added to the database, fails if already present
                if (type.equals("newuser")) {
                    boolean success = newUser(username, password);
                    if (success) {
                        out.println("NEWSUCCESS");
                    } else {
                        out.println("NEWFAILED");
                    }

                } else {
                    // Check username and password against database, int gives result
                    int auth = databaseCheck(username,password);
                    if (auth == 0) { // username and password match
                        out.println("AUTHENTICATED");
                        authFinished = true;
                    } else if (auth == 1) {
                        out.println("AUTHFAIL USER"); // no user
                    } else if (auth == 2) {
                        out.println("AUTHFAIL PASS"); // password incorrect
                    } else {
                        out.println("AUTHFAIL ?");
                    }
                }
                out.flush();
            }

            // Finally a new player is added to the server
            serverThread.addPlayer(new Player(username, clientSocket));
            db = null;
        } catch (SocketException e) {
            System.out.println("Connection lost to port " + clientSocket.getPort());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param username username of user to be checked
     * @param password password of user to be check
     * @return true if the username and password match those stored in the database, false if not
     */
    private int databaseCheck(String username, String password) {
        return db.login(username,password); // TODO Check user's details against database, true if a match is found
    }

    /**
     * @param username username of the new user to be added
     * @param password password for the new user
     * @return true if successfully created, false if not
     */
    private boolean newUser(String username, String password) {
        return db.addNewUserRecord(username,password);
    }
}
