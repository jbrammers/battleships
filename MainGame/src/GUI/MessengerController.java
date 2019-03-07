package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;


public class MessengerController {

    @FXML
    Label messageDisplay;

    @FXML
    TextField messageField;

    @FXML
    AnchorPane anchorPane;

    public ArrayList<String> messageLog = new ArrayList<String>();
    public String message = "";
    public int messageCount = 0;

    /*
    *
    * */
    public void handleSendButtonAction() {

        if (messageField.getText().equals("END")) {
            PaneNavigator.loadPane(PaneNavigator.LOGIN);
        }
        if (messageField.getCharacters().length() > 30) {
            /*TODO get username and insert here*/
            message += "\nUSER1: ";
            double j = 1;
            for (int i = 0; i < messageField.getCharacters().length(); i++) {

                if (i%30 == 0 && i!=0) {
                    message += "-\n" ;
                    j++;
                }
                message += messageField.getCharacters().charAt(i);
            }
            messageLog.add(message);
            messageDisplay.setPrefHeight(messageDisplay.getPrefHeight() + 17*j);
            anchorPane.setPrefHeight(messageDisplay.getPrefHeight());
            messageDisplay.setText(messageLog.get(messageCount) + "\n");
            messageField.setText("");
            messageCount++;

        }
        else {
            message += /*TODO get username and insert here*/ "\nUSER1: " + messageField.getText();
            messageLog.add(message);
            messageDisplay.setPrefHeight(messageDisplay.getPrefHeight() + 17);
            anchorPane.setPrefHeight(messageDisplay.getPrefHeight());
            messageDisplay.setText(messageLog.get(messageCount) + "\n");
            messageField.setText("");
            messageCount++;
        }

    }

}
