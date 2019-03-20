package Server;

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
    private ServerThread serverThread;

    public ConnectionHandler(Socket clientSocket, ServerThread serverThread) {
        this.clientSocket = clientSocket;
        this.serverThread = serverThread;
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
                username = in.readLine();
                String password = in.readLine();

                if (type.equals("newuser")) {
                    boolean success = newUser(username, password);
                    if (success) {
                        out.println("NEWSUCCESS");
                    } else {
                        out.println("NEWFAILED");
                    }

                } else {
                    if (databaseCheck(username, password)) {
                        out.println("AUTHENTICATED");
                        authFinished = true;
                    } else {
                        out.println("AUTHFAIL");
                    }
                }
                out.flush();
            }

            // Finally a new player is added to the server
            serverThread.addPlayer(new Player(username, clientSocket));
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
    public boolean databaseCheck(String username, String password) {
        return true; // TODO Check user's details against database, true if a match is found
    }

    public boolean newUser(String username, String password) {
        return true; // TODO New user added to the database, returns true if success
    }
}
