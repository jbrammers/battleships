package Client;

import GUI.DataStore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {
    private int portNumber = 3000;
    private boolean loggedIn = false;
    private Socket client;
    private BufferedReader input;
    private PrintWriter output;

    public Client(){}


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

            InputHandler handler = new InputHandler(client, input, output);

            // Listens for inputs whilst open
            while (!client.isClosed()) {
                String nextLine;
                while ((nextLine = input.readLine()) != null) {
                    handler.handle(nextLine);
                }
                output.flush();
            }

        } catch (IOException e) {
            System.out.println("Connection failed to server. Please try again.");
            e.printStackTrace();
            Thread thread = (Thread) DataStore.getData().getObject("gui thread");
            thread.interrupt();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean logIn(String username, String password) throws Exception {


        int counter = 0;

        while (!loggedIn && counter <= 3) {
            output.println("login");
            output.println(username);
            output.println(password); // password goes here
            String in = input.readLine();

            if (in.equals("AUTHENTICATED")) {
                System.out.println("Authentication successful!");
                loggedIn = true;
            } else if (in.equals("Connection established, authentication in progress.")) {
                System.out.println(in);
            } else {
                counter++;
                Thread.sleep(200);
                // TODO request username + password again
            }
        }

        return loggedIn;
    }

    public boolean newUser(String username, String password) {
        output.println("newuser");
        output.println(username);
        output.println(password);

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
     * @param out String to be sent to the server
     */
    public void send(String out) {
        output.println(out);
    }

    public Socket getSocket() { return client; }
}
