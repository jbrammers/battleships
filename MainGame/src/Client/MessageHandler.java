package Client;

import GUI.DataStore;
import GUI.MainGameController;
import GUI.PaneNavigator;
import GUI.PopUpMessage;
import Game.Gameboard;
import javafx.application.Platform;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MessageHandler {
    private Socket client;
    private BufferedReader in;
    private PrintWriter out;

    public MessageHandler(Socket client, BufferedReader in, PrintWriter out) {
        this.client = client;
        this.out = out;
        this.in = in;
    }

    /**
     * Given an input this method will determine the type of message being recieved and
     * perform the appropriate response.
     * @param in the string to be processed
     */
    public void handle(String in){
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
                if (message == null) {
                    System.out.println("Client pinged by server");
                    out.println("ECHO REPLY");
                } else {
                    System.out.println("Ping reply recieved at " + System.currentTimeMillis());
                }
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

                    if (gameboard.endTurnCheck()) {
                        out.println("GAME END Final ship sunk. Congratulations, you've won!");
                        displayMessage = "Your final ship was sunk! Better luck next time!.";
                        Platform.runLater(() -> PopUpMessage.popUp(displayMessage));
                        out.println("SYSTEM gameEnd");
                    }
                    else if (reply.equals("DESTROYED")) {
                        displayMessage = "Opponent fired at " + message + ": SHIP DESTROYED!";

                        ctrl = (MainGameController) DataStore.getData().getObject("main game");
                        Platform.runLater(() -> ctrl.printReceivedMessage(displayMessage));
                        Platform.runLater(() -> ctrl.incomingAttempt(message, reply));
                        Client client = (Client) DataStore.getData().getObject("client");
                        client.send("GAME ATTEMPT_RESULT " + message + " " + reply);
                        out.println("GAME REPLY YOU SUNK MY BATTLESHIP");
                        out.println("SYSTEM turnchange");
                    }
                    else {

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
                switch (message) {
                    case "yourturn":
                        System.out.println(message);
                        ctrl = (MainGameController) DataStore.getData().getObject("main game");
                        ctrl.setTurn(true);
                        Platform.runLater(() -> ctrl.setTurnLabel(message));
                        break;
                    case "theirturn":
                        System.out.println(message);
                        ctrl = (MainGameController) DataStore.getData().getObject("main game");
                        ctrl.setTurn(false);
                        Platform.runLater(() -> ctrl.setTurnLabel(message));
                        break;
                    case "nullattempt":
                        Platform.runLater(() -> PopUpMessage.errorMessage("Something went wrong when firing at this co-ordinate. Please try again."));
                        break;
                }
                break;

            default:
                System.out.println(in);
                break;
        }
        out.flush();
    }
}
