package ServerClient;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    private static int portNumber = 3000;

    public static void main(String args[]) {
        try {
            // Open connection on port number, throws exception if not found
            Socket client = new Socket("localhost", portNumber);

            System.out.println("Connection Made");

            DataInputStream dis = new DataInputStream(client.getInputStream());

            System.out.println(dis.readByte());

            dis.close();
            client.close();
            System.out.println("Successfully closed");

        } catch (IOException e) {
            // If connection cannot be set up on port number, exception is caught, port number incremented and retried
            portNumber++;
            main(args);
        }
    }

}
