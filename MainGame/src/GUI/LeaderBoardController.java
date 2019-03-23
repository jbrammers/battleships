package GUI;

import Database.DatabaseManager;
import Database.PlayerData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LeaderBoardController implements javafx.fxml.Initializable {
    private DatabaseManager db;
    private ArrayList<PlayerData> leaderboard;

    @FXML
    TextArea board;

    public void handleBackButtonAction(ActionEvent actionEvent) {
        PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
    }

    private void occupyLeaderboard() {
        int counter = 1;
        String data = String.format("|%5s Rank %5s|%16s Username %16s|%5s Wins %5s|%5s Losses %5s|%5s W/L Ratio %5s|\n", "", "", "", "", "", "", "", "", "", "");
        for (PlayerData playerData: leaderboard) {
            data += "|-------------|----------------------------------|-------------|---------------|-------------------|\n";
            data += ("|        " + counter + "         " + (playerData.toString()) + "\n");
            counter++;
        }
        data += "|-------------|----------------------------------|-------------|---------------|-------------------|\n";
        board.setText(data);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        db = new DatabaseManager();
        leaderboard = db.calculateLeaderBoard();
        db = null;
        occupyLeaderboard();
    }
}

