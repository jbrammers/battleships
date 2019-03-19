package Client;

import GUI.PaneNavigator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable {
    private int portNumber = 3000;
    private boolean loggedIn = false;
    private Socket client;
    private Scanner input;
    private PrintWriter output;

    public Client(){}


    public void start() {
        try {
            // Open connection on port number, throws exception if not found
            client = new Socket("localhost", portNumber);
            client.setKeepAlive(true);

            // Prints connection established message
            input = new Scanner(
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
                String nextLine = input.nextLine();
                if (nextLine == null) Thread.sleep(200);
                else {
                    handler.handle(nextLine);
                }
                output.flush();
            }

        } catch (IOException e) {
            System.out.println("Connection failed to server. Please try again.");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void logIn(String username, String password) throws Exception {


        int counter = 0;

        while (!loggedIn && counter <= 3) {
            output.println(username);
            output.println(password); // password goes here
            String in = input.nextLine();

            if (in.equals("AUTHENTICATED")) {
                System.out.println("Authentication successful!");
                PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
                loggedIn = true;
            } else if (in.equals("Connection established, authentication in progress.")) {
                System.out.println(in);
            } else {
                counter++;
                Thread.sleep(200);
                // TODO request username + password again
            }
        }

        if (counter>3) {
            System.out.println("Authentication failed, please try again.");

        } else {
            loggedIn = true;
        }
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
