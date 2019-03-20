package Client;

import GUI.DataStore;
import GUI.MainGameController;
import GUI.PaneNavigator;
import Game.Gameboard;
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
                Platform.runLater(() -> PaneNavigator.loadPane(PaneNavigator.STARTSCREEN));
                break;

            case "MESSAGE":
                MainGameController ctrl = (MainGameController) DataStore.getData().getObject("main game");
                Platform.runLater(() -> ctrl.printReceivedMessage(message));
                break;

            case "GAME":
                if (message.startsWith("REPLY")) {
                    ctrl = (MainGameController) DataStore.getData().getObject("main game");
                    Platform.runLater(() -> ctrl.printReceivedMessage(message.substring(5)));
                } else {
                    Gameboard gameboard = (Gameboard) DataStore.getData().getObject("gameboard");
                    String reply = null;
                    while (reply == null) {
                        reply = gameboard.attempt(message);
                    }
                    final String displayMessage;

                    if (gameboard.endTurnCheck()) {
                        out.println("GAME REPLY Final ship sunk. You have won good job!");
                        displayMessage = "Your final ship was sunk! Unlucky.";
                        out.println("SYSTEM gameEnd");
                    } else {
                        displayMessage = "Opponent fired at " + message + " and it was a " + reply.toLowerCase();
                        out.println("GAME REPLY " + reply);
                    }
                    ctrl = (MainGameController) DataStore.getData().getObject("main game");
                    Platform.runLater(() -> ctrl.printReceivedMessage(displayMessage));
                }
                break;

            case "SYSTEM":
                if (message.equals("yourturn")) {
                    ctrl = (MainGameController) DataStore.getData().getObject("main game");
                    ctrl.setTurn(true);
                } else if (message.equals("theirturn")) {
                    ctrl = (MainGameController) DataStore.getData().getObject("main game");
                    ctrl.setTurn(false);
                }
                break;

            default:
                System.out.println(in);
                break;
        }
        out.flush();
    }
}
