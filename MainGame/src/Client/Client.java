package Client;

import javax.net.ssl.SSLSocketFactory;
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

    public static void main(String args[]) throws InterruptedException {
        try {
            // Open connection on port number, throws exception if not found
            SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
            Socket client = ssf.createSocket("localhost", portNumber);
            client.setKeepAlive(true);

            // Prints connection established message
            input = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));

            // Output client
            output = new PrintWriter(
                    client.getOutputStream(), true);

            logIn();

            if (!loggedIn) return;

//            ActionListener sendMessage = new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    output.println();
//                }
//            };
            // TODO add an action listener for the messenger here

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

    private static void logIn() throws Exception {
        String username = "player" + String.format(" %.0f", Math.random()*100); // TODO request username and password here (and again lower down)
//        String username = requestUsername();
//        String password = requestPassword();

        int counter = 0;

        while (!loggedIn && counter <= 3) {
            output.println(username);
            output.println(""); // password goes here
            String in = input.readLine();

            if (in.equals("AUTHENTICATED")) {
                System.out.println("Authentication successful!");
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

}
