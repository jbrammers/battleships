package GUI;

import Game.Gameboard;
import Game.Ship;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShipPlacementController {

    Gameboard gameboard = new Gameboard();

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

    private int currentButtonNumber;
    private Ship currentShip;

    private int zeusShipsRemaining = 4;
    private int sledgehammerShipsRemaining = 3;
    private int stellarShipsRemaining = 2;
    private int ajaxShipsRemaining = 1;

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


    public void handleButtonActionZeus1(ActionEvent actionEvent) {
        if (zeusShipsRemaining != 0 && zeusButton1 == false) {
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
            currentButtonNumber = 1;
            currentShip = zeusShips.get(4 - zeusShipsRemaining);
            zeusButton1.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionZeus2(ActionEvent actionEvent) {
        if (zeusShipsRemaining != 0 && zeusButton2 == false) {
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
            currentButtonNumber = 2;
            currentShip = zeusShips.get(4 - zeusShipsRemaining);
            zeusButton2.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionSledgehammer1(ActionEvent actionEvent) {
        if (sledgehammerShipsRemaining != 0 && sledgehammerButton1 == false) {
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
            currentButtonNumber = 1;
            currentShip = sledgehammerShips.get(3 - sledgehammerShipsRemaining);
            sledgehammerButton1.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionSledgehammer2(ActionEvent actionEvent) {
        if (sledgehammerShipsRemaining != 0 && sledgehammerButton2 == false) {
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
            currentButtonNumber = 2;
            currentShip = sledgehammerShips.get(3 - sledgehammerShipsRemaining);
            sledgehammerButton2.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionSledgehammer3(ActionEvent actionEvent) {
        if (sledgehammerShipsRemaining != 0 && sledgehammerButton3 == false) {
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
            currentButtonNumber = 3;
            currentShip = sledgehammerShips.get(3 - sledgehammerShipsRemaining);
            sledgehammerButton3.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionStellar1(ActionEvent actionEvent) {
        if (stellarShipsRemaining != 0 && stellarButton1 == false) {
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
            currentButtonNumber = 1;
            currentShip = stellarShips.get(2 - stellarShipsRemaining);
            stellarButton1.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionStellar2(ActionEvent actionEvent) {
        if (stellarShipsRemaining != 0 && stellarButton2 == false) {
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
            currentButtonNumber = 2;
            currentShip = stellarShips.get(2 - stellarShipsRemaining);
            stellarButton2.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionStellar3(ActionEvent actionEvent) {
        if (stellarShipsRemaining != 0 && stellarButton3 == false) {
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
            currentButtonNumber = 3;
            currentShip = stellarShips.get(2 - stellarShipsRemaining);
            stellarButton3.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionStellar4(ActionEvent actionEvent) {
        if (stellarShipsRemaining != 0 && stellarButton4 == false) {
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
            currentButtonNumber = 4;
            currentShip = stellarShips.get(2 - stellarShipsRemaining);
            stellarButton4.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionAjax1(ActionEvent actionEvent) {
        if (ajaxShipsRemaining != 0 && ajaxButton1 == false) {
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
            currentButtonNumber = 1;
            currentShip = stellarShips.get(1 - ajaxShipsRemaining);
            ajaxButton1.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionAjax2(ActionEvent actionEvent) {
        if (ajaxShipsRemaining != 0 && ajaxButton2 == false) {
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
            currentButtonNumber = 2;
            currentShip = stellarShips.get(1 - ajaxShipsRemaining);
            ajaxButton2.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionAjax3(ActionEvent actionEvent) {
        if (ajaxShipsRemaining != 0 && ajaxButton3 == false) {
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
            currentButtonNumber = 3;
            currentShip = stellarShips.get(1 - ajaxShipsRemaining);
            ajaxButton3.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionAjax4(ActionEvent actionEvent) {
        if (ajaxShipsRemaining != 0 && ajaxButton4 == false) {
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
            currentButtonNumber = 4;
            currentShip = stellarShips.get(1 - ajaxShipsRemaining);
            ajaxButton1.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionAjax5(ActionEvent actionEvent) {
        if (ajaxShipsRemaining != 0 && ajaxButton5 == false) {
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
            currentButtonNumber = 5;
            currentShip = stellarShips.get(1 - ajaxShipsRemaining);
            ajaxButton5.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleGridButtonPressA1() {
        gridButtonHelper("A1");
    }
    public void handleGridButtonPressA2() {
        gridButtonHelper("A2");
    }
    public void handleGridButtonPressA3() {
        gridButtonHelper("A3");
    }
    public void handleGridButtonPressA4() {
        gridButtonHelper("A4");
    }
    public void handleGridButtonPressA5() {
        gridButtonHelper("A5");
    }
    public void handleGridButtonPressA6() {
        gridButtonHelper("A6");
    }
    public void handleGridButtonPressA7() {
        gridButtonHelper("A7");
    }
    public void handleGridButtonPressA8() {
        gridButtonHelper("A8");
    }
    public void handleGridButtonPressA9() {
        gridButtonHelper("A9");
    }
    public void handleGridButtonPressA10() {
        gridButtonHelper("A10");
    }

    private void gridButtonHelper(String location) {
        location += "_" + currentButtonNumber;
        if (validLocation(location, currentShip)) {
            currentShip.getLocation().add(location);
            if (currentShip.locationsFull()) {
                gameboard.addShip(currentShip);
                if (currentShip.getType().equals("Zeus")) {
                    zeusShipsRemaining--;
                    zeusShips.remove(currentShip);
                    ZeusLabel.setText(zeusShipsRemaining+"X");
                    zeusButton1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    zeusButton2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                }
                else if (currentShip.getType().equals("Sledgehammer")) {
                    sledgehammerShipsRemaining--;
                    sledgehammerShips.remove(currentShip);
                    SledgehammerLabel.setText(sledgehammerShipsRemaining+"X");
                    sledgehammerButton1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    sledgehammerButton2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    sledgehammerButton3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                }
                else if (currentShip.getType().equals("Stellar")) {
                    stellarShipsRemaining--;
                    stellarShips.remove(currentShip);
                    StellarLabel.setText(stellarShipsRemaining+"X");
                    stellarButton1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    stellarButton2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    stellarButton3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    stellarButton4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                }
                else if (currentShip.getType().equals("Ajax")) {
                    ajaxShipsRemaining--;
                    ajaxShips.remove(currentShip);
                    AjaxLabel.setText(ajaxShipsRemaining+"X");
                    ajaxButton1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    ajaxButton2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    ajaxButton3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    ajaxButton4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    ajaxButton5.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                }
            }
        }
    }


    private boolean validLocation(String locationAttempt, Ship ship) {

        for (Ship ships : gameboard.getBoard()) {
            if (ships.getLocation().isEmpty()) {
                continue;
            } else {
                for (String location : ships.getLocation()) {
                    String[] split = location.split("_");
                    if (split[1].equals(locationAttempt)) {
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
                int diff = Math.abs(Integer.parseInt(splitLocationButton[1]) - currentButtonNumber);
                String[] splitRowColumnLocation = splitLocationButton[0].split("!");
                if ((char) (splitRowColumnLocation[0].charAt(0) + diff) == splitRowColumnAttempt[0].charAt(0) ||
                        (char) (splitRowColumnLocation[0].charAt(0) - diff) == splitRowColumnAttempt[0].charAt(0) ||
                        Integer.parseInt(splitRowColumnLocation[1]) + diff == Integer.parseInt(splitRowColumnAttempt[1]) ||
                        Integer.parseInt(splitRowColumnLocation[1]) - diff == Integer.parseInt(splitRowColumnAttempt[1])) {
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

                int diff = Math.abs(min - currentButtonNumber);

                //vertical
                if (locationsRows.get(0).equals(locationsRows.get(1))) {
                    if (min == 1) {
                        if (splitRowColumnAttempt[0].equals(locationsRows.get(0)) && (splitRowColumnAttempt[1].charAt(0) == ((char) (locationsColumns.get(setLocationsButtonNumbers.indexOf(min)).charAt(0) + diff)))) {
                            return true;
                        }
                    } else if (max == ship.getLength()) {
                        if (splitRowColumnAttempt[0].equals(locationsRows.get(0)) && (splitRowColumnAttempt[1].charAt(0) == ((char) (locationsColumns.get(setLocationsButtonNumbers.indexOf(max)).charAt(0) - diff)))) {
                            return true;
                        }
                    } else {
                        if ((splitRowColumnAttempt[0].equals(locationsRows.get(0)) && splitRowColumnAttempt[1].equals(locationsColumns.get(setLocationsButtonNumbers.indexOf(max)) + diff)) || (splitRowColumnAttempt[0].equals(locationsRows.get(0)) && splitRowColumnAttempt[1].equals(locationsColumns.get(setLocationsButtonNumbers.indexOf(min)) + diff)) ||
                                (splitRowColumnAttempt[0].equals(locationsRows.get(0)) && (splitRowColumnAttempt[1].charAt(0) == (char) (locationsColumns.get(setLocationsButtonNumbers.indexOf(min)).charAt(0) - diff))) || (splitRowColumnAttempt[0].equals(locationsRows.get(0)) && (splitRowColumnAttempt[1].charAt(0) == (char) (locationsColumns.get(setLocationsButtonNumbers.indexOf(max)).charAt(0) - diff)))) {
                            return true;
                        }
                    }
                }

                //horizontal
                else if (locationsColumns.get(0).equals(locationsColumns.get(1))) {
                    if (min == 1) {
                        if (splitRowColumnAttempt[1].equals(locationsColumns.get(0)) && (splitRowColumnAttempt[0].charAt(0) == ((char) (locationsRows.get(setLocationsButtonNumbers.indexOf(min)).charAt(0) + diff)))) {
                            return true;
                        }
                    } else if (max == ship.getLength()) {
                        if (splitRowColumnAttempt[1].equals(locationsColumns.get(0)) && (splitRowColumnAttempt[0].charAt(0) == ((char) (locationsRows.get(setLocationsButtonNumbers.indexOf(max)).charAt(0) - diff)))) {
                            return true;
                        }
                    } else {
                        if ((splitRowColumnAttempt[1].equals(locationsColumns.get(0)) && (splitRowColumnAttempt[0].charAt(0) == ((char) (locationsRows.get(setLocationsButtonNumbers.indexOf(min)).charAt(0) + diff)))) || (splitRowColumnAttempt[1].equals(locationsColumns.get(0)) && (splitRowColumnAttempt[0].charAt(0) == ((char) (locationsRows.get(setLocationsButtonNumbers.indexOf(max)).charAt(0) + diff)))) ||
                                (splitRowColumnAttempt[1].equals(locationsColumns.get(0)) && (splitRowColumnAttempt[0].charAt(0) == ((char) (locationsRows.get(setLocationsButtonNumbers.indexOf(max)).charAt(0) - diff)))) || (splitRowColumnAttempt[1].equals(locationsColumns.get(0)) && (splitRowColumnAttempt[0].charAt(0) == ((char) (locationsRows.get(setLocationsButtonNumbers.indexOf(min)).charAt(0) - diff))))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}