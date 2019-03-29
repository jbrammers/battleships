package ClientProgram.GUI;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

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

    /**
     * handles click on leaderboards button
     */
    public void handleLeaderboardsButtonAction() {
        PaneNavigator.loadPane(PaneNavigator.LEADERBOARD);
    }
    /**
     * handles click on start button
     */
    public void handleStartButtonAction() {
        PaneNavigator.loadPane(PaneNavigator.SHIPPLACEMENT);
    }

}

