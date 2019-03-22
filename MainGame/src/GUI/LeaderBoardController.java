package GUI;

import Database.DatabaseManager;
import Database.PlayerData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LeaderBoardController implements javafx.fxml.Initializable {
    private DatabaseManager db;
    private ArrayList<PlayerData> leaderboard;

    @FXML
    TextField board;

    public void handleBackButtonAction(ActionEvent actionEvent) {
        PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
    }

    private void occupyLeaderboard() {
        //TODO access database and print relevant info in good format.
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        db = new DatabaseManager();
        leaderboard = db.calculateLeaderBoard();
        db = null;
    }
}

