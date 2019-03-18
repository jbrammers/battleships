package GUI;

import Game.Gameboard;
import Game.Ship;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;


public class MainGameController {


    @FXML
    Label scoreLabel;
    @FXML
    Button fireButton;
    @FXML
    Label messageDisplay;
    @FXML
    TextField messageField;
    @FXML
    AnchorPane anchorPane;
    @FXML
    Button sendButton;

    public static ArrayList<String> messageLog = new ArrayList<String>();
    public static String message = "";
    public static int messageCount = 0;
    public static String incomingMessage;
    public static Gameboard gameboard = ShipPlacementController.gameboard;

    private void initialiseOwnShips(Gameboard gameboard) {
        for (Ship ship : gameboard.getBoard()) {

        }
    }
    @FXML
    public void handleSendButtonAction() {
        if (messageField.getText().equals("END")) {
            PaneNavigator.loadPane(PaneNavigator.LOGIN);
        }
        //cuts message down if it is particularly long
        if (messageField.getCharacters().length() > 30) {
            /*TODO get username and insert here*/
            message += "\nUSER1: ";
            double j = 1;
            for (int i = 0; i < messageField.getCharacters().length(); i++) {
                if (i % 30 == 0 && i != 0) {
                    message += "-\n";
                    j++;
                }
                message += messageField.getCharacters().charAt(i);
            }
            messageLog.add(message);
            //Scales the chat box for infinite chat length
            messageDisplay.setPrefHeight(messageDisplay.getPrefHeight() + 17 * j);
            anchorPane.setPrefHeight(messageDisplay.getPrefHeight());
            messageDisplay.setText(messageLog.get(messageCount) + "\n");
            messageField.setText("");
            messageCount++;
        } else {
            message += /*TODO get username and insert here*/ "\nUSER1: " + messageField.getText();
            messageLog.add(message);
            messageDisplay.setPrefHeight(messageDisplay.getPrefHeight() + 17);
            anchorPane.setPrefHeight(messageDisplay.getPrefHeight());
            messageDisplay.setText(messageLog.get(messageCount) + "\n");
            messageField.setText("");
            messageCount++;
        }


        //TODO send message to server to be printed on other players messenger
        Client.Client.send("MESSAGE " + message);

    }

    public void printReceivedMessage() {
        double j = 1;
        if (incomingMessage.toCharArray().length > 30) {
            for (int i = 0; i < incomingMessage.toCharArray().length; i= i+30) {
                j++;
            }

            messageLog.add(incomingMessage);
            messageDisplay.setPrefHeight(messageDisplay.getPrefHeight() + 17 * j);
            anchorPane.setPrefHeight(messageDisplay.getPrefHeight());
            messageDisplay.setText(messageLog.get(messageCount) + "\n");
            messageCount++;
        }
        else {
            messageLog.add(incomingMessage);
            messageDisplay.setPrefHeight(messageDisplay.getPrefHeight() + 17);
            anchorPane.setPrefHeight(messageDisplay.getPrefHeight());
            messageDisplay.setText(messageLog.get(messageCount) + "\n");
            messageCount++;
        }
    }

    public static String getMostRecentMessage() {
            return messageLog.get(messageCount);
        }



    public void handleGridButtonPressA1() {
    }

    public void handleGridButtonPressA2() {
    }

    public void handleGridButtonPressA3() {
    }

    public void handleGridButtonPressA4() {
    }

    public void handleGridButtonPressA5(){
    }

    public void handleGridButtonPressA6() {
    }

    public void handleGridButtonPressA7() {
    }

    public void handleGridButtonPressA8() {
    }

    public void handleGridButtonPressA9() {
    }

    public void handleGridButtonPressA10() {
    }

    public void handleGridButtonPressB1() {
    }

    public void handleGridButtonPressB2() {
    }

    public void handleGridButtonPressB3() {
    }

    public void handleGridButtonPressB4() {
    }

    public void handleGridButtonPressB5() {
    }

    public void handleGridButtonPressB6() {
    }

    public void handleGridButtonPressB7() {
    }

    public void handleGridButtonPressB8() {
    }

    public void handleGridButtonPressB9() {
    }

    public void handleGridButtonPressB10() {
    }

    public void handleGridButtonPressC1() {
    }

    public void handleGridButtonPressC2() {
    }

    public void handleGridButtonPressC3() {
    }

    public void handleGridButtonPressC4() {
    }

    public void handleGridButtonPressC5() {
    }

    public void handleGridButtonPressC6() {
    }

    public void handleGridButtonPressC7() {
    }

    public void handleGridButtonPressC8() {
    }

    public void handleGridButtonPressC9() {
    }

    public void handleGridButtonPressC10() {
    }

    public void handleGridButtonPressD1() {
    }

    public void handleGridButtonPressD2() {
    }

    public void handleGridButtonPressD3() {
    }

    public void handleGridButtonPressD4() {
    }

    public void handleGridButtonPressD5() {
    }

    public void handleGridButtonPressD6() {
    }

    public void handleGridButtonPressD7() {
    }

    public void handleGridButtonPressD8() {
    }

    public void handleGridButtonPressD9() {
    }

    public void handleGridButtonPressD10() {
    }

    public void handleGridButtonPressE1() {
    }

    public void handleGridButtonPressE2() {
    }

    public void handleGridButtonPressE3() {
    }

    public void handleGridButtonPressE4() {
    }

    public void handleGridButtonPressE5() {
    }

    public void handleGridButtonPressE6() {
    }

    public void handleGridButtonPressE7() {
    }

    public void handleGridButtonPressE8() {
    }

    public void handleGridButtonPressE9() {
    }

    public void handleGridButtonPressE10() {
    }

    public void handleGridButtonPressF1() {
    }

    public void handleGridButtonPressF2() {
    }

    public void handleGridButtonPressF3() {
    }

    public void handleGridButtonPressF4() {
    }

    public void handleGridButtonPressF5() {
    }

    public void handleGridButtonPressF6() {
    }

    public void handleGridButtonPressF7() {
    }

    public void handleGridButtonPressF8() {
    }

    public void handleGridButtonPressF9() {
    }

    public void handleGridButtonPressF10() {
    }

    public void handleGridButtonPressG1() {
    }

    public void handleGridButtonPressG2() {
    }

    public void handleGridButtonPressG3() {
    }

    public void handleGridButtonPressG4() {
    }

    public void handleGridButtonPressG5() {
    }

    public void handleGridButtonPressG6() {
    }

    public void handleGridButtonPressG7() {
    }

    public void handleGridButtonPressG8() {
    }

    public void handleGridButtonPressG9() {
    }

    public void handleGridButtonPressG10() {
    }

    public void handleGridButtonPressH1() {
    }

    public void handleGridButtonPressH2() {
    }

    public void handleGridButtonPressH3() {
    }

    public void handleGridButtonPressH4() {
    }

    public void handleGridButtonPressH5() {
    }

    public void handleGridButtonPressH6() {
    }

    public void handleGridButtonPressH7() {
    }

    public void handleGridButtonPressH8() {
    }

    public void handleGridButtonPressH9() {
    }

    public void handleGridButtonPressH10() {
    }

    public void handleGridButtonPressI1() {
    }

    public void handleGridButtonPressI2() {
    }

    public void handleGridButtonPressI3() {
    }

    public void handleGridButtonPressI4() {
    }

    public void handleGridButtonPressI5() {
    }

    public void handleGridButtonPressI6() {
    }

    public void handleGridButtonPressI7() {
    }

    public void handleGridButtonPressI8() {
    }

    public void handleGridButtonPressI9() {
    }

    public void handleGridButtonPressI10() {
    }

    public void handleGridButtonPressJ1() {
    }

    public void handleGridButtonPressJ2() {
    }

    public void handleGridButtonPressJ3() {
    }

    public void handleGridButtonPressJ4() {
    }

    public void handleGridButtonPressJ5() {
    }

    public void handleGridButtonPressJ6() {
    }

    public void handleGridButtonPressJ7() {
    }

    public void handleGridButtonPressJ8() {
    }

    public void handleGridButtonPressJ9() {
    }

    public void handleGridButtonPressJ10() {
    }

    public void handleSendButtonAction(ActionEvent actionEvent) {
    }

    public void handleFireButtonAction(ActionEvent actionEvent) {
    }

    public void handleShopButtonAction(ActionEvent actionEvent) {
    }
}
