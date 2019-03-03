package ServerClient;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static int portNumber = 3000;

    public static void main(String args[]) {
        try {
            // Set up connection on port number
            ServerSocket server = new ServerSocket(portNumber);

            Socket client = server.accept();
            System.out.println("Connection Made");

            DataOutputStream dos = new DataOutputStream(client.getOutputStream());

            dos.writeBytes("Hi");
            System.out.println("Message sent");

            dos.close();
            client.close();
            server.close();

        } catch (IOException e) {
            // If connection cannot be set up on port number, exception is caught, port number incremented and retried
            portNumber++;
            main(args);
        }
    }
}
