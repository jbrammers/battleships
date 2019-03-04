package ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    private static int portNumber = 3000;

    public static void main(String args[]) {
        try {
                // Open connection on port number, throws exception if not found
                Socket client = new Socket("localhost", portNumber);

                // Prints connection established message
                BufferedReader input = new BufferedReader(
                        new InputStreamReader(client.getInputStream()));

                System.out.println(input.readLine());

                input.close();
                client.close();



        } catch (IOException e) {
            // If connection cannot be set up on port number, exception is caught, port number incremented and retried
            portNumber++;
            main(args);
        }
    }

}
