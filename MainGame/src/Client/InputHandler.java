package Client;

import GUI.PaneNavigator;

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
        this.out = out;
        this.in = in;
    }

    public void handle(String in) throws IOException {
        String identifier;
        String message = null;
        if (in.contains(" ")) {
            identifier = in.substring(0, in.indexOf(" "));
            message = in.substring(in.indexOf(" ") + 1);
        } else {
            identifier = in;
        }
        switch (identifier) {
            case "ECHO":
                out.println("ECHO");
                break;

            case "CLIENT_CLOSE":
                System.out.println("Game ended, going back to start screen.");
                PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
                break;

            case "MESSAGE":
                System.out.println(message);
                break;

            case "GAME":
                System.out.println(message);
                break;

            default:
                System.out.println(in);
                break;
        }
        out.flush();
    }
}
