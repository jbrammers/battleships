package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LeaderBoardController implements javafx.fxml.Initializable {

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
        //TODO fill out leaderboard
    }
}

