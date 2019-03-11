package ServerClient;

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

    public static void main(String args[]) throws InterruptedException {
        try {
            // Open connection on port number, throws exception if not found
            Socket client = new Socket("localhost", portNumber);
            client.setKeepAlive(true);

            // Prints connection established message
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));

            // Output client
            PrintWriter output = new PrintWriter(
                    client.getOutputStream(), true);

            logIn(output,input);

            if (!loggedIn) return;
            else System.out.println();

            ActionListener sendMessage = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    output.println();
                }
            };
            // TODO add an action listener for the messenger here

            // Listens for inputs whilst open
            while (!client.isClosed()) {
                String nextLine = input.readLine();
                if (nextLine == null) {Thread.sleep(4000);}
                else if (nextLine.startsWith("ECHO")) {
                    output.println("ECHO");
                }
                else if (nextLine.startsWith("CLIENT_CLOSE")) {
                    System.out.println("Closing service");
                    loggedIn = false;
                    client.close();
                }
                else {
                    System.out.println(nextLine);
                }
            }
        } catch (IOException e) {
            System.out.println("Connection failed to server. Please try again.");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void logIn(PrintWriter output, BufferedReader input) throws Exception {
        String username = "player" + String.format(" %.0f", Math.random()*100);
        int counter = 0;

        while (!loggedIn && counter <= 3) {
            output.println(username);
            output.println(""); // password goes here
            String in = input.readLine();

            if (in.equals("AUTHENTICATED")) {
                loggedIn = true;
            } else if (in.equals("Connection established, authentication in progress.")) {
                System.out.println(in);
            } else {
                counter++;
                // username = requestUsername;
            }
        }

        if (counter>3) {
            System.out.println("Authentication failed, please try again.");
        } else {
            loggedIn = true;
        }
    }

}
