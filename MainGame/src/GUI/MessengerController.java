package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.util.ArrayList;


public class MessengerController {

    @FXML
    static Label messageDisplay;

    @FXML
    static TextField messageField;

    @FXML
    static AnchorPane anchorPane;

    @FXML
    public static Button sendButton;



    public static ArrayList<String> messageLog = new ArrayList<String>();
    public static String message = "";
    public static int messageCount = 0;

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

    }

    public static void printReceivedMessage(String message) {
        double j = 1;
        if (message.toCharArray().length > 30) {
            for (int i = 0; i < message.toCharArray().length; i= i+30) {
                j++;
            }

            messageLog.add(message);
            messageDisplay.setPrefHeight(messageDisplay.getPrefHeight() + 17 * j);
            anchorPane.setPrefHeight(messageDisplay.getPrefHeight());
            messageDisplay.setText(messageLog.get(messageCount) + "\n");
            messageCount++;
        }
        else {
            messageLog.add(message);
            messageDisplay.setPrefHeight(messageDisplay.getPrefHeight() + 17);
            anchorPane.setPrefHeight(messageDisplay.getPrefHeight());
            messageDisplay.setText(messageLog.get(messageCount) + "\n");
            messageCount++;
        }
    }

    public static String getMostRecentMessage() {
        return messageLog.get(messageCount);
    }
}
