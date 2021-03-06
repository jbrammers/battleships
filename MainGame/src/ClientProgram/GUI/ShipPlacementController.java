package ClientProgram.GUI;

import ClientProgram.Client.Client;
import ClientProgram.Game.Gameboard;
import ClientProgram.Game.Ship;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
/**
 * @author Oliver Grubb
 * This class controls all the elements seen on the ship placement screen.
 *
 */
public class ShipPlacementController implements Initializable {

    @FXML
    private Button Zeus1;

    @FXML
    private Button Zeus2;

    @FXML
    private Button Sledgehammer1;

    @FXML
    private Button Sledgehammer2;

    @FXML
    private Button Sledgehammer3;

    @FXML
    private Button Stellar1;

    @FXML
    private Button Stellar2;

    @FXML
    private Button Stellar3;

    @FXML
    private Button Stellar4;

    @FXML
    private Button Ajax1;

    @FXML
    private Button Ajax2;

    @FXML
    private Button Ajax3;

    @FXML
    private Button Ajax4;

    @FXML
    private Button Ajax5;

    @FXML
    private Label ZeusLabel;

    @FXML
    private Label SledgehammerLabel;

    @FXML
    private Label StellarLabel;

    @FXML
    private Label AjaxLabel;

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

    static Gameboard gameboard;

    private ArrayList<Ship> zeusShips = new ArrayList<>(Arrays.asList(new Ship("Zeus", 2), new Ship("Zeus", 2), new Ship("Zeus", 2), new Ship("Zeus", 2)));
    private ArrayList<Ship> sledgehammerShips = new ArrayList<>(Arrays.asList(new Ship("Sledgehammer", 3), new Ship("Sledgehammer", 3), new Ship("Sledgehammer", 3)));
    private ArrayList<Ship> stellarShips = new ArrayList<>(Arrays.asList(new Ship("Stellar", 4), new Ship("Stellar", 4)));
    private ArrayList<Ship> ajaxShips = new ArrayList<>(Arrays.asList(new Ship("Ajax", 5)));

    private boolean zeusButton1 = false;
    private boolean zeusButton2 = false;
    private boolean sledgehammerButton1 = false;
    private boolean sledgehammerButton2 = false;
    private boolean sledgehammerButton3 = false;
    private boolean stellarButton1 = false;
    private boolean stellarButton2 = false;
    private boolean stellarButton3 = false;
    private boolean stellarButton4 = false;
    private boolean ajaxButton1 = false;
    private boolean ajaxButton2 = false;
    private boolean ajaxButton3 = false;
    private boolean ajaxButton4 = false;
    private boolean ajaxButton5 = false;
    private boolean otherButtonActive = false;
    private int currentButtonNumber;
    private Ship currentShip;
    private int zeusShipsRemaining = 4;
    private int sledgehammerShipsRemaining = 3;
    private int stellarShipsRemaining = 2;
    private int ajaxShipsRemaining = 1;
    private ArrayList<Button> buttonArray = new ArrayList<>();
    private ArrayList<Button> currentShipButtonsPressed = new ArrayList<>();
    private final String[] rows = {"END", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "END"};

    /**
     * initialises pane
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonsArray();
        initialiseAllButtons();
        gameboard = new Gameboard();
    }

    /**
     * adds all buttons into array list
     */
    private void buttonsArray() {
        buttonArray.add(A1);
        buttonArray.add(A2);
        buttonArray.add(A3);
        buttonArray.add(A4);
        buttonArray.add(A5);
        buttonArray.add(A6);
        buttonArray.add(A7);
        buttonArray.add(A8);
        buttonArray.add(A9);
        buttonArray.add(A10);
        buttonArray.add(B1);
        buttonArray.add(B2);
        buttonArray.add(B3);
        buttonArray.add(B4);
        buttonArray.add(B5);
        buttonArray.add(B6);
        buttonArray.add(B7);
        buttonArray.add(B8);
        buttonArray.add(B9);
        buttonArray.add(B10);
        buttonArray.add(C1);
        buttonArray.add(C2);
        buttonArray.add(C3);
        buttonArray.add(C4);
        buttonArray.add(C5);
        buttonArray.add(C6);
        buttonArray.add(C7);
        buttonArray.add(C8);
        buttonArray.add(C9);
        buttonArray.add(C10);
        buttonArray.add(D1);
        buttonArray.add(D2);
        buttonArray.add(D3);
        buttonArray.add(D4);
        buttonArray.add(D5);
        buttonArray.add(D6);
        buttonArray.add(D7);
        buttonArray.add(D8);
        buttonArray.add(D9);
        buttonArray.add(D10);
        buttonArray.add(E1);
        buttonArray.add(E2);
        buttonArray.add(E3);
        buttonArray.add(E4);
        buttonArray.add(E5);
        buttonArray.add(E6);
        buttonArray.add(E7);
        buttonArray.add(E8);
        buttonArray.add(E9);
        buttonArray.add(E10);
        buttonArray.add(F1);
        buttonArray.add(F2);
        buttonArray.add(F3);
        buttonArray.add(F4);
        buttonArray.add(F5);
        buttonArray.add(F6);
        buttonArray.add(F7);
        buttonArray.add(F8);
        buttonArray.add(F9);
        buttonArray.add(F10);
        buttonArray.add(G1);
        buttonArray.add(G2);
        buttonArray.add(G3);
        buttonArray.add(G4);
        buttonArray.add(G5);
        buttonArray.add(G6);
        buttonArray.add(G7);
        buttonArray.add(G8);
        buttonArray.add(G9);
        buttonArray.add(G10);
        buttonArray.add(H1);
        buttonArray.add(H2);
        buttonArray.add(H3);
        buttonArray.add(H4);
        buttonArray.add(H5);
        buttonArray.add(H6);
        buttonArray.add(H7);
        buttonArray.add(H8);
        buttonArray.add(H9);
        buttonArray.add(H10);
        buttonArray.add(I1);
        buttonArray.add(I2);
        buttonArray.add(I3);
        buttonArray.add(I4);
        buttonArray.add(I5);
        buttonArray.add(I6);
        buttonArray.add(I7);
        buttonArray.add(I8);
        buttonArray.add(I9);
        buttonArray.add(I10);
        buttonArray.add(J1);
        buttonArray.add(J2);
        buttonArray.add(J3);
        buttonArray.add(J4);
        buttonArray.add(J5);
        buttonArray.add(J6);
        buttonArray.add(J7);
        buttonArray.add(J8);
        buttonArray.add(J9);
        buttonArray.add(J10);
        buttonArray.add(Zeus1);
        buttonArray.add(Zeus2);
        buttonArray.add(Sledgehammer1);
        buttonArray.add(Sledgehammer2);
        buttonArray.add(Sledgehammer3);
        buttonArray.add(Stellar1);
        buttonArray.add(Stellar2);
        buttonArray.add(Stellar3);
        buttonArray.add(Stellar4);
        buttonArray.add(Ajax1);
        buttonArray.add(Ajax2);
        buttonArray.add(Ajax3);
        buttonArray.add(Ajax4);
        buttonArray.add(Ajax5);
    }

    /**
     * sets all buttons to correct colour
     */
    private void initialiseAllButtons() {
        for (int i = 0; i < 100; i++) {
            buttonArray.get(i).setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
            buttonArray.get(i).setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        }
        for (int i = 100; i < buttonArray.size(); i++) {
            buttonArray.get(i).setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
            buttonArray.get(i).setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        }
    }

    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionZeus1(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Zeus")) {

        } else if (zeusShipsRemaining != 0 && zeusButton1 == false && otherButtonActive == false && shipButtonSelectHelper((zeusShips.get(zeusShips.size() - zeusShipsRemaining)), 1)) {
            zeusButton1 = true;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = false;
            otherButtonActive = true;
            currentButtonNumber = 1;
            currentShip = zeusShips.get(zeusShips.size() - zeusShipsRemaining);
            Zeus1.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionZeus2(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Zeus")) {

        } else if (zeusShipsRemaining != 0 && zeusButton2 == false && otherButtonActive == false && shipButtonSelectHelper((zeusShips.get(zeusShips.size() - zeusShipsRemaining)), 2)) {
            zeusButton1 = false;
            zeusButton2 = true;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = false;
            otherButtonActive = true;
            currentButtonNumber = 2;
            currentShip = zeusShips.get(zeusShips.size() - zeusShipsRemaining);
            Zeus2.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionSledgehammer1(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Sledgehammer")) {

        } else if (sledgehammerShipsRemaining != 0 && sledgehammerButton1 == false && otherButtonActive == false && shipButtonSelectHelper((sledgehammerShips.get(sledgehammerShips.size() - sledgehammerShipsRemaining)), 1)) {
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = true;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = false;
            otherButtonActive = true;
            currentButtonNumber = 1;
            currentShip = sledgehammerShips.get(sledgehammerShips.size() - sledgehammerShipsRemaining);
            Sledgehammer1.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionSledgehammer2(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Sledgehammer")) {

        } else if (sledgehammerShipsRemaining != 0 && sledgehammerButton2 == false && otherButtonActive == false && shipButtonSelectHelper((sledgehammerShips.get(sledgehammerShips.size() - sledgehammerShipsRemaining)), 2)) {
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = true;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = false;
            otherButtonActive = true;
            currentButtonNumber = 2;
            currentShip = sledgehammerShips.get(sledgehammerShips.size() - sledgehammerShipsRemaining);
            Sledgehammer2.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionSledgehammer3(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Sledgehammer")) {

        } else if (sledgehammerShipsRemaining != 0 && sledgehammerButton3 == false && otherButtonActive == false && shipButtonSelectHelper((sledgehammerShips.get(sledgehammerShips.size() - sledgehammerShipsRemaining)), 3)) {
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = true;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = false;
            otherButtonActive = true;
            currentButtonNumber = 3;
            currentShip = sledgehammerShips.get(sledgehammerShips.size() - sledgehammerShipsRemaining);
            Sledgehammer3.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionStellar1(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Stellar")) {

        } else if (stellarShipsRemaining != 0 && stellarButton1 == false && otherButtonActive == false && shipButtonSelectHelper((stellarShips.get(stellarShips.size() - stellarShipsRemaining)), 1)) {
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = true;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = false;
            otherButtonActive = true;
            currentButtonNumber = 1;
            currentShip = stellarShips.get(stellarShips.size() - stellarShipsRemaining);
            Stellar1.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionStellar2(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Stellar")) {

        } else if (stellarShipsRemaining != 0 && stellarButton2 == false && otherButtonActive == false && shipButtonSelectHelper((stellarShips.get(stellarShips.size() - stellarShipsRemaining)), 2)) {
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = true;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = false;
            otherButtonActive = true;
            currentButtonNumber = 2;
            currentShip = stellarShips.get(stellarShips.size() - stellarShipsRemaining);
            Stellar2.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionStellar3(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Stellar")) {

        } else if (stellarShipsRemaining != 0 && stellarButton3 == false && otherButtonActive == false && shipButtonSelectHelper((stellarShips.get(stellarShips.size() - stellarShipsRemaining)), 3)) {
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = true;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = false;
            otherButtonActive = true;
            currentButtonNumber = 3;
            currentShip = stellarShips.get(stellarShips.size() - stellarShipsRemaining);
            Stellar3.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionStellar4(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Stellar")) {

        } else if (stellarShipsRemaining != 0 && stellarButton4 == false && otherButtonActive == false && shipButtonSelectHelper((stellarShips.get(stellarShips.size() - stellarShipsRemaining)), 4)) {
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = true;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = false;
            otherButtonActive = true;
            currentButtonNumber = 4;
            currentShip = stellarShips.get(stellarShips.size() - stellarShipsRemaining);
            Stellar4.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionAjax1(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Ajax")) {

        } else if (ajaxShipsRemaining != 0 && ajaxButton1 == false && otherButtonActive == false && shipButtonSelectHelper((ajaxShips.get(ajaxShips.size() - ajaxShipsRemaining)), 1)) {
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = true;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = false;
            otherButtonActive = true;
            currentButtonNumber = 1;
            currentShip = ajaxShips.get(ajaxShips.size() - ajaxShipsRemaining);
            Ajax1.setBackground(new Background(new BackgroundFill(Color.PURPLE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionAjax2(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Ajax")) {

        } else if (ajaxShipsRemaining != 0 && ajaxButton2 == false && otherButtonActive == false && shipButtonSelectHelper((ajaxShips.get(ajaxShips.size() - ajaxShipsRemaining)), 2)) {
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = true;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = false;
            otherButtonActive = true;
            currentButtonNumber = 2;
            currentShip = ajaxShips.get(ajaxShips.size() - ajaxShipsRemaining);
            Ajax2.setBackground(new Background(new BackgroundFill(Color.PURPLE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionAjax3(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Ajax")) {

        } else if (ajaxShipsRemaining != 0 && ajaxButton3 == false && otherButtonActive == false && shipButtonSelectHelper((ajaxShips.get(ajaxShips.size() - ajaxShipsRemaining)), 3)) {
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = true;
            ajaxButton4 = false;
            ajaxButton5 = false;
            otherButtonActive = true;
            currentButtonNumber = 3;
            currentShip = ajaxShips.get(ajaxShips.size() - ajaxShipsRemaining);
            Ajax3.setBackground(new Background(new BackgroundFill(Color.PURPLE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionAjax4(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Ajax")) {

        } else if (ajaxShipsRemaining != 0 && ajaxButton4 == false && otherButtonActive == false && shipButtonSelectHelper((ajaxShips.get(ajaxShips.size() - ajaxShipsRemaining)), 4)) {
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = true;
            ajaxButton5 = false;
            otherButtonActive = true;
            currentButtonNumber = 4;
            currentShip = ajaxShips.get(ajaxShips.size() - ajaxShipsRemaining);
            Ajax4.setBackground(new Background(new BackgroundFill(Color.PURPLE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    /**
     * handles ship selection button click
     * @param actionEvent
     */
    public void handleButtonActionAjax5(ActionEvent actionEvent) {
        if (currentShip!=null && !currentShip.getType().equals("Ajax")) {

        } else if (ajaxShipsRemaining != 0 && ajaxButton5 == false && otherButtonActive == false && shipButtonSelectHelper((ajaxShips.get(ajaxShips.size() - ajaxShipsRemaining)), 5)) {
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = true;
            otherButtonActive = true;
            currentButtonNumber = 5;
            currentShip = ajaxShips.get(ajaxShips.size() - ajaxShipsRemaining);
            Ajax5.setBackground(new Background(new BackgroundFill(Color.PURPLE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    /**
     * helper method for checking valid ship button selections
     * @param ship
     * @param buttonNumber
     * @return
     */

    private boolean shipButtonSelectHelper(Ship ship, int buttonNumber) {
        if (ship.getLocation().isEmpty()) {
            return true;
        }
        if (ship.getLocation().size() == 1) {
            String[] splitLocationButton = ship.getLocation().get(0).split("_");
            //only select button to left or right of already highlighted button
            if (splitLocationButton[1].equals(Integer.toString(buttonNumber + 1)) || splitLocationButton[1].equals(Integer.toString(buttonNumber - 1))) {
                return true;
            } else return false;
        } else {
            ArrayList<Integer> setLocationsButtonNumbers = new ArrayList<>();

            for (String location : ship.getLocation()) {
                String[] splitLocationButton = location.split("_");
                setLocationsButtonNumbers.add(Integer.parseInt(splitLocationButton[1]));
            }

            int max = setLocationsButtonNumbers.get(0);
            for (int buttonNumberLocation : setLocationsButtonNumbers) {
                if (buttonNumberLocation > max) {
                    max = buttonNumberLocation;
                }
            }
            int min = setLocationsButtonNumbers.get(0);
            for (int buttonNumberLocation : setLocationsButtonNumbers) {
                if (buttonNumberLocation < min) {
                    min = buttonNumberLocation;
                }
            }

            if (buttonNumber == max + 1 || buttonNumber == min - 1) {
                return true;
            }
        }
        return false;
    }

    /**
     * handles click on undo button
     */
    @FXML
    private void handleUndoCurrentShipButtonAction() {
        if (currentShip != null && !currentShip.locationsFull()) {
            currentShip.setLocation(new ArrayList<>());
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = false;
            otherButtonActive = false;
            for (Button button : currentShipButtonsPressed) {
                button.setBackground(new Background(new BackgroundFill(Color.DODGERBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                button.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
            }

            if (currentShip.getType().equals("Zeus")) {
                Zeus1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                Zeus2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
            } else if (currentShip.getType().equals("Sledgehammer")) {
                Sledgehammer1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                Sledgehammer2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                Sledgehammer3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
            } else if (currentShip.getType().equals("Stellar")) {
                Stellar1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                Stellar2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                Stellar3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                Stellar4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
            } else if (currentShip.getType().equals("Ajax")) {
                Ajax1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                Ajax2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                Ajax3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                Ajax4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                Ajax5.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
            }
        }
    }

    /**
     * helper method for button grid selection
     * @param location
     * @param button
     */
    private void gridButtonHelper(String location, Button button) {
        location += "_" + currentButtonNumber;
        if (!zeusButton1 && !zeusButton2 && !sledgehammerButton1 && !sledgehammerButton2 && !sledgehammerButton3 && !stellarButton1 && !stellarButton2 && !stellarButton3 && !stellarButton4 && !ajaxButton1 && !ajaxButton2 && !ajaxButton3 && !ajaxButton4 && !ajaxButton5) {

        } else if (validLocation(location, currentShip)) {
            currentShipButtonsPressed.add(button);
            zeusButton1 = false;
            zeusButton2 = false;
            sledgehammerButton1 = false;
            sledgehammerButton2 = false;
            sledgehammerButton3 = false;
            stellarButton1 = false;
            stellarButton2 = false;
            stellarButton3 = false;
            stellarButton4 = false;
            ajaxButton1 = false;
            ajaxButton2 = false;
            ajaxButton3 = false;
            ajaxButton4 = false;
            ajaxButton5 = false;
            currentShip.getLocation().add(location);
            otherButtonActive = false;

            if (currentShip.locationsFull()) {
                currentShipButtonsPressed = new ArrayList<>();
                gameboard.addShip(currentShip);
                if (currentShip.getType().equals("Zeus")) {
                    zeusShipsRemaining--;
                    zeusShips.remove(currentShip);
                    ZeusLabel.setText(zeusShipsRemaining + "X");
                    currentShip = null;
                    button.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                    Zeus1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    Zeus2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                } else if (currentShip.getType().equals("Sledgehammer")) {
                    sledgehammerShipsRemaining--;
                    sledgehammerShips.remove(currentShip);
                    SledgehammerLabel.setText(sledgehammerShipsRemaining + "X");
                    currentShip = null;
                    button.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                    Sledgehammer1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    Sledgehammer2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    Sledgehammer3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                } else if (currentShip.getType().equals("Stellar")) {
                    stellarShipsRemaining--;
                    stellarShips.remove(currentShip);
                    StellarLabel.setText(stellarShipsRemaining + "X");
                    currentShip = null;
                    button.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                    Stellar1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    Stellar2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    Stellar3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    Stellar4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                } else if (currentShip.getType().equals("Ajax")) {
                    ajaxShipsRemaining--;
                    ajaxShips.remove(currentShip);
                    AjaxLabel.setText(ajaxShipsRemaining + "X");
                    currentShip = null;
                    button.setBackground(new Background(new BackgroundFill(Color.PURPLE, CornerRadii.EMPTY, Insets.EMPTY)));
                    Ajax1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    Ajax2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    Ajax3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    Ajax4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    Ajax5.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                }
            } else {

                if (currentShip.getType().equals("Zeus")) {
                    button.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                } else if (currentShip.getType().equals("Sledgehammer")) {
                    button.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                } else if (currentShip.getType().equals("Stellar")) {
                    button.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                } else if (currentShip.getType().equals("Ajax")) {
                    button.setBackground(new Background(new BackgroundFill(Color.PURPLE, CornerRadii.EMPTY, Insets.EMPTY)));
                }
            }

        }
    }

    /**
     * method for valid ship placements
     * @param locationAttempt
     * @param ship
     * @return
     */
    private boolean validLocation(String locationAttempt, Ship ship) {

        for (Ship ships : gameboard.getBoard()) {
            if (ships.getLocation().isEmpty()) {
                continue;
            } else {
                for (String location : ships.getLocation()) {
                    String[] split = location.split("_");
                    String[] splitAttempt = locationAttempt.split("_");
                    if (split[0].equals(splitAttempt[0])) {
                        return false;
                    }
                }
            }
        }

        if (ship.getLocation().isEmpty()) {
            return true;
        } else {

            String[] interAttempt = locationAttempt.split("_");
            String[] splitRowColumnAttempt = interAttempt[0].split("!");

            if (ship.locationCount() == 1) {
                String[] splitLocationButton = ship.getLocation().get(0).split("_");
                String[] splitRowColumnLocation = splitLocationButton[0].split("!");

                if (
                    //above
                        ((char) (splitRowColumnLocation[0].charAt(0) + 1) == splitRowColumnAttempt[0].charAt(0)) && (Integer.parseInt(splitRowColumnLocation[1]) == Integer.parseInt(splitRowColumnAttempt[1])) ||
                                //below
                                ((char) (splitRowColumnLocation[0].charAt(0) - 1) == splitRowColumnAttempt[0].charAt(0)) && (Integer.parseInt(splitRowColumnLocation[1]) == Integer.parseInt(splitRowColumnAttempt[1])) ||
                                //right
                                (Integer.parseInt(splitRowColumnLocation[1]) + 1 == Integer.parseInt(splitRowColumnAttempt[1])) && (((splitRowColumnLocation[0].charAt(0)) == splitRowColumnAttempt[0].charAt(0))) ||
                                //left
                                (Integer.parseInt(splitRowColumnLocation[1]) - 1 == Integer.parseInt(splitRowColumnAttempt[1])) && (((splitRowColumnLocation[0].charAt(0)) == splitRowColumnAttempt[0].charAt(0)))) {
                    return true;
                }
            } else {
                ArrayList<Integer> setLocationsButtonNumbers = new ArrayList<>();
                ArrayList<String> locationsRows = new ArrayList<>();
                ArrayList<String> locationsColumns = new ArrayList<>();

                for (String location : ship.getLocation()) {
                    String[] splitLocationButton = location.split("_");
                    String[] splitRowsColumns = splitLocationButton[0].split("!");
                    setLocationsButtonNumbers.add(Integer.parseInt(splitLocationButton[1]));
                    locationsRows.add(splitRowsColumns[0]);
                    locationsColumns.add(splitRowsColumns[1]);
                }

                int max = setLocationsButtonNumbers.get(0);
                for (int buttonNumber : setLocationsButtonNumbers) {
                    if (buttonNumber > max) {
                        max = buttonNumber;
                    }
                }
                int min = setLocationsButtonNumbers.get(0);
                for (int buttonNumber : setLocationsButtonNumbers) {
                    if (buttonNumber < min) {
                        min = buttonNumber;
                    }
                }

                //horizontal
                if (locationsRows.get(0).equals(locationsRows.get(1))) {
                    //left
                    if ((currentButtonNumber == min - 1) && ((Integer.parseInt(splitRowColumnAttempt[1]) == Integer.parseInt(locationsColumns.get(setLocationsButtonNumbers.indexOf(min))) - 1) || (Integer.parseInt(splitRowColumnAttempt[1]) == Integer.parseInt(locationsColumns.get(setLocationsButtonNumbers.indexOf(min))) + 1)) && splitRowColumnAttempt[0].equals(locationsRows.get(0))) {
                        return true;
                    }
                    //right
                    else if ((currentButtonNumber == max + 1) && ((Integer.parseInt(splitRowColumnAttempt[1]) == Integer.parseInt(locationsColumns.get(setLocationsButtonNumbers.indexOf(max))) + 1) || (Integer.parseInt(splitRowColumnAttempt[1]) == Integer.parseInt(locationsColumns.get(setLocationsButtonNumbers.indexOf(max))) - 1)) && splitRowColumnAttempt[0].equals(locationsRows.get(0))) {
                        return true;
                    }
                }


                //vertical
                else if (locationsColumns.get(0).equals(locationsColumns.get(1))) {
                    //below
                    if ((currentButtonNumber == min - 1) && ((splitRowColumnAttempt[0].equals(rowNavigator(locationsRows.get(setLocationsButtonNumbers.indexOf(min)), -1))) || (splitRowColumnAttempt[0].equals(rowNavigator(locationsRows.get(setLocationsButtonNumbers.indexOf(min)), 1)))) && Integer.parseInt(splitRowColumnAttempt[1]) == Integer.parseInt(locationsColumns.get(0))) {
                        return true;
                    }
                    //above
                    if ((currentButtonNumber == max + 1) && ((splitRowColumnAttempt[0].equals(rowNavigator(locationsRows.get(setLocationsButtonNumbers.indexOf(max)), 1))) || (splitRowColumnAttempt[0].equals(rowNavigator(locationsRows.get(setLocationsButtonNumbers.indexOf(max)), -1)))) && Integer.parseInt(splitRowColumnAttempt[1]) == Integer.parseInt(locationsColumns.get(0))) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /**
     * row navigator helper
     * @param ch
     * @param i
     * @return
     */
    private String rowNavigator(String ch, int i) {
        int index = 0;
        for (String row : rows) {
            if (ch.equals(row)) {
                break;
            } else index++;
        }
        return rows[index + i];
    }

    /**
     * handles click on back button
     * @param actionEvent
     */
    public void handleButtonActionBack(ActionEvent actionEvent) {
        PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
    }

    /**
     * handles click on continue button.
     * @param actionEvent
     */
    public void handleButtonActionContinue(ActionEvent actionEvent) {
        /*if (!gridFull()) {
            PopUpMessage.errorMessage("Please place all of your ships on the board before continuing.");
            return;
        }*/

        PaneNavigator.loadPane(PaneNavigator.MAINGAME);

        Thread thread = (Thread) DataStore.getData().getObject("thread");
        thread.start();

        Client client = (Client) DataStore.getData().getObject("client");
        client.send("SYSTEM ready");
    }

    /**
     * checks if grid is full
     * @return
     */
    private boolean gridFull() {
        return gameboard.getBoard().size() == 10;
    }

    public void handleGridButtonPressA1() {
        gridButtonHelper("A!1", A1);
    }

    public void handleGridButtonPressA2() {
        gridButtonHelper("A!2", A2);
    }

    public void handleGridButtonPressA3() {
        gridButtonHelper("A!3", A3);
    }

    public void handleGridButtonPressA4() {
        gridButtonHelper("A!4", A4);
    }

    public void handleGridButtonPressA5() {
        gridButtonHelper("A!5", A5);
    }

    public void handleGridButtonPressA6() {
        gridButtonHelper("A!6", A6);
    }

    public void handleGridButtonPressA7() {
        gridButtonHelper("A!7", A7);
    }

    public void handleGridButtonPressA8() {
        gridButtonHelper("A!8", A8);
    }

    public void handleGridButtonPressA9() {
        gridButtonHelper("A!9", A9);
    }

    public void handleGridButtonPressA10() {
        gridButtonHelper("A!10", A10);
    }

    public void handleGridButtonPressB1() {
        gridButtonHelper("B!1", B1);
    }

    public void handleGridButtonPressB2() {
        gridButtonHelper("B!2", B2);
    }

    public void handleGridButtonPressB3() {
        gridButtonHelper("B!3", B3);
    }

    public void handleGridButtonPressB4() {
        gridButtonHelper("B!4", B4);
    }

    public void handleGridButtonPressB5() {
        gridButtonHelper("B!5", B5);
    }

    public void handleGridButtonPressB6() {
        gridButtonHelper("B!6", B6);
    }

    public void handleGridButtonPressB7() {
        gridButtonHelper("B!7", B7);
    }

    public void handleGridButtonPressB8() {
        gridButtonHelper("B!8", B8);
    }

    public void handleGridButtonPressB9() {
        gridButtonHelper("B!9", B9);
    }

    public void handleGridButtonPressB10() {
        gridButtonHelper("B!10", B10);
    }

    public void handleGridButtonPressC1() {
        gridButtonHelper("C!1", C1);
    }

    public void handleGridButtonPressC2() {
        gridButtonHelper("C!2", C2);
    }

    public void handleGridButtonPressC3() {
        gridButtonHelper("C!3", C3);
    }

    public void handleGridButtonPressC4() {
        gridButtonHelper("C!4", C4);
    }

    public void handleGridButtonPressC5() {
        gridButtonHelper("C!5", C5);
    }

    public void handleGridButtonPressC6() {
        gridButtonHelper("C!6", C6);
    }

    public void handleGridButtonPressC7() {
        gridButtonHelper("C!7", C7);
    }

    public void handleGridButtonPressC8() {
        gridButtonHelper("C!8", C8);
    }

    public void handleGridButtonPressC9() {
        gridButtonHelper("C!9", C9);
    }

    public void handleGridButtonPressC10() {
        gridButtonHelper("C!10", C10);
    }

    public void handleGridButtonPressD1() {
        gridButtonHelper("D!1", D1);
    }

    public void handleGridButtonPressD2() {
        gridButtonHelper("D!2", D2);
    }

    public void handleGridButtonPressD3() {
        gridButtonHelper("D!3", D3);
    }

    public void handleGridButtonPressD4() {
        gridButtonHelper("D!4", D4);
    }

    public void handleGridButtonPressD5() {
        gridButtonHelper("D!5", D5);
    }

    public void handleGridButtonPressD6() {
        gridButtonHelper("D!6", D6);
    }

    public void handleGridButtonPressD7() {
        gridButtonHelper("D!7", D7);
    }

    public void handleGridButtonPressD8() {
        gridButtonHelper("D!8", D8);
    }

    public void handleGridButtonPressD9() {
        gridButtonHelper("D!9", D9);
    }

    public void handleGridButtonPressD10() {
        gridButtonHelper("D!10", D10);
    }

    public void handleGridButtonPressE1() {
        gridButtonHelper("E!1", E1);
    }

    public void handleGridButtonPressE2() {
        gridButtonHelper("E!2", E2);
    }

    public void handleGridButtonPressE3() {
        gridButtonHelper("E!3", E3);
    }

    public void handleGridButtonPressE4() {
        gridButtonHelper("E!4", E4);
    }

    public void handleGridButtonPressE5() {
        gridButtonHelper("E!5", E5);
    }

    public void handleGridButtonPressE6() {
        gridButtonHelper("E!6", E6);
    }

    public void handleGridButtonPressE7() {
        gridButtonHelper("E!7", E7);
    }

    public void handleGridButtonPressE8() {
        gridButtonHelper("E!8", E8);
    }

    public void handleGridButtonPressE9() {
        gridButtonHelper("E!9", E9);
    }

    public void handleGridButtonPressE10() {
        gridButtonHelper("E!10", E10);
    }

    public void handleGridButtonPressF1() {
        gridButtonHelper("F!1", F1);
    }

    public void handleGridButtonPressF2() {
        gridButtonHelper("F!2", F2);
    }

    public void handleGridButtonPressF3() {
        gridButtonHelper("F!3", F3);
    }

    public void handleGridButtonPressF4() {
        gridButtonHelper("F!4", F4);
    }

    public void handleGridButtonPressF5() {
        gridButtonHelper("F!5", F5);
    }

    public void handleGridButtonPressF6() {
        gridButtonHelper("F!6", F6);
    }

    public void handleGridButtonPressF7() {
        gridButtonHelper("F!7", F7);
    }

    public void handleGridButtonPressF8() {
        gridButtonHelper("F!8", F8);
    }

    public void handleGridButtonPressF9() {
        gridButtonHelper("F!9", F9);
    }

    public void handleGridButtonPressF10() {
        gridButtonHelper("F!10", F10);
    }

    public void handleGridButtonPressG1() {
        gridButtonHelper("G!1", G1);
    }

    public void handleGridButtonPressG2() {
        gridButtonHelper("G!2", G2);
    }

    public void handleGridButtonPressG3() {
        gridButtonHelper("G!3", G3);
    }

    public void handleGridButtonPressG4() {
        gridButtonHelper("G!4", G4);
    }

    public void handleGridButtonPressG5() {
        gridButtonHelper("G!5", G5);
    }

    public void handleGridButtonPressG6() {
        gridButtonHelper("G!6", G6);
    }

    public void handleGridButtonPressG7() {
        gridButtonHelper("G!7", G7);
    }

    public void handleGridButtonPressG8() {
        gridButtonHelper("G!8", G8);
    }

    public void handleGridButtonPressG9() {
        gridButtonHelper("G!9", G9);
    }

    public void handleGridButtonPressG10() {
        gridButtonHelper("G!10", G10);
    }

    public void handleGridButtonPressH1() {
        gridButtonHelper("H!1", H1);
    }

    public void handleGridButtonPressH2() {
        gridButtonHelper("H!2", H2);
    }

    public void handleGridButtonPressH3() {
        gridButtonHelper("H!3", H3);
    }

    public void handleGridButtonPressH4() {
        gridButtonHelper("H!4", H4);
    }

    public void handleGridButtonPressH5() {
        gridButtonHelper("H!5", H5);
    }

    public void handleGridButtonPressH6() {
        gridButtonHelper("H!6", H6);
    }

    public void handleGridButtonPressH7() {
        gridButtonHelper("H!7", H7);
    }

    public void handleGridButtonPressH8() {
        gridButtonHelper("H!8", H8);
    }

    public void handleGridButtonPressH9() {
        gridButtonHelper("H!9", H9);
    }

    public void handleGridButtonPressH10() {
        gridButtonHelper("H!10", H10);
    }

    public void handleGridButtonPressI1() {
        gridButtonHelper("I!1", I1);
    }

    public void handleGridButtonPressI2() {
        gridButtonHelper("I!2", I2);
    }

    public void handleGridButtonPressI3() {
        gridButtonHelper("I!3", I3);
    }

    public void handleGridButtonPressI4() {
        gridButtonHelper("I!4", I4);
    }

    public void handleGridButtonPressI5() {
        gridButtonHelper("I!5", I5);
    }

    public void handleGridButtonPressI6() {
        gridButtonHelper("I!6", I6);
    }

    public void handleGridButtonPressI7() {
        gridButtonHelper("I!7", I7);
    }

    public void handleGridButtonPressI8() {
        gridButtonHelper("I!8", I8);
    }

    public void handleGridButtonPressI9() {
        gridButtonHelper("I!9", I9);
    }

    public void handleGridButtonPressI10() {
        gridButtonHelper("I!10", I10);
    }

    public void handleGridButtonPressJ1() {
        gridButtonHelper("J!1", J1);
    }

    public void handleGridButtonPressJ2() {
        gridButtonHelper("J!2", J2);
    }

    public void handleGridButtonPressJ3() {
        gridButtonHelper("J!3", J3);
    }

    public void handleGridButtonPressJ4() {
        gridButtonHelper("J!4", J4);
    }

    public void handleGridButtonPressJ5() {
        gridButtonHelper("J!5", J5);
    }

    public void handleGridButtonPressJ6() {
        gridButtonHelper("J!6", J6);
    }

    public void handleGridButtonPressJ7() {
        gridButtonHelper("J!7", J7);
    }

    public void handleGridButtonPressJ8() {
        gridButtonHelper("J!8", J8);
    }

    public void handleGridButtonPressJ9() {
        gridButtonHelper("J!9", J9);
    }

    public void handleGridButtonPressJ10() {
        gridButtonHelper("J!10", J10);
    }

}