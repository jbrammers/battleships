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

public class ShipPlacementController {

    @FXML
    private Button zeus1;

    @FXML
    private Button zeus2;

    @FXML
    private Button sledgehammer1;

    @FXML
    private Button sledgehammer2;

    @FXML
    private Button sledgehammer3;

    @FXML
    private Button stellar1;

    @FXML
    private Button stellar2;

    @FXML
    private Button stellar3;

    @FXML
    private Button stellar4;

    @FXML
    private Button ajax1;

    @FXML
    private Button ajax2;

    @FXML
    private Button ajax3;

    @FXML
    private Button ajax4;

    @FXML
    private Button ajax5;

    @FXML
    private Label zeusCounterLabel;

    @FXML
    private Label sledgehammerCounterLabel;

    @FXML
    private Label stellarCounterLabel;

    @FXML
    private Label ajaxCounterLabel;

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


    private boolean alreadyPressedA1 = false;
    private boolean alreadyPressedA2 = false;
    private boolean alreadyPressedA3 = false;
    private boolean alreadyPressedA4 = false;
    private boolean alreadyPressedA5 = false;
    private boolean alreadyPressedA6 = false;
    private boolean alreadyPressedA7 = false;
    private boolean alreadyPressedA8 = false;
    private boolean alreadyPressedA9 = false;
    private boolean alreadyPressedA10 = false;

    boolean alreadyPressedZeus1 = false;
    boolean alreadyPressedZeus2 = false;

    private int zeusRemaining = 4;
    private int sledgehammerRemaining = 2;
    private int stellarRemaining = 2;
    private int ajaxRemaining = 1;
    private boolean zeusSelected = false;
    private boolean sledgehammerSelected = false;
    private boolean stellarSelected = false;
    private boolean ajaxSelected = false;
    private int zeusCounter = 0;
    private int sledgehammerCounter = 0;
    private int stellarCounter = 0;
    private int ajaxCounter = 0;
    public static Gameboard board = new Gameboard();
    private Ship[] zeusShips = {new Ship("Zeus", 2), new Ship("Zeus", 2), new Ship("Zeus", 2), new Ship("Zeus", 2)};

    private Ship[] sledgehammerShips = {new Ship("Sledgehammer", 3), new Ship("Sledgehammer", 3), new Ship("Sledgehammer", 3)};

    private Ship[] stellarShips = {new Ship("Stellar", 4), new Ship("Stellar", 4)};

    private Ship[] ajaxShips = {new Ship("Ajax", 5)};

    public void handleButtonActionZeus1(ActionEvent actionEvent) {
        if (alreadyPressedZeus1 == false) {
            sledgehammerSelected = false;
            stellarSelected = false;
            ajaxSelected = false;
            zeusSelected = true;
            alreadyPressedZeus1 = true;
            zeus1.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionZeus2(ActionEvent actionEvent) {
        if (alreadyPressedZeus2 == false) {
            sledgehammerSelected = false;
            stellarSelected = false;
            ajaxSelected = false;
            zeusSelected = true;
            zeus2.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void handleButtonActionSledgehammer1(ActionEvent actionEvent) {
        sledgehammerSelected = true;
        stellarSelected = false;
        ajaxSelected = false;
        zeusSelected = false;
        sledgehammer1.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public void handleButtonActionSledgehammer2(ActionEvent actionEvent) {
        sledgehammerSelected = true;
        stellarSelected = false;
        ajaxSelected = false;
        zeusSelected = false;
        sledgehammer2.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public void handleButtonActionSledgehammer3(ActionEvent actionEvent) {
        sledgehammerSelected = true;
        stellarSelected = false;
        ajaxSelected = false;
        zeusSelected = false;
        sledgehammer3.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public void handleButtonActionStellar1(ActionEvent actionEvent) {
        sledgehammerSelected = false;
        stellarSelected = true;
        ajaxSelected = false;
        zeusSelected = false;
        stellar1.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public void handleButtonActionStellar2(ActionEvent actionEvent) {
        sledgehammerSelected = false;
        stellarSelected = true;
        ajaxSelected = false;
        zeusSelected = false;
        stellar2.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public void handleButtonActionStellar3(ActionEvent actionEvent) {
        sledgehammerSelected = false;
        stellarSelected = true;
        ajaxSelected = false;
        zeusSelected = false;
        stellar3.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public void handleButtonActionStellar4(ActionEvent actionEvent) {
        sledgehammerSelected = false;
        stellarSelected = true;
        ajaxSelected = false;
        zeusSelected = false;
        stellar4.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public void handleButtonActionAjax1(ActionEvent actionEvent) {
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = true;
        zeusSelected = false;
        ajax1.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public void handleButtonActionAjax2(ActionEvent actionEvent) {
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = true;
        zeusSelected = false;
        ajax2.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public void handleButtonActionAjax3(ActionEvent actionEvent) {
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = true;
        zeusSelected = false;
        ajax3.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public void handleButtonActionAjax4(ActionEvent actionEvent) {
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = true;
        zeusSelected = false;
        ajax4.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    public void handleButtonActionAjax5(ActionEvent actionEvent) {
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = true;
        zeusSelected = false;
        ajax5.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));

    }

    private boolean validLocation(Ship ship, String location, int counter) {
        if (ship.getLocation().isEmpty()) {
            ship.getLocation().add(location);
            return true;
        }
        else {
            char[] previousLocationCharArray = ship.getLocation().get(counter-1).toCharArray();
            char[] requestedLocationCharArray = location.toCharArray();
            if (requestedLocationCharArray.equals(requestedLocationCharArray)) {
                return false;
            }
            if (requestedLocationCharArray[0] == previousLocationCharArray[0]) {
                if ((int)requestedLocationCharArray[1] == (int)previousLocationCharArray[1] + 1 || (int)requestedLocationCharArray[1] == (int)previousLocationCharArray[1] - 1 ) {
                    ship.getLocation().add(location);
                    return true;
                }
                else return false;
            }
            if (requestedLocationCharArray[1] == previousLocationCharArray[1]) {
                if (requestedLocationCharArray[0] == previousLocationCharArray[0] + 1 || requestedLocationCharArray[0] == previousLocationCharArray[0] - 1 ) {
                    ship.getLocation().add(location);
                    return true;
                }
                else return false;
            }
        }
        return false;
    }


    public void handleButtonActionA1(ActionEvent actionEvent) {
        if (alreadyPressedA1 == false) {

            if (zeusSelected == true && zeusRemaining != 0) {

                for (Ship ship : zeusShips) {
                    if (!ship.locationsFull()) {

                        if (validLocation(ship, "A1", zeusCounter)) {
                            A1.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                            zeusCounter++;
                            break;
                        }
                    }
                }
                if (zeusCounter == 2) {
                    zeus1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    zeus2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    alreadyPressedZeus1 = false;
                    alreadyPressedZeus2 = false;
                    zeusCounter = 0;
                    board.addShip(zeusShips[4 - zeusRemaining]);
                    zeusRemaining--;
                    zeusCounterLabel.setText(zeusRemaining + " x Zeus");
                }
            } else if (sledgehammerSelected == true && sledgehammerRemaining != 0) {

                for (Ship ship : sledgehammerShips) {
                    if (!ship.locationsFull()) {

                        if (validLocation(ship, "A1", sledgehammerCounter)) {
                                A1.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                                sledgehammerCounter++;
                            break;
                        }
                    }
                }
                if (sledgehammerCounter == 3) {
                    sledgehammer1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    sledgehammer2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    sledgehammer3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    sledgehammerCounter = 0;
                    board.addShip(sledgehammerShips[3 - sledgehammerRemaining]);
                    sledgehammerRemaining--;
                    sledgehammerCounterLabel.setText(sledgehammerRemaining + " x Sledgehammer");
                }
            } else if (stellarSelected == true && stellarRemaining != 0) {

                for (Ship ship : stellarShips) {
                    if (!ship.locationsFull()) {
                        if (validLocation(ship, "A1", stellarCounter)) {
                            A1.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                            stellarCounter++;
                            break;
                        }
                    }
                }
                if (stellarCounter == 4) {
                    stellar1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    stellar2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    stellar3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    stellar4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    stellarCounter = 0;
                    board.addShip(stellarShips[2 - stellarRemaining]);
                    stellarRemaining--;
                    stellarCounterLabel.setText(stellarRemaining + " x Stellar");
                }
            } else if (ajaxSelected == true && ajaxRemaining != 0) {

                for (Ship ship : ajaxShips) {
                    if (!ship.locationsFull()) {
                        if (validLocation(ship, "A1", ajaxCounter)) {
                            A1.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                            ajaxCounter++;
                            break;
                        }
                    }
                }
                if (ajaxCounter == 5) {
                    ajax1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    ajax2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    ajax3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    ajax4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    ajax5.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                    ajaxCounter = 0;
                    board.addShip(ajaxShips[1 - ajaxRemaining]);
                    ajaxRemaining--;
                    ajaxCounterLabel.setText(ajaxRemaining + " x Ajax");
                }
            }
            zeusSelected = false;
            sledgehammerSelected = false;
            stellarSelected = false;
            ajaxSelected = false;
            alreadyPressedA1 = true;
        }
    }

    public void handleButtonActionA2(ActionEvent actionEvent) {if (alreadyPressedA2 == false) {

        if (zeusSelected == true && zeusRemaining != 0) {

            for (Ship ship : zeusShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A2", zeusCounter)) {
                        A2.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        zeusCounter++;
                        break;
                    }
                }
            }
            if (zeusCounter == 2) {
                zeus1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                zeus2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                alreadyPressedZeus1 = false;
                alreadyPressedZeus2 = false;
                zeusCounter = 0;
                board.addShip(zeusShips[4 - zeusRemaining]);
                zeusRemaining--;
                zeusCounterLabel.setText(zeusRemaining + " x Zeus");
            }
        } else if (sledgehammerSelected == true && sledgehammerRemaining != 0) {

            for (Ship ship : sledgehammerShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A2", sledgehammerCounter)) {
                        A2.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                        sledgehammerCounter++;
                        break;
                    }
                }
            }
            if (sledgehammerCounter == 3) {
                sledgehammer1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammerCounter = 0;
                board.addShip(sledgehammerShips[3 - sledgehammerRemaining]);
                sledgehammerRemaining--;
                sledgehammerCounterLabel.setText(sledgehammerRemaining + " x Sledgehammer");
            }
        } else if (stellarSelected == true && stellarRemaining != 0) {

            for (Ship ship : stellarShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A2", stellarCounter)) {
                        A2.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        stellarCounter++;
                        break;
                    }
                }
            }
            if (stellarCounter == 4) {
                stellar1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellarCounter = 0;
                board.addShip(stellarShips[2 - stellarRemaining]);
                stellarRemaining--;
                stellarCounterLabel.setText(stellarRemaining + " x Stellar");
            }
        } else if (ajaxSelected == true && ajaxRemaining != 0) {

            for (Ship ship : ajaxShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A2", ajaxCounter)) {
                        A2.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                        ajaxCounter++;
                        break;
                    }
                }
            }
            if (ajaxCounter == 5) {
                ajax1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax5.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajaxCounter = 0;
                board.addShip(ajaxShips[1 - ajaxRemaining]);
                ajaxRemaining--;
                ajaxCounterLabel.setText(ajaxRemaining + " x Ajax");
            }
        }
        zeusSelected = false;
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = false;
        alreadyPressedA2 = true;
    }
    }

    public void handleButtonActionA3(ActionEvent actionEvent) {if (alreadyPressedA3 == false) {

        if (zeusSelected == true && zeusRemaining != 0) {

            for (Ship ship : zeusShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A3", zeusCounter)) {
                        A3.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        zeusCounter++;
                        break;
                    }
                }
            }
            if (zeusCounter == 2) {
                zeus1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                zeus2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                alreadyPressedZeus1 = false;
                alreadyPressedZeus2 = false;
                zeusCounter = 0;
                board.addShip(zeusShips[4 - zeusRemaining]);
                zeusRemaining--;
                zeusCounterLabel.setText(zeusRemaining + " x Zeus");
            }
        } else if (sledgehammerSelected == true && sledgehammerRemaining != 0) {

            for (Ship ship : sledgehammerShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A3", sledgehammerCounter)) {
                        A3.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                        sledgehammerCounter++;
                        break;
                    }
                }
            }
            if (sledgehammerCounter == 3) {
                sledgehammer1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammerCounter = 0;
                board.addShip(sledgehammerShips[3 - sledgehammerRemaining]);
                sledgehammerRemaining--;
                sledgehammerCounterLabel.setText(sledgehammerRemaining + " x Sledgehammer");
            }
        } else if (stellarSelected == true && stellarRemaining != 0) {

            for (Ship ship : stellarShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A3", stellarCounter)) {
                        A3.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        stellarCounter++;
                        break;
                    }
                }
            }
            if (stellarCounter == 4) {
                stellar1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellarCounter = 0;
                board.addShip(stellarShips[2 - stellarRemaining]);
                stellarRemaining--;
                stellarCounterLabel.setText(stellarRemaining + " x Stellar");
            }
        } else if (ajaxSelected == true && ajaxRemaining != 0) {

            for (Ship ship : ajaxShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A3", ajaxCounter)) {
                        A3.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                        ajaxCounter++;
                        break;
                    }
                }
            }
            if (ajaxCounter == 5) {
                ajax1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax5.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajaxCounter = 0;
                board.addShip(ajaxShips[1 - ajaxRemaining]);
                ajaxRemaining--;
                ajaxCounterLabel.setText(ajaxRemaining + " x Ajax");
            }
        }
        zeusSelected = false;
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = false;
        alreadyPressedA3 = true;
    }
    }

    public void handleButtonActionA4(ActionEvent actionEvent) {if (alreadyPressedA4 == false) {

        if (zeusSelected == true && zeusRemaining != 0) {

            for (Ship ship : zeusShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A4", zeusCounter)) {
                        A4.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        zeusCounter++;
                        break;
                    }
                }
            }
            if (zeusCounter == 2) {
                zeus1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                zeus2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                alreadyPressedZeus1 = false;
                alreadyPressedZeus2 = false;
                zeusCounter = 0;
                board.addShip(zeusShips[4 - zeusRemaining]);
                zeusRemaining--;
                zeusCounterLabel.setText(zeusRemaining + " x Zeus");
            }
        } else if (sledgehammerSelected == true && sledgehammerRemaining != 0) {

            for (Ship ship : sledgehammerShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A4", sledgehammerCounter)) {
                        A4.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                        sledgehammerCounter++;
                        break;
                    }
                }
            }
            if (sledgehammerCounter == 3) {
                sledgehammer1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammerCounter = 0;
                board.addShip(sledgehammerShips[3 - sledgehammerRemaining]);
                sledgehammerRemaining--;
                sledgehammerCounterLabel.setText(sledgehammerRemaining + " x Sledgehammer");
            }
        } else if (stellarSelected == true && stellarRemaining != 0) {

            for (Ship ship : stellarShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A4", stellarCounter)) {
                        A4.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        stellarCounter++;
                        break;
                    }
                }
            }
            if (stellarCounter == 4) {
                stellar1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellarCounter = 0;
                board.addShip(stellarShips[2 - stellarRemaining]);
                stellarRemaining--;
                stellarCounterLabel.setText(stellarRemaining + " x Stellar");
            }
        } else if (ajaxSelected == true && ajaxRemaining != 0) {

            for (Ship ship : ajaxShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A4", ajaxCounter)) {
                        A4.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                        ajaxCounter++;
                        break;
                    }
                }
            }
            if (ajaxCounter == 5) {
                ajax1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax5.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajaxCounter = 0;
                board.addShip(ajaxShips[1 - ajaxRemaining]);
                ajaxRemaining--;
                ajaxCounterLabel.setText(ajaxRemaining + " x Ajax");
            }
        }
        zeusSelected = false;
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = false;
        alreadyPressedA4 = true;
    }
    }

    public void handleButtonActionA5(ActionEvent actionEvent) {if (alreadyPressedA5 == false) {

        if (zeusSelected == true && zeusRemaining != 0) {

            for (Ship ship : zeusShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A5", zeusCounter)) {
                        A5.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        zeusCounter++;
                        break;
                    }
                }
            }
            if (zeusCounter == 2) {
                zeus1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                zeus2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                alreadyPressedZeus1 = false;
                alreadyPressedZeus2 = false;
                zeusCounter = 0;
                board.addShip(zeusShips[4 - zeusRemaining]);
                zeusRemaining--;
                zeusCounterLabel.setText(zeusRemaining + " x Zeus");
            }
        } else if (sledgehammerSelected == true && sledgehammerRemaining != 0) {

            for (Ship ship : sledgehammerShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A5", sledgehammerCounter)) {
                        A5.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                        sledgehammerCounter++;
                        break;
                    }
                }
            }
            if (sledgehammerCounter == 3) {
                sledgehammer1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammerCounter = 0;
                board.addShip(sledgehammerShips[3 - sledgehammerRemaining]);
                sledgehammerRemaining--;
                sledgehammerCounterLabel.setText(sledgehammerRemaining + " x Sledgehammer");
            }
        } else if (stellarSelected == true && stellarRemaining != 0) {

            for (Ship ship : stellarShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A5", stellarCounter)) {
                        A5.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        stellarCounter++;
                        break;
                    }
                }
            }
            if (stellarCounter == 4) {
                stellar1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellarCounter = 0;
                board.addShip(stellarShips[2 - stellarRemaining]);
                stellarRemaining--;
                stellarCounterLabel.setText(stellarRemaining + " x Stellar");
            }
        } else if (ajaxSelected == true && ajaxRemaining != 0) {

            for (Ship ship : ajaxShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A5", ajaxCounter)) {
                        A5.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                        ajaxCounter++;
                        break;
                    }
                }
            }
            if (ajaxCounter == 5) {
                ajax1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax5.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajaxCounter = 0;
                board.addShip(ajaxShips[1 - ajaxRemaining]);
                ajaxRemaining--;
                ajaxCounterLabel.setText(ajaxRemaining + " x Ajax");
            }
        }
        zeusSelected = false;
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = false;
        alreadyPressedA5 = true;
    }
    }

    public void handleButtonActionA6(ActionEvent actionEvent) {if (alreadyPressedA6 == false) {

        if (zeusSelected == true && zeusRemaining != 0) {

            for (Ship ship : zeusShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A6", zeusCounter)) {
                        A6.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        zeusCounter++;
                        break;
                    }
                }
            }
            if (zeusCounter == 2) {
                zeus1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                zeus2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                alreadyPressedZeus1 = false;
                alreadyPressedZeus2 = false;
                zeusCounter = 0;
                board.addShip(zeusShips[4 - zeusRemaining]);
                zeusRemaining--;
                zeusCounterLabel.setText(zeusRemaining + " x Zeus");
            }
        } else if (sledgehammerSelected == true && sledgehammerRemaining != 0) {

            for (Ship ship : sledgehammerShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A6", sledgehammerCounter)) {
                        A6.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                        sledgehammerCounter++;
                        break;
                    }
                }
            }
            if (sledgehammerCounter == 3) {
                sledgehammer1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammerCounter = 0;
                board.addShip(sledgehammerShips[3 - sledgehammerRemaining]);
                sledgehammerRemaining--;
                sledgehammerCounterLabel.setText(sledgehammerRemaining + " x Sledgehammer");
            }
        } else if (stellarSelected == true && stellarRemaining != 0) {

            for (Ship ship : stellarShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A6", stellarCounter)) {
                        A6.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        stellarCounter++;
                        break;
                    }
                }
            }
            if (stellarCounter == 4) {
                stellar1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellarCounter = 0;
                board.addShip(stellarShips[2 - stellarRemaining]);
                stellarRemaining--;
                stellarCounterLabel.setText(stellarRemaining + " x Stellar");
            }
        } else if (ajaxSelected == true && ajaxRemaining != 0) {

            for (Ship ship : ajaxShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A6", ajaxCounter)) {
                        A6.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                        ajaxCounter++;
                        break;
                    }
                }
            }
            if (ajaxCounter == 5) {
                ajax1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax5.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajaxCounter = 0;
                board.addShip(ajaxShips[1 - ajaxRemaining]);
                ajaxRemaining--;
                ajaxCounterLabel.setText(ajaxRemaining + " x Ajax");
            }
        }
        zeusSelected = false;
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = false;
        alreadyPressedA6 = true;
    }
    }

    public void handleButtonActionA7(ActionEvent actionEvent) {if (alreadyPressedA7 == false) {

        if (zeusSelected == true && zeusRemaining != 0) {

            for (Ship ship : zeusShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A7", zeusCounter)) {
                        A7.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        zeusCounter++;
                        break;
                    }
                }
            }
            if (zeusCounter == 2) {
                zeus1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                zeus2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                alreadyPressedZeus1 = false;
                alreadyPressedZeus2 = false;
                zeusCounter = 0;
                board.addShip(zeusShips[4 - zeusRemaining]);
                zeusRemaining--;
                zeusCounterLabel.setText(zeusRemaining + " x Zeus");
            }
        } else if (sledgehammerSelected == true && sledgehammerRemaining != 0) {

            for (Ship ship : sledgehammerShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A7", sledgehammerCounter)) {
                        A7.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                        sledgehammerCounter++;
                        break;
                    }
                }
            }
            if (sledgehammerCounter == 3) {
                sledgehammer1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammerCounter = 0;
                board.addShip(sledgehammerShips[3 - sledgehammerRemaining]);
                sledgehammerRemaining--;
                sledgehammerCounterLabel.setText(sledgehammerRemaining + " x Sledgehammer");
            }
        } else if (stellarSelected == true && stellarRemaining != 0) {

            for (Ship ship : stellarShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A7", stellarCounter)) {
                        A7.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        stellarCounter++;
                        break;
                    }
                }
            }
            if (stellarCounter == 4) {
                stellar1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellarCounter = 0;
                board.addShip(stellarShips[2 - stellarRemaining]);
                stellarRemaining--;
                stellarCounterLabel.setText(stellarRemaining + " x Stellar");
            }
        } else if (ajaxSelected == true && ajaxRemaining != 0) {

            for (Ship ship : ajaxShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A7", ajaxCounter)) {
                        A7.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                        ajaxCounter++;
                        break;
                    }
                }
            }
            if (ajaxCounter == 5) {
                ajax1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax5.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajaxCounter = 0;
                board.addShip(ajaxShips[1 - ajaxRemaining]);
                ajaxRemaining--;
                ajaxCounterLabel.setText(ajaxRemaining + " x Ajax");
            }
        }
        zeusSelected = false;
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = false;
        alreadyPressedA7 = true;
    }
    }

    public void handleButtonActionA8(ActionEvent actionEvent) {if (alreadyPressedA8 == false) {

        if (zeusSelected == true && zeusRemaining != 0) {

            for (Ship ship : zeusShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A8", zeusCounter)) {
                        A8.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        zeusCounter++;
                        break;
                    }
                }
            }
            if (zeusCounter == 2) {
                zeus1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                zeus2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                alreadyPressedZeus1 = false;
                alreadyPressedZeus2 = false;
                zeusCounter = 0;
                board.addShip(zeusShips[4 - zeusRemaining]);
                zeusRemaining--;
                zeusCounterLabel.setText(zeusRemaining + " x Zeus");
            }
        } else if (sledgehammerSelected == true && sledgehammerRemaining != 0) {

            for (Ship ship : sledgehammerShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A8", sledgehammerCounter)) {
                        A8.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                        sledgehammerCounter++;
                        break;
                    }
                }
            }
            if (sledgehammerCounter == 3) {
                sledgehammer1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammerCounter = 0;
                board.addShip(sledgehammerShips[3 - sledgehammerRemaining]);
                sledgehammerRemaining--;
                sledgehammerCounterLabel.setText(sledgehammerRemaining + " x Sledgehammer");
            }
        } else if (stellarSelected == true && stellarRemaining != 0) {

            for (Ship ship : stellarShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A8", stellarCounter)) {
                        A8.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        stellarCounter++;
                        break;
                    }
                }
            }
            if (stellarCounter == 4) {
                stellar1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellarCounter = 0;
                board.addShip(stellarShips[2 - stellarRemaining]);
                stellarRemaining--;
                stellarCounterLabel.setText(stellarRemaining + " x Stellar");
            }
        } else if (ajaxSelected == true && ajaxRemaining != 0) {

            for (Ship ship : ajaxShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A8", ajaxCounter)) {
                        A8.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                        ajaxCounter++;
                        break;
                    }
                }
            }
            if (ajaxCounter == 5) {
                ajax1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax5.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajaxCounter = 0;
                board.addShip(ajaxShips[1 - ajaxRemaining]);
                ajaxRemaining--;
                ajaxCounterLabel.setText(ajaxRemaining + " x Ajax");
            }
        }
        zeusSelected = false;
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = false;
        alreadyPressedA8 = true;
    }
    }

    public void handleButtonActionA9(ActionEvent actionEvent) {if (alreadyPressedA9 == false) {

        if (zeusSelected == true && zeusRemaining != 0) {

            for (Ship ship : zeusShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A9", zeusCounter)) {
                        A9.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        zeusCounter++;
                        break;
                    }
                }
            }
            if (zeusCounter == 2) {
                zeus1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                zeus2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                alreadyPressedZeus1 = false;
                alreadyPressedZeus2 = false;
                zeusCounter = 0;
                board.addShip(zeusShips[4 - zeusRemaining]);
                zeusRemaining--;
                zeusCounterLabel.setText(zeusRemaining + " x Zeus");
            }
        } else if (sledgehammerSelected == true && sledgehammerRemaining != 0) {

            for (Ship ship : sledgehammerShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A9", sledgehammerCounter)) {
                        A9.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                        sledgehammerCounter++;
                        break;
                    }
                }
            }
            if (sledgehammerCounter == 3) {
                sledgehammer1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammerCounter = 0;
                board.addShip(sledgehammerShips[3 - sledgehammerRemaining]);
                sledgehammerRemaining--;
                sledgehammerCounterLabel.setText(sledgehammerRemaining + " x Sledgehammer");
            }
        } else if (stellarSelected == true && stellarRemaining != 0) {

            for (Ship ship : stellarShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A9", stellarCounter)) {
                        A9.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        stellarCounter++;
                        break;
                    }
                }
            }
            if (stellarCounter == 4) {
                stellar1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellarCounter = 0;
                board.addShip(stellarShips[2 - stellarRemaining]);
                stellarRemaining--;
                stellarCounterLabel.setText(stellarRemaining + " x Stellar");
            }
        } else if (ajaxSelected == true && ajaxRemaining != 0) {

            for (Ship ship : ajaxShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A9", ajaxCounter)) {
                        A9.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                        ajaxCounter++;
                        break;
                    }
                }
            }
            if (ajaxCounter == 5) {
                ajax1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax5.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajaxCounter = 0;
                board.addShip(ajaxShips[1 - ajaxRemaining]);
                ajaxRemaining--;
                ajaxCounterLabel.setText(ajaxRemaining + " x Ajax");
            }
        }
        zeusSelected = false;
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = false;
        alreadyPressedA9 = true;
    }
    }

    public void handleButtonActionA10(ActionEvent actionEvent) {if (alreadyPressedA10 == false) {

        if (zeusSelected == true && zeusRemaining != 0) {

            for (Ship ship : zeusShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A10", zeusCounter)) {
                        A10.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                        zeusCounter++;
                        break;
                    }
                }
            }
            if (zeusCounter == 2) {
                zeus1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                zeus2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                alreadyPressedZeus1 = false;
                alreadyPressedZeus2 = false;
                zeusCounter = 0;
                board.addShip(zeusShips[4 - zeusRemaining]);
                zeusRemaining--;
                zeusCounterLabel.setText(zeusRemaining + " x Zeus");
            }
        } else if (sledgehammerSelected == true && sledgehammerRemaining != 0) {

            for (Ship ship : sledgehammerShips) {
                if (!ship.locationsFull()) {

                    if (validLocation(ship, "A10", sledgehammerCounter)) {
                        A10.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                        sledgehammerCounter++;
                        break;
                    }
                }
            }
            if (sledgehammerCounter == 3) {
                sledgehammer1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammer3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                sledgehammerCounter = 0;
                board.addShip(sledgehammerShips[3 - sledgehammerRemaining]);
                sledgehammerRemaining--;
                sledgehammerCounterLabel.setText(sledgehammerRemaining + " x Sledgehammer");
            }
        } else if (stellarSelected == true && stellarRemaining != 0) {

            for (Ship ship : stellarShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A10", stellarCounter)) {
                        A10.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        stellarCounter++;
                        break;
                    }
                }
            }
            if (stellarCounter == 4) {
                stellar1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellar4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                stellarCounter = 0;
                board.addShip(stellarShips[2 - stellarRemaining]);
                stellarRemaining--;
                stellarCounterLabel.setText(stellarRemaining + " x Stellar");
            }
        } else if (ajaxSelected == true && ajaxRemaining != 0) {

            for (Ship ship : ajaxShips) {
                if (!ship.locationsFull()) {
                    if (validLocation(ship, "A10", ajaxCounter)) {
                        A10.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                        ajaxCounter++;
                        break;
                    }
                }
            }
            if (ajaxCounter == 5) {
                ajax1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax4.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajax5.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
                ajaxCounter = 0;
                board.addShip(ajaxShips[1 - ajaxRemaining]);
                ajaxRemaining--;
                ajaxCounterLabel.setText(ajaxRemaining + " x Ajax");
            }
        }
        zeusSelected = false;
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = false;
        alreadyPressedA10 = true;
    }
    }

    public void handleButtonActionB1(ActionEvent actionEvent) {
    }

    public void handleButtonActionB2(ActionEvent actionEvent) {
    }

    public void handleButtonActionB3(ActionEvent actionEvent) {
    }

    public void handleButtonActionB4(ActionEvent actionEvent) {
    }

    public void handleButtonActionB5(ActionEvent actionEvent) {
    }

    public void handleButtonActionB6(ActionEvent actionEvent) {
    }

    public void handleButtonActionB7(ActionEvent actionEvent) {
    }

    public void handleButtonActionB8(ActionEvent actionEvent) {
    }

    public void handleButtonActionB9(ActionEvent actionEvent) {
    }

    public void handleButtonActionB10(ActionEvent actionEvent) {
    }

    public void handleButtonActionC1(ActionEvent actionEvent) {
    }

    public void handleButtonActionC2(ActionEvent actionEvent) {
    }

    public void handleButtonActionC3(ActionEvent actionEvent) {
    }

    public void handleButtonActionC4(ActionEvent actionEvent) {
    }

    public void handleButtonActionC5(ActionEvent actionEvent) {
    }

    public void handleButtonActionC6(ActionEvent actionEvent) {
    }

    public void handleButtonActionC7(ActionEvent actionEvent) {
    }

    public void handleButtonActionC8(ActionEvent actionEvent) {
    }

    public void handleButtonActionC9(ActionEvent actionEvent) {
    }

    public void handleButtonActionC10(ActionEvent actionEvent) {
    }

    public void handleButtonActionD1(ActionEvent actionEvent) {
    }

    public void handleButtonActionD2(ActionEvent actionEvent) {
    }

    public void handleButtonActionD3(ActionEvent actionEvent) {
    }

    public void handleButtonActionD4(ActionEvent actionEvent) {
    }

    public void handleButtonActionD5(ActionEvent actionEvent) {
    }

    public void handleButtonActionD6(ActionEvent actionEvent) {
    }

    public void handleButtonActionD7(ActionEvent actionEvent) {
    }

    public void handleButtonActionD8(ActionEvent actionEvent) {
    }

    public void handleButtonActionD9(ActionEvent actionEvent) {
    }

    public void handleButtonActionD10(ActionEvent actionEvent) {
    }

    public void handleButtonActionE1(ActionEvent actionEvent) {
    }

    public void handleButtonActionE2(ActionEvent actionEvent) {
    }

    public void handleButtonActionE3(ActionEvent actionEvent) {
    }

    public void handleButtonActionE4(ActionEvent actionEvent) {
    }

    public void handleButtonActionE5(ActionEvent actionEvent) {
    }

    public void handleButtonActionE6(ActionEvent actionEvent) {
    }

    public void handleButtonActionE7(ActionEvent actionEvent) {
    }

    public void handleButtonActionE8(ActionEvent actionEvent) {
    }

    public void handleButtonActionE9(ActionEvent actionEvent) {
    }

    public void handleButtonActionE10(ActionEvent actionEvent) {
    }

    public void handleButtonActionF1(ActionEvent actionEvent) {
    }

    public void handleButtonActionF2(ActionEvent actionEvent) {
    }

    public void handleButtonActionF3(ActionEvent actionEvent) {
    }

    public void handleButtonActionF4(ActionEvent actionEvent) {
    }

    public void handleButtonActionF5(ActionEvent actionEvent) {
    }

    public void handleButtonActionF6(ActionEvent actionEvent) {
    }

    public void handleButtonActionF7(ActionEvent actionEvent) {
    }

    public void handleButtonActionF8(ActionEvent actionEvent) {
    }

    public void handleButtonActionF9(ActionEvent actionEvent) {
    }

    public void handleButtonActionF10(ActionEvent actionEvent) {
    }

    public void handleButtonActionG1(ActionEvent actionEvent) {
    }

    public void handleButtonActionG2(ActionEvent actionEvent) {
    }

    public void handleButtonActionG3(ActionEvent actionEvent) {
    }

    public void handleButtonActionG4(ActionEvent actionEvent) {
    }

    public void handleButtonActionG5(ActionEvent actionEvent) {
    }

    public void handleButtonActionG6(ActionEvent actionEvent) {
    }

    public void handleButtonActionG7(ActionEvent actionEvent) {
    }

    public void handleButtonActionG8(ActionEvent actionEvent) {
    }

    public void handleButtonActionG9(ActionEvent actionEvent) {
    }

    public void handleButtonActionG10(ActionEvent actionEvent) {
    }

    public void handleButtonActionH1(ActionEvent actionEvent) {
    }

    public void handleButtonActionH2(ActionEvent actionEvent) {
    }

    public void handleButtonActionH3(ActionEvent actionEvent) {
    }

    public void handleButtonActionH4(ActionEvent actionEvent) {
    }

    public void handleButtonActionH5(ActionEvent actionEvent) {
    }

    public void handleButtonActionH6(ActionEvent actionEvent) {
    }

    public void handleButtonActionH7(ActionEvent actionEvent) {
    }

    public void handleButtonActionH8(ActionEvent actionEvent) {
    }

    public void handleButtonActionH9(ActionEvent actionEvent) {
    }

    public void handleButtonActionH10(ActionEvent actionEvent) {
    }

    public void handleButtonActionI1(ActionEvent actionEvent) {
    }

    public void handleButtonActionI2(ActionEvent actionEvent) {
    }

    public void handleButtonActionI3(ActionEvent actionEvent) {
    }

    public void handleButtonActionI4(ActionEvent actionEvent) {
    }

    public void handleButtonActionI5(ActionEvent actionEvent) {
    }

    public void handleButtonActionI6(ActionEvent actionEvent) {
    }

    public void handleButtonActionI7(ActionEvent actionEvent) {
    }

    public void handleButtonActionI8(ActionEvent actionEvent) {
    }

    public void handleButtonActionI9(ActionEvent actionEvent) {
    }

    public void handleButtonActionI10(ActionEvent actionEvent) {
    }

    public void handleButtonActionJ1(ActionEvent actionEvent) {
    }

    public void handleButtonActionJ2(ActionEvent actionEvent) {
    }

    public void handleButtonActionJ3(ActionEvent actionEvent) {
    }

    public void handleButtonActionJ4(ActionEvent actionEvent) {
    }

    public void handleButtonActionJ5(ActionEvent actionEvent) {
    }

    public void handleButtonActionJ6(ActionEvent actionEvent) {
    }

    public void handleButtonActionJ7(ActionEvent actionEvent) {
    }

    public void handleButtonActionJ8(ActionEvent actionEvent) {
    }

    public void handleButtonActionJ9(ActionEvent actionEvent) {
    }

    public void handleButtonActionJ10(ActionEvent actionEvent) {
    }

    public void handleBackButtonAction(ActionEvent actionEvent) {
        PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
    }

    public void handleContinueButtonAction(ActionEvent actionEvent) {
    }
}
