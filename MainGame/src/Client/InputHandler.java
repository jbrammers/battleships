package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class InputHandler {
    Socket client;
    BufferedReader in;
    PrintWriter out;

    public InputHandler(Socket client, BufferedReader in, PrintWriter out) {
        this.client = client;
        this.in = in;
        this.out = out;
    }

    public void handle(String in) throws IOException {
        switch (in) {
            case "ECHO":
            out.println("ECHO");

            case "CLIENT_CLOSE":
            System.out.println("Closing service");
            client.close();

            default:
            System.out.println(in);
        }
    }
}
