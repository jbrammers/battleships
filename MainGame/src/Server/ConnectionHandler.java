package Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by jxb1175 on 18/03/19.
 */
public class ConnectionHandler implements Runnable {
    private Socket clientSocket;
    private ServerThread serverThread;

    public ConnectionHandler(Socket clientSocket, ServerThread serverThread) {
        this.clientSocket = clientSocket;
        this.serverThread = serverThread;
    }


    @Override
    public void run() {
        try {
            System.out.println("Connection received from " + clientSocket.getPort());


            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println("Connection established, authentication in progress.");

            // Once this happens the client will send input authentication to be checked against the database
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            String username = in.readLine();
            String password = in.readLine();
            System.out.println("User: " + username + " Pass: " + password);
            out.println("AUTHENTICATED");

            // TODO Need to add database interaction to check username and password and then create a player instance

            serverThread.addPlayer(new Player(username, clientSocket));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
