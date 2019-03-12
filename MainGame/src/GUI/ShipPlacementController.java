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

    private boolean zeusSelected = false;
    private boolean sledgehammerSelected = false;
    private boolean stellarSelected = false;
    private boolean ajaxSelected = false;
    private int zeusCounter = 0;
    private int sledgehammerCounter = 0;
    private int stellarCounter = 0;
    private int ajaxCounter = 0;
    public static Gameboard board = new Gameboard();
    private Ship zeusShip1 = new Ship("Zeus", 2);
    private Ship zeusShip2 = new Ship("Zeus", 2);
    private Ship zeusShip3 = new Ship("Zeus", 2);
    private Ship zeusShip4 = new Ship("Zeus", 2);
    private Ship sledgehammerShip1 = new Ship("Sledgehammer", 3);
    private Ship sledgehammerShip2 = new Ship("Sledgehammer", 3);
    private Ship sledgehammerShip3 = new Ship("Sledgehammer", 3);
    private Ship stellarShip1 = new Ship("Stellar", 4);
    private Ship stellarShip2 = new Ship("Stellar", 4);
    private Ship ajaxShip2 = new Ship("Ajax", 5);

    public void handleButtonActionZeus1(ActionEvent actionEvent) {
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = false;
        zeusSelected = true;
        zeus1.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
    }

    public void handleButtonActionZeus2(ActionEvent actionEvent) {
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = false;
        zeusSelected = true;
        zeus2.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
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



    public void handleButtonActionA1(ActionEvent actionEvent) {
        if (zeusSelected == true) {
            A1.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            zeusCounter++;
            if (zeusCounter == 2) {
                zeus1.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
                zeus2.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
                zeusCounter = 0;
                
                zeusShip1.getLocation().add("A1");
            }
        }
        else if (sledgehammerSelected == true) {
            A1.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
            sledgehammerCounter++;
        }
        else if (stellarSelected == true) {
            A1.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
            stellarCounter++;
        }
        else if (ajaxSelected == true) {
            A1.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
            ajaxCounter++;
        }
        zeusSelected = false;
        sledgehammerSelected = false;
        stellarSelected = false;
        ajaxSelected = false;

    }

    public void handleButtonActionA2(ActionEvent actionEvent) {
    }

    public void handleButtonActionA3(ActionEvent actionEvent) {
    }

    public void handleButtonActionA4(ActionEvent actionEvent) {
    }

    public void handleButtonActionA5(ActionEvent actionEvent) {
    }

    public void handleButtonActionA6(ActionEvent actionEvent) {
    }

    public void handleButtonActionA7(ActionEvent actionEvent) {
    }

    public void handleButtonActionA8(ActionEvent actionEvent) {
    }

    public void handleButtonActionA9(ActionEvent actionEvent) {
    }

    public void handleButtonActionA10(ActionEvent actionEvent) {
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
