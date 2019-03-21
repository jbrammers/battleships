package Client;

import GUI.DataStore;
import GUI.MainGameController;
import GUI.PaneNavigator;
import GUI.PopUpMessage;
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
                Platform.runLater(() -> PaneNavigator.loadPane(PaneNavigator.LOGIN));
                break;

            case "MESSAGE":
                MainGameController ctrl = (MainGameController) DataStore.getData().getObject("main game");
                Platform.runLater(() -> ctrl.printReceivedMessage(message));
                break;

            case "GAME":
                if (message.startsWith("REPLY")) {
                    ctrl = (MainGameController) DataStore.getData().getObject("main game");
                    Platform.runLater(() -> ctrl.printReceivedMessage(message.substring(5)));
                } else if (message.startsWith("END")) {
                    Platform.runLater(() -> PopUpMessage.popUp(message.substring(4)));
                } else if (message.startsWith("ATTEMPT_RESULT")) {
                    String[] temp = message.split(" ");
                    ctrl = (MainGameController) DataStore.getData().getObject("main game");
                    Platform.runLater(() -> ctrl.outgoingAttempt(temp[1], temp[2]));

                } else {
                    Gameboard gameboard = (Gameboard) DataStore.getData().getObject("gameboard");
                    String reply = gameboard.attempt(message);

                    if (reply==null) {
                        out.println("SYSTEM noattempt");
                        break;
                    }
                    final String displayMessage;


                    if (!gameboard.endTurnCheck()) {
                        out.println("GAME END Final ship sunk. You have won good job!");
                        displayMessage = "Your final ship was sunk! Unlucky.";
                        Platform.runLater(() -> PopUpMessage.popUp(displayMessage));
                        out.println("SYSTEM gameEnd");
                    } else {

                        displayMessage = "Opponent fired at " + message + " and it was a " + reply.toLowerCase();

                        ctrl = (MainGameController) DataStore.getData().getObject("main game");
                        Platform.runLater(() -> ctrl.printReceivedMessage(displayMessage));
                        Platform.runLater(() -> ctrl.incomingAttempt(message, reply));
                        Client client = (Client) DataStore.getData().getObject("client");
                        client.send("GAME ATTEMPT_RESULT " + message + " " + reply);
                        out.println("GAME REPLY " + reply);
                        out.println("SYSTEM turnchange");
                    }


                }
                break;

            case "SYSTEM":
                if (message.equals("yourturn")) {
                    System.out.println(message);
                    ctrl = (MainGameController) DataStore.getData().getObject("main game");
                    ctrl.setTurn(true);
                    Platform.runLater(() ->ctrl.setTurnLabel(message));
                } else if (message.equals("theirturn")) {
                    System.out.println(message);
                    ctrl = (MainGameController) DataStore.getData().getObject("main game");
                    ctrl.setTurn(false);
                    Platform.runLater(() ->ctrl.setTurnLabel(message));
                } else if (message.equals("nullattempt")) {
                    Platform.runLater(() -> PopUpMessage.errorMessage("Something went wrong when firing at this co-ordinate. Please try again."));
                }
                break;

            default:
                System.out.println(in);
                break;
        }
        out.flush();
    }
}
