package ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    private static int portNumber = 3000;
    private static boolean connected = true;

    public static void main(String args[]) throws InterruptedException {
        try {
            // Open connection on port number, throws exception if not found
            Socket client = new Socket("localhost", portNumber);
            client.setKeepAlive(true);

                // Prints connection established message
                BufferedReader input = new BufferedReader(
                        new InputStreamReader(client.getInputStream()));

            // Listens for inputs whilst open
            while (!client.isClosed()) {
                String nextLine = input.readLine();
                if (nextLine == null) {Thread.sleep(4000);}
                else if (nextLine.startsWith("CLIENT_CLOSE")) {
                    System.out.println("Closing service");
                    connected = false;
                    input.close();
                    client.close();
                }
                else {
                    System.out.println(nextLine);
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
