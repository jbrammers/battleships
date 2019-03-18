package Client;

import GUI.PaneNavigator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private static int portNumber = 3000;
    private static boolean loggedIn = false;
    private static BufferedReader input;
    private static PrintWriter output;
    private static String username;
    private static String password;

    public Client(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public void run() {
        try {
            // Open connection on port number, throws exception if not found
            Socket client = new Socket("localhost", portNumber);
            client.setKeepAlive(true);

            // Prints connection established message
            input = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));

            // Output client
            output = new PrintWriter(
                    client.getOutputStream(), true);

            logIn();

            if (!loggedIn) return;

            InputHandler handler = new InputHandler(client, input, output);

            // Listens for inputs whilst open
            while (!client.isClosed()) {
                String nextLine = input.readLine();
                if (nextLine == null) Thread.sleep(4000);
                else {
                    handler.handle(nextLine);
                }
            }

        } catch (IOException e) {
            System.out.println("Connection failed to server. Please try again.");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void logIn() throws Exception {

        int counter = 0;

        while (!loggedIn && counter <= 3) {
            output.println(username);
            output.println(password); // password goes here
            String in = input.readLine();

            if (in.equals("AUTHENTICATED")) {
                System.out.println("Authentication successful!");
                PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
                loggedIn = true;
            } else if (in.equals("Connection established, authentication in progress.")) {
                System.out.println(in);
                Thread.sleep(4000);
            } else {
                counter++;
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
    public static void send(String out) {
        output.println(out);
    }

}
