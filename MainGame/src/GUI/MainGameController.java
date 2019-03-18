package GUI;

import Game.Gameboard;
import Game.Ship;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;


public class MainGameController {

    @FXML
    Label scoreLabel;
    @FXML
    Button fireButton;
    @FXML
    Label turnLabel;
    @FXML
    ChoiceBox weaponList;
    @FXML
    Button shopButton;
    @FXML
    Label messageDisplay;
    @FXML
    TextField messageField;
    @FXML
    AnchorPane anchorPane;
    @FXML
    Button sendButton;
    @FXML
    Rectangle ownShipsA1;
    @FXML
    Rectangle ownShipsA2;
    @FXML
    Rectangle ownShipsA3;
    @FXML
    Rectangle ownShipsA4;
    @FXML
    Rectangle ownShipsA5;
    @FXML
    Rectangle ownShipsA6;
    @FXML
    Rectangle ownShipsA7;
    @FXML
    Rectangle ownShipsA8;
    @FXML
    Rectangle ownShipsA9;
    @FXML
    Rectangle ownShipsA10;
    @FXML
    Rectangle ownShipsB1;
    @FXML
    Rectangle ownShipsB2;
    @FXML
    Rectangle ownShipsB3;
    @FXML
    Rectangle ownShipsB4;
    @FXML
    Rectangle ownShipsB5;
    @FXML
    Rectangle ownShipsB6;
    @FXML
    Rectangle ownShipsB7;
    @FXML
    Rectangle ownShipsB8;
    @FXML
    Rectangle ownShipsB9;
    @FXML
    Rectangle ownShipsB10;
    @FXML
    Rectangle ownShipsC1;
    @FXML
    Rectangle ownShipsC2;
    @FXML
    Rectangle ownShipsC3;
    @FXML
    Rectangle ownShipsC4;
    @FXML
    Rectangle ownShipsC5;
    @FXML
    Rectangle ownShipsC6;
    @FXML
    Rectangle ownShipsC7;
    @FXML
    Rectangle ownShipsC8;
    @FXML
    Rectangle ownShipsC9;
    @FXML
    Rectangle ownShipsC10;
    @FXML
    Rectangle ownShipsD1;
    @FXML
    Rectangle ownShipsD2;
    @FXML
    Rectangle ownShipsD3;
    @FXML
    Rectangle ownShipsD4;
    @FXML
    Rectangle ownShipsD5;
    @FXML
    Rectangle ownShipsD6;
    @FXML
    Rectangle ownShipsD7;
    @FXML
    Rectangle ownShipsD8;
    @FXML
    Rectangle ownShipsD9;
    @FXML
    Rectangle ownShipsD10;
    @FXML
    Rectangle ownShipsE1;
    @FXML
    Rectangle ownShipsE2;
    @FXML
    Rectangle ownShipsE3;
    @FXML
    Rectangle ownShipsE4;
    @FXML
    Rectangle ownShipsE5;
    @FXML
    Rectangle ownShipsE6;
    @FXML
    Rectangle ownShipsE7;
    @FXML
    Rectangle ownShipsE8;
    @FXML
    Rectangle ownShipsE9;
    @FXML
    Rectangle ownShipsE10;
    @FXML
    Rectangle ownShipsF1;
    @FXML
    Rectangle ownShipsF2;
    @FXML
    Rectangle ownShipsF3;
    @FXML
    Rectangle ownShipsF4;
    @FXML
    Rectangle ownShipsF5;
    @FXML
    Rectangle ownShipsF6;
    @FXML
    Rectangle ownShipsF7;
    @FXML
    Rectangle ownShipsF8;
    @FXML
    Rectangle ownShipsF9;
    @FXML
    Rectangle ownShipsF10;
    @FXML
    Rectangle ownShipsG1;
    @FXML
    Rectangle ownShipsG2;
    @FXML
    Rectangle ownShipsG3;
    @FXML
    Rectangle ownShipsG4;
    @FXML
    Rectangle ownShipsG5;
    @FXML
    Rectangle ownShipsG6;
    @FXML
    Rectangle ownShipsG7;
    @FXML
    Rectangle ownShipsG8;
    @FXML
    Rectangle ownShipsG9;
    @FXML
    Rectangle ownShipsG10;
    @FXML
    Rectangle ownShipsH1;
    @FXML
    Rectangle ownShipsH2;
    @FXML
    Rectangle ownShipsH3;
    @FXML
    Rectangle ownShipsH4;
    @FXML
    Rectangle ownShipsH5;
    @FXML
    Rectangle ownShipsH6;
    @FXML
    Rectangle ownShipsH7;
    @FXML
    Rectangle ownShipsH8;
    @FXML
    Rectangle ownShipsH9;
    @FXML
    Rectangle ownShipsH10;
    @FXML
    Rectangle ownShipsI1;
    @FXML
    Rectangle ownShipsI2;
    @FXML
    Rectangle ownShipsI3;
    @FXML
    Rectangle ownShipsI4;
    @FXML
    Rectangle ownShipsI5;
    @FXML
    Rectangle ownShipsI6;
    @FXML
    Rectangle ownShipsI7;
    @FXML
    Rectangle ownShipsI8;
    @FXML
    Rectangle ownShipsI9;
    @FXML
    Rectangle ownShipsI10;
    @FXML
    Rectangle ownShipsJ1;
    @FXML
    Rectangle ownShipsJ2;
    @FXML
    Rectangle ownShipsJ3;
    @FXML
    Rectangle ownShipsJ4;
    @FXML
    Rectangle ownShipsJ5;
    @FXML
    Rectangle ownShipsJ6;
    @FXML
    Rectangle ownShipsJ7;
    @FXML
    Rectangle ownShipsJ8;
    @FXML
    Rectangle ownShipsJ9;
    @FXML
    Rectangle ownShipsJ10;

    private ArrayList<Rectangle> initiateRectangleArrayList() {
        ArrayList<Rectangle> ownShipsRectangles = new ArrayList<>();
        ownShipsRectangles.add(ownShipsA1);
        ownShipsRectangles.add(ownShipsA2);
        ownShipsRectangles.add(ownShipsA3);
        ownShipsRectangles.add(ownShipsA4);
        ownShipsRectangles.add(ownShipsA5);
        ownShipsRectangles.add(ownShipsA6);
        ownShipsRectangles.add(ownShipsA7);
        ownShipsRectangles.add(ownShipsA8);
        ownShipsRectangles.add(ownShipsA9);
        ownShipsRectangles.add(ownShipsA10);
        ownShipsRectangles.add(ownShipsB1);
        ownShipsRectangles.add(ownShipsB2);
        ownShipsRectangles.add(ownShipsB3);
        ownShipsRectangles.add(ownShipsB4);
        ownShipsRectangles.add(ownShipsB5);
        ownShipsRectangles.add(ownShipsB6);
        ownShipsRectangles.add(ownShipsB7);
        ownShipsRectangles.add(ownShipsB8);
        ownShipsRectangles.add(ownShipsB9);
        ownShipsRectangles.add(ownShipsB10);
        ownShipsRectangles.add(ownShipsC1);
        ownShipsRectangles.add(ownShipsC2);
        ownShipsRectangles.add(ownShipsC3);
        ownShipsRectangles.add(ownShipsC4);
        ownShipsRectangles.add(ownShipsC5);
        ownShipsRectangles.add(ownShipsC6);
        ownShipsRectangles.add(ownShipsC7);
        ownShipsRectangles.add(ownShipsC8);
        ownShipsRectangles.add(ownShipsC9);
        ownShipsRectangles.add(ownShipsC10);
        ownShipsRectangles.add(ownShipsD1);
        ownShipsRectangles.add(ownShipsD2);
        ownShipsRectangles.add(ownShipsD3);
        ownShipsRectangles.add(ownShipsD4);
        ownShipsRectangles.add(ownShipsD5);
        ownShipsRectangles.add(ownShipsD6);
        ownShipsRectangles.add(ownShipsD7);
        ownShipsRectangles.add(ownShipsD8);
        ownShipsRectangles.add(ownShipsD9);
        ownShipsRectangles.add(ownShipsD10);
        ownShipsRectangles.add(ownShipsE1);
        ownShipsRectangles.add(ownShipsE2);
        ownShipsRectangles.add(ownShipsE3);
        ownShipsRectangles.add(ownShipsE4);
        ownShipsRectangles.add(ownShipsE5);
        ownShipsRectangles.add(ownShipsE6);
        ownShipsRectangles.add(ownShipsE7);
        ownShipsRectangles.add(ownShipsE8);
        ownShipsRectangles.add(ownShipsE9);
        ownShipsRectangles.add(ownShipsE10);
        ownShipsRectangles.add(ownShipsF1);
        ownShipsRectangles.add(ownShipsF2);
        ownShipsRectangles.add(ownShipsF3);
        ownShipsRectangles.add(ownShipsF4);
        ownShipsRectangles.add(ownShipsF5);
        ownShipsRectangles.add(ownShipsF6);
        ownShipsRectangles.add(ownShipsF7);
        ownShipsRectangles.add(ownShipsF8);
        ownShipsRectangles.add(ownShipsF9);
        ownShipsRectangles.add(ownShipsF10);
        ownShipsRectangles.add(ownShipsG1);
        ownShipsRectangles.add(ownShipsG2);
        ownShipsRectangles.add(ownShipsG3);
        ownShipsRectangles.add(ownShipsG4);
        ownShipsRectangles.add(ownShipsG5);
        ownShipsRectangles.add(ownShipsG6);
        ownShipsRectangles.add(ownShipsG7);
        ownShipsRectangles.add(ownShipsG8);
        ownShipsRectangles.add(ownShipsG9);
        ownShipsRectangles.add(ownShipsG10);
        ownShipsRectangles.add(ownShipsH1);
        ownShipsRectangles.add(ownShipsH2);
        ownShipsRectangles.add(ownShipsH3);
        ownShipsRectangles.add(ownShipsH4);
        ownShipsRectangles.add(ownShipsH5);
        ownShipsRectangles.add(ownShipsH6);
        ownShipsRectangles.add(ownShipsH7);
        ownShipsRectangles.add(ownShipsH8);
        ownShipsRectangles.add(ownShipsH9);
        ownShipsRectangles.add(ownShipsH10);
        ownShipsRectangles.add(ownShipsI1);
        ownShipsRectangles.add(ownShipsI2);
        ownShipsRectangles.add(ownShipsI3);
        ownShipsRectangles.add(ownShipsI4);
        ownShipsRectangles.add(ownShipsI5);
        ownShipsRectangles.add(ownShipsI6);
        ownShipsRectangles.add(ownShipsI7);
        ownShipsRectangles.add(ownShipsI8);
        ownShipsRectangles.add(ownShipsI9);
        ownShipsRectangles.add(ownShipsI10);
        ownShipsRectangles.add(ownShipsJ1);
        ownShipsRectangles.add(ownShipsJ2);
        ownShipsRectangles.add(ownShipsJ3);
        ownShipsRectangles.add(ownShipsJ4);
        ownShipsRectangles.add(ownShipsJ5);
        ownShipsRectangles.add(ownShipsJ6);
        ownShipsRectangles.add(ownShipsJ7);
        ownShipsRectangles.add(ownShipsJ8);
        ownShipsRectangles.add(ownShipsJ9);
        ownShipsRectangles.add(ownShipsJ10);
        return ownShipsRectangles;
    }


    public static ArrayList<String> messageLog = new ArrayList<>();
    public static String message = "";
    public static int messageCount = 0;
    public String incomingMessage;
    public static Gameboard gameboard = ShipPlacementController.gameboard;

    public void initialiseOwnShips(Gameboard gameboard) {

        ArrayList<Rectangle> ownShipsRectangles = initiateRectangleArrayList();

        for (Ship ship : gameboard.getBoard()) {
            ArrayList<String> rows = new ArrayList<>();
            ArrayList<String> columns = new ArrayList<>();
            for (String location : ship.getLocation()) {
                String[] inter = location.split("_");
                String[] rowsColumns = inter[0].split("!");
                rows.add(rowsColumns[0]);
                columns.add(rowsColumns[1]);
            }
            if (ship.getType().equals("Zeus")) {
                for (Rectangle rect : ownShipsRectangles) {
                    for (int i = 0; i < 2; i++) {
                        if (rect.getId().contains(rows.get(i)) && rect.getId().contains(columns.get(i))) {
                            rect.setFill(Color.GREEN);
                        }
                    }
                }
            }
            if (ship.getType().equals("Sledgehammer")) {
                for (Rectangle rect : ownShipsRectangles) {
                    for (int i = 0; i < 3; i++) {
                        if (rect.getId().contains(rows.get(i)) && rect.getId().contains(columns.get(i))) {
                            rect.setFill(Color.BLUE);
                        }
                    }
                }
            }
            if (ship.getType().equals("Stellar")) {
                for (Rectangle rect : ownShipsRectangles) {
                    for (int i = 0; i < 4; i++) {
                        if (rect.getId().contains(rows.get(i)) && rect.getId().contains(columns.get(i))) {
                            rect.setFill(Color.YELLOW);
                        }
                    }
                }
            }
            if (ship.getType().equals("Ajax")) {
                for (Rectangle rect : ownShipsRectangles) {
                    for (int i = 0; i < 5; i++) {
                        if (rect.getId().contains(rows.get(i)) && rect.getId().contains(columns.get(i))) {
                            rect.setFill(Color.RED);
                        }
                    }
                }
            }
        }
    }

    public void handleSendButtonAction() {

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


    public void printReceivedMessage(String incomingMessage) {
        this.incomingMessage = incomingMessage;
        double j = 1;
        if (incomingMessage.toCharArray().length > 30) {
            for (int i = 0; i < incomingMessage.toCharArray().length; i = i + 30) {
                j++;
            }

            messageLog.add(incomingMessage);
            messageDisplay.setPrefHeight(messageDisplay.getPrefHeight() + 17 * j);
            anchorPane.setPrefHeight(messageDisplay.getPrefHeight());
            messageDisplay.setText(messageLog.get(messageCount) + "\n");
            messageCount++;
        } else {
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

    public void handleGridButtonPressA1() {}
    public void handleGridButtonPressA2() {}
    public void handleGridButtonPressA3() {}
    public void handleGridButtonPressA4() {}
    public void handleGridButtonPressA5() {}
    public void handleGridButtonPressA6() {}
    public void handleGridButtonPressA7() {}
    public void handleGridButtonPressA8() {}
    public void handleGridButtonPressA9() {}
    public void handleGridButtonPressA10() {}
    public void handleGridButtonPressB1() {}
    public void handleGridButtonPressB2() {}
    public void handleGridButtonPressB3() {}
    public void handleGridButtonPressB4() {}
    public void handleGridButtonPressB5() {}
    public void handleGridButtonPressB6() {}
    public void handleGridButtonPressB7() {}
    public void handleGridButtonPressB8() {}
    public void handleGridButtonPressB9() {}
    public void handleGridButtonPressB10() {}
    public void handleGridButtonPressC1() {}
    public void handleGridButtonPressC2() {}
    public void handleGridButtonPressC3() {}
    public void handleGridButtonPressC4() {}
    public void handleGridButtonPressC5() {}
    public void handleGridButtonPressC6() {}
    public void handleGridButtonPressC7() {}
    public void handleGridButtonPressC8() {}
    public void handleGridButtonPressC9() {}
    public void handleGridButtonPressC10() {}
    public void handleGridButtonPressD1() {}
    public void handleGridButtonPressD2() {}
    public void handleGridButtonPressD3() {}
    public void handleGridButtonPressD4() {}
    public void handleGridButtonPressD5() {}
    public void handleGridButtonPressD6() {}
    public void handleGridButtonPressD7() {}
    public void handleGridButtonPressD8() {}
    public void handleGridButtonPressD9() {}
    public void handleGridButtonPressD10() {}
    public void handleGridButtonPressE1() {}
    public void handleGridButtonPressE2() {}
    public void handleGridButtonPressE3() {}
    public void handleGridButtonPressE4() {}
    public void handleGridButtonPressE5() {}
    public void handleGridButtonPressE6() {}
    public void handleGridButtonPressE7() {}
    public void handleGridButtonPressE8() {}
    public void handleGridButtonPressE9() {}
    public void handleGridButtonPressE10() {}
    public void handleGridButtonPressF1() {}
    public void handleGridButtonPressF2() {}
    public void handleGridButtonPressF3() {}
    public void handleGridButtonPressF4() {}
    public void handleGridButtonPressF5() {}
    public void handleGridButtonPressF6() {}
    public void handleGridButtonPressF7() {}
    public void handleGridButtonPressF8() {}
    public void handleGridButtonPressF9() {}
    public void handleGridButtonPressF10() {}
    public void handleGridButtonPressG1() {}
    public void handleGridButtonPressG2() {}
    public void handleGridButtonPressG3() {}
    public void handleGridButtonPressG4() {}
    public void handleGridButtonPressG5() {}
    public void handleGridButtonPressG6() {}
    public void handleGridButtonPressG7() {}
    public void handleGridButtonPressG8() {}
    public void handleGridButtonPressG9() {}
    public void handleGridButtonPressG10() {}
    public void handleGridButtonPressH1() {}
    public void handleGridButtonPressH2() {}
    public void handleGridButtonPressH3() {}
    public void handleGridButtonPressH4() {}
    public void handleGridButtonPressH5() {}
    public void handleGridButtonPressH6() {}
    public void handleGridButtonPressH7() {}
    public void handleGridButtonPressH8() {}
    public void handleGridButtonPressH9() {}
    public void handleGridButtonPressH10() {}
    public void handleGridButtonPressI1() {}
    public void handleGridButtonPressI2() {}
    public void handleGridButtonPressI3() {}
    public void handleGridButtonPressI4() {}
    public void handleGridButtonPressI5() {}
    public void handleGridButtonPressI6() {}
    public void handleGridButtonPressI7() {}
    public void handleGridButtonPressI8() {}
    public void handleGridButtonPressI9() {}
    public void handleGridButtonPressI10() {}
    public void handleGridButtonPressJ1() {}
    public void handleGridButtonPressJ2() {}
    public void handleGridButtonPressJ3() {}
    public void handleGridButtonPressJ4() {}
    public void handleGridButtonPressJ5() {}
    public void handleGridButtonPressJ6() {}
    public void handleGridButtonPressJ7() {}
    public void handleGridButtonPressJ8() {}
    public void handleGridButtonPressJ9() {}
    public void handleGridButtonPressJ10() {}

    public void handleFireButtonAction(ActionEvent actionEvent) {
    }

    public void handleShopButtonAction(ActionEvent actionEvent) {
    }
}
