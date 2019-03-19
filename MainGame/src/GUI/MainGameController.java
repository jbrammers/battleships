package GUI;

import Client.Client;
import Game.Gameboard;
import Game.Ship;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class MainGameController implements javafx.fxml.Initializable {


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

    @FXML
    private Button A1;
    @FXML
    private Button A2;
    @FXML
    private Button A3;
    @FXML
    private Button A4;
    @FXML
    private Button A5;
    @FXML
    private Button A6;
    @FXML
    private Button A7;
    @FXML
    private Button A8;
    @FXML
    private Button A9;
    @FXML
    private Button A10;
    @FXML
    private Button B1;
    @FXML
    private Button B2;
    @FXML
    private Button B3;
    @FXML
    private Button B4;
    @FXML
    private Button B5;
    @FXML
    private Button B6;
    @FXML
    private Button B7;
    @FXML
    private Button B8;
    @FXML
    private Button B9;
    @FXML
    private Button B10;
    @FXML
    private Button C1;
    @FXML
    private Button C2;
    @FXML
    private Button C3;
    @FXML
    private Button C4;
    @FXML
    private Button C5;
    @FXML
    private Button C6;
    @FXML
    private Button C7;
    @FXML
    private Button C8;
    @FXML
    private Button C9;
    @FXML
    private Button C10;
    @FXML
    private Button D1;
    @FXML
    private Button D2;
    @FXML
    private Button D3;
    @FXML
    private Button D4;
    @FXML
    private Button D5;
    @FXML
    private Button D6;
    @FXML
    private Button D7;
    @FXML
    private Button D8;
    @FXML
    private Button D9;
    @FXML
    private Button D10;
    @FXML
    private Button E1;
    @FXML
    private Button E2;
    @FXML
    private Button E3;
    @FXML
    private Button E4;
    @FXML
    private Button E5;
    @FXML
    private Button E6;
    @FXML
    private Button E7;
    @FXML
    private Button E8;
    @FXML
    private Button E9;
    @FXML
    private Button E10;
    @FXML
    private Button F1;
    @FXML
    private Button F2;
    @FXML
    private Button F3;
    @FXML
    private Button F4;
    @FXML
    private Button F5;
    @FXML
    private Button F6;
    @FXML
    private Button F7;
    @FXML
    private Button F8;
    @FXML
    private Button F9;
    @FXML
    private Button F10;
    @FXML
    private Button G1;
    @FXML
    private Button G2;
    @FXML
    private Button G3;
    @FXML
    private Button G4;
    @FXML
    private Button G5;
    @FXML
    private Button G6;
    @FXML
    private Button G7;
    @FXML
    private Button G8;
    @FXML
    private Button G9;
    @FXML
    private Button G10;
    @FXML
    private Button H1;
    @FXML
    private Button H2;
    @FXML
    private Button H3;
    @FXML
    private Button H4;
    @FXML
    private Button H5;
    @FXML
    private Button H6;
    @FXML
    private Button H7;
    @FXML
    private Button H8;
    @FXML
    private Button H9;
    @FXML
    private Button H10;
    @FXML
    private Button I1;
    @FXML
    private Button I2;
    @FXML
    private Button I3;
    @FXML
    private Button I4;
    @FXML
    private Button I5;
    @FXML
    private Button I6;
    @FXML
    private Button I7;
    @FXML
    private Button I8;
    @FXML
    private Button I9;
    @FXML
    private Button I10;
    @FXML
    private Button J1;
    @FXML
    private Button J2;
    @FXML
    private Button J3;
    @FXML
    private Button J4;
    @FXML
    private Button J5;
    @FXML
    private Button J6;
    @FXML
    private Button J7;
    @FXML
    private Button J8;
    @FXML
    private Button J9;
    @FXML
    private Button J10;

    public static boolean turn;

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
                            if (columns.get(i).equals("1") && rect.getId().contains("10")) {

                            } else {
                                rect.setFill(Color.GREEN);
                            }
                        }
                    }
                }
            }
            if (ship.getType().equals("Sledgehammer")) {
                for (Rectangle rect : ownShipsRectangles) {
                    for (int i = 0; i < 3; i++) {
                        if (rect.getId().contains(rows.get(i)) && rect.getId().contains(columns.get(i))) {
                            if (columns.get(i).equals("1") && rect.getId().contains("10")) {

                            } else {
                                rect.setFill(Color.BLUE);
                            }
                        }
                    }
                }
            }
            if (ship.getType().equals("Stellar")) {
                for (Rectangle rect : ownShipsRectangles) {
                    for (int i = 0; i < 4; i++) {
                        if (rect.getId().contains(rows.get(i)) && rect.getId().contains(columns.get(i))) {
                            if (columns.get(i).equals("1") && rect.getId().contains("10")) {

                            } else {
                                rect.setFill(Color.YELLOW);
                            }
                        }
                    }
                }
            }
            if (ship.getType().equals("Ajax")) {
                for (Rectangle rect : ownShipsRectangles) {
                    for (int i = 0; i < 5; i++) {
                        if (rect.getId().contains(rows.get(i)) && rect.getId().contains(columns.get(i))) {
                            if (columns.get(i).equals("1") && rect.getId().contains("10")) {

                            } else {
                                rect.setFill(Color.RED);
                            }
                        }
                    }
                }
            }
        }
    }

    public void handleSendButtonAction() {

        //cuts message down if it is particularly long
        if (messageField.getCharacters().length() > 30) {
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
            message += "\n" + messageField.getText();
            messageLog.add(message);
            messageDisplay.setPrefHeight(messageDisplay.getPrefHeight() + 17);
            anchorPane.setPrefHeight(messageDisplay.getPrefHeight());
            messageDisplay.setText(messageLog.get(messageCount) + "\n");
            messageField.setText("");
            messageCount++;
        }


        //TODO send message to server to be printed on other players messenger
        Client.send("MESSAGE " + message);

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

    private boolean targetLocated = false;
    private Button currentlySelectedButton;
    private String currentLocationAttempt;

    public void targetLocationAction(String location, Button button) {
        currentLocationAttempt = location;
        if (!targetLocated) {
            targetLocated = true;
            currentlySelectedButton = button;
            button.setBackground(new Background(new BackgroundFill(Color.ORANGE, CornerRadii.EMPTY, Insets.EMPTY)));
        } else {
            currentlySelectedButton.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
            currentlySelectedButton = button;
            button.setBackground(new Background(new BackgroundFill(Color.ORANGE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleGridButtonPressA1() {
        targetLocationAction("A1", A1);
    }

    public void handleGridButtonPressA2() {
        targetLocationAction("A2", A2);
    }

    public void handleGridButtonPressA3() {
        targetLocationAction("A3", A3);
    }

    public void handleGridButtonPressA4() {
        targetLocationAction("A4", A4);
    }

    public void handleGridButtonPressA5() {
        targetLocationAction("A5", A5);
    }

    public void handleGridButtonPressA6() {
        targetLocationAction("A6", A6);
    }

    public void handleGridButtonPressA7() {
        targetLocationAction("A7", A7);
    }

    public void handleGridButtonPressA8() {
        targetLocationAction("A8", A8);
    }

    public void handleGridButtonPressA9() {
        targetLocationAction("A9", A9);
    }

    public void handleGridButtonPressA10() {
        targetLocationAction("A10", A10);
    }

    public void handleGridButtonPressB1() {
        targetLocationAction("B1", B1);
    }

    public void handleGridButtonPressB2() {
        targetLocationAction("B2", B2);
    }

    public void handleGridButtonPressB3() {
        targetLocationAction("B3", B3);
    }

    public void handleGridButtonPressB4() {
        targetLocationAction("B4", B4);
    }

    public void handleGridButtonPressB5() {
        targetLocationAction("B5", B5);
    }

    public void handleGridButtonPressB6() {
        targetLocationAction("B6", B6);
    }

    public void handleGridButtonPressB7() {
        targetLocationAction("B7", B7);
    }

    public void handleGridButtonPressB8() {
        targetLocationAction("B8", B8);
    }

    public void handleGridButtonPressB9() {
        targetLocationAction("B9", B9);
    }

    public void handleGridButtonPressB10() {
        targetLocationAction("B10", B10);
    }

    public void handleGridButtonPressC1() {
        targetLocationAction("C1", C1);
    }

    public void handleGridButtonPressC2() {
        targetLocationAction("C2", C2);
    }

    public void handleGridButtonPressC3() {
        targetLocationAction("C3", C3);
    }

    public void handleGridButtonPressC4() {
        targetLocationAction("C4", C4);
    }

    public void handleGridButtonPressC5() {
        targetLocationAction("C5", C5);
    }

    public void handleGridButtonPressC6() {
        targetLocationAction("C6", C6);
    }

    public void handleGridButtonPressC7() {
        targetLocationAction("C7", C7);
    }

    public void handleGridButtonPressC8() {
        targetLocationAction("C8", C8);
    }

    public void handleGridButtonPressC9() {
        targetLocationAction("C9", C9);
    }

    public void handleGridButtonPressC10() {
        targetLocationAction("C10", C10);
    }

    public void handleGridButtonPressD1() {
        targetLocationAction("D1", D1);
    }

    public void handleGridButtonPressD2() {
        targetLocationAction("D2", D2);
    }

    public void handleGridButtonPressD3() {
        targetLocationAction("D3", D3);
    }

    public void handleGridButtonPressD4() {
        targetLocationAction("D4", D4);
    }

    public void handleGridButtonPressD5() {
        targetLocationAction("D5", D5);
    }

    public void handleGridButtonPressD6() {
        targetLocationAction("D6", D6);
    }

    public void handleGridButtonPressD7() {
        targetLocationAction("D7", D7);
    }

    public void handleGridButtonPressD8() {
        targetLocationAction("D8", D8);
    }

    public void handleGridButtonPressD9() {
        targetLocationAction("D9", D9);
    }

    public void handleGridButtonPressD10() {
        targetLocationAction("D10", D10);
    }

    public void handleGridButtonPressE1() {
        targetLocationAction("E1", E1);
    }

    public void handleGridButtonPressE2() {
        targetLocationAction("E2", E2);
    }

    public void handleGridButtonPressE3() {
        targetLocationAction("E3", E3);
    }

    public void handleGridButtonPressE4() {
        targetLocationAction("E4", E4);
    }

    public void handleGridButtonPressE5() {
        targetLocationAction("E5", E5);
    }

    public void handleGridButtonPressE6() {
        targetLocationAction("E6", E6);
    }

    public void handleGridButtonPressE7() {
        targetLocationAction("E7", E7);
    }

    public void handleGridButtonPressE8() {
        targetLocationAction("E8", E8);
    }

    public void handleGridButtonPressE9() {
        targetLocationAction("E9", E9);
    }

    public void handleGridButtonPressE10() {
        targetLocationAction("E10", E10);
    }

    public void handleGridButtonPressF1() {
        targetLocationAction("F1", F1);
    }

    public void handleGridButtonPressF2() {
        targetLocationAction("F2", F2);
    }

    public void handleGridButtonPressF3() {
        targetLocationAction("F3", F3);
    }

    public void handleGridButtonPressF4() {
        targetLocationAction("F4", F4);
    }

    public void handleGridButtonPressF5() {
        targetLocationAction("F5", F5);
    }

    public void handleGridButtonPressF6() {
        targetLocationAction("F6", F6);
    }

    public void handleGridButtonPressF7() {
        targetLocationAction("F7", F7);
    }

    public void handleGridButtonPressF8() {
        targetLocationAction("F8", F8);
    }

    public void handleGridButtonPressF9() {
        targetLocationAction("F9", F9);
    }

    public void handleGridButtonPressF10() {
        targetLocationAction("F10", F10);
    }

    public void handleGridButtonPressG1() {
        targetLocationAction("G1", G1);
    }

    public void handleGridButtonPressG2() {
        targetLocationAction("G2", G2);
    }

    public void handleGridButtonPressG3() {
        targetLocationAction("G3", G3);
    }

    public void handleGridButtonPressG4() {
        targetLocationAction("G4", G4);
    }

    public void handleGridButtonPressG5() {
        targetLocationAction("G5", G5);
    }

    public void handleGridButtonPressG6() {
        targetLocationAction("G6", G6);
    }

    public void handleGridButtonPressG7() {
        targetLocationAction("G7", G7);
    }

    public void handleGridButtonPressG8() {
        targetLocationAction("G8", G8);
    }

    public void handleGridButtonPressG9() {
        targetLocationAction("G9", G9);
    }

    public void handleGridButtonPressG10() {
        targetLocationAction("G10", G10);
    }

    public void handleGridButtonPressH1() {
        targetLocationAction("H1", H1);
    }

    public void handleGridButtonPressH2() {
        targetLocationAction("H2", H2);
    }

    public void handleGridButtonPressH3() {
        targetLocationAction("H3", H3);
    }

    public void handleGridButtonPressH4() {
        targetLocationAction("H4", H4);
    }

    public void handleGridButtonPressH5() {
        targetLocationAction("H5", H5);
    }

    public void handleGridButtonPressH6() {
        targetLocationAction("H6", H6);
    }

    public void handleGridButtonPressH7() {
        targetLocationAction("H7", H7);
    }

    public void handleGridButtonPressH8() {
        targetLocationAction("H8", H8);
    }

    public void handleGridButtonPressH9() {
        targetLocationAction("H9", H9);
    }

    public void handleGridButtonPressH10() {
        targetLocationAction("H10", H10);
    }

    public void handleGridButtonPressI1() {
        targetLocationAction("I1", I1);
    }

    public void handleGridButtonPressI2() {
        targetLocationAction("I2", I2);
    }

    public void handleGridButtonPressI3() {
        targetLocationAction("I3", I3);
    }

    public void handleGridButtonPressI4() {
        targetLocationAction("I4", I4);
    }

    public void handleGridButtonPressI5() {
        targetLocationAction("I5", I5);
    }

    public void handleGridButtonPressI6() {
        targetLocationAction("I6", I6);
    }

    public void handleGridButtonPressI7() {
        targetLocationAction("I7", I7);
    }

    public void handleGridButtonPressI8() {
        targetLocationAction("I8", I8);
    }

    public void handleGridButtonPressI9() {
        targetLocationAction("I9", I9);
    }

    public void handleGridButtonPressI10() {
        targetLocationAction("I10", I10);
    }

    public void handleGridButtonPressJ1() {
        targetLocationAction("J1", J1);
    }

    public void handleGridButtonPressJ2() {
        targetLocationAction("J2", J2);
    }

    public void handleGridButtonPressJ3() {
        targetLocationAction("J3", J3);
    }

    public void handleGridButtonPressJ4() {
        targetLocationAction("J4", J4);
    }

    public void handleGridButtonPressJ5() {
        targetLocationAction("J5", J5);
    }

    public void handleGridButtonPressJ6() {
        targetLocationAction("J6", J6);
    }

    public void handleGridButtonPressJ7() {
        targetLocationAction("J7", J7);
    }

    public void handleGridButtonPressJ8() {
        targetLocationAction("J8", J8);
    }

    public void handleGridButtonPressJ9() {
        targetLocationAction("J9", J9);
    }

    public void handleGridButtonPressJ10() {
        targetLocationAction("J10", J10);
    }

    public void handleFireButtonAction(ActionEvent actionEvent) {
        if (turn) {
            turn = false;
            //TODO send location attempt to server
        }
    }

    public void handleOpponentAttempt(String location) {
        String result = gameboard.attempt(location);

        if (result.equals("HIT")) {

        } else if (result.contains("DESTROYED")) {

        } else if (result.equals("MISS")) {

        }
    }

    public void handleShopButtonAction(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initialiseOwnShips(gameboard);
        printReceivedMessage("Welcome to Battleships!");
    }
}
