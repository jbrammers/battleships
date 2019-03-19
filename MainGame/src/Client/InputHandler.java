package Client;

import GUI.DataStore;
import GUI.MainGameController;
import GUI.PaneNavigator;
import javafx.application.Platform;

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
        final String message;
        if (in.contains(" ")) {
            identifier = in.substring(0, in.indexOf(" "));
            message = in.substring(in.indexOf(" ") + 1);
        } else {
            identifier = in;
            message = null;
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
                MainGameController ctrl = (MainGameController) DataStore.getData().getObject("main game");
                Platform.runLater(() -> {
                    ctrl.printReceivedMessage(message);
                });
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
