package GUI;
import Client.Client;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import Client.Client;

/**
 * @author Oliver Grubb
 * This class is the controller for elements on the start screen.
 *
 */
public class StartScreenController {

    @FXML
    private Button leaderboardsButton;

    @FXML
    private Button startButton;

    public void handleLeaderboardsButtonAction() {

    }

    public void handleStartButtonAction() {
        // Client client = new Client();
        // client.run();
        PaneNavigator.loadPane(PaneNavigator.SHIPPLACEMENT);
    }

}

