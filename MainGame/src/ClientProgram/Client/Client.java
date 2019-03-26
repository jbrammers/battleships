package ClientProgram.Client;

import ClientProgram.GUI.DataStore;
import ClientProgram.GUI.LoginController;
import javafx.application.Platform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

public class Client implements Runnable {
    private int portNumber = 3000;
    private boolean loggedIn = false;
    private Socket client;
    private BufferedReader input;
    private PrintWriter output;

    public Client() {
    }


    public void start() {
        try {
            // Open connection on port number, throws exception if not found
            client = new Socket("localhost", portNumber);
            client.setKeepAlive(true);

            // Prints connection established message
            input = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));

            // Output client
            output = new PrintWriter(
                    client.getOutputStream(), true);

        } catch (IOException e) {
            System.out.println("Connection failed to server. Please try again.");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ready() {
        try {
            output.println("SYSTEM ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        try {

            MessageHandler handler = new MessageHandler(client, input, output);

            // Listens for inputs whilst open
            while (!client.isClosed()) {
                String nextLine;
                while ((nextLine = input.readLine()) != null) {
                    handler.handle(nextLine);
                }
                output.flush();
            }

        } catch (SocketException e) {
            Platform.exit();
        } catch (IOException e) {
            System.out.println("Connection failed to server. Please try again.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean logIn(String username, String password) {


        output.println("login");
        output.println("LOGIN " + username);
        output.println("LOGIN " + password);


        boolean authFinished = false;

        while (!authFinished) {
            String in;
            try {
                in = input.readLine();
            } catch (IOException e) {
                in = "";
                e.printStackTrace();
            }

            if (in.equals("AUTHENTICATED")) {
                System.out.println("Authentication successful!");
                loggedIn = true;
                authFinished = true;
            } else if (in.equals("Connection established, authentication in progress.")) {
                Thread.yield();
            } else if (in.startsWith("AUTHFAIL")) {

                int type;
                if (in.substring(9).matches("USER")) {
                    type = 1;
                } else if (in.substring(9).matches("PASS")) {
                    type = 2;
                } else {
                    type = 3;
                }
                try {
                    LoginController ctrl = (LoginController) DataStore.getData().getObject("login");
                    ctrl.requestNewDetails(username, type);
                    authFinished = true;
                } catch (NullPointerException e) {
                    authFinished = true;
                }
            }
        }

        return loggedIn;
    }

    public boolean newUser(String username, String password) {
        output.println("newuser");
        output.println("LOGIN " + username);
        output.println("LOGIN " + password);

        String response;
        boolean auth = false;

        while (true) {
            try {
                response = input.readLine();
            } catch (IOException e) {
                response = "";
            }
            if (response.equals("NEWSUCCESS")) {
                auth = true;
                break;
            } else if (response.equals("NEWFAIL")) {
                break;
            }
        }

        return auth;
    }

    /**
     * Method used to send a message to the server whenever required. Messages should be prefixed with
     * their type otherwise they will simply get ignored
     *
     * @param out String to be sent to the server
     */
    public void send(String out) {
        output.println(out);
    }

    public Socket getClient() {
        return client;
    }

    public void endConnection() {
        try {
            client.close();
        } catch (IOException e) {
            System.out.println("Socket already closed.");
    }


}
}
