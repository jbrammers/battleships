package ClientProgram.GUI;

import java.io.IOException;

import javafx.fxml.FXMLLoader;

/**
 * @author Oliver Grubb This class contains all the fxml file locations for all
 *         scenes in the project and has methods to load a scene onto the stage.
 *
 */
public class PaneNavigator {

    public static final String MAIN = "/ClientProgram/GUI/fxmlSheets/Main.fxml";
    public static final String LOGIN = "/ClientProgram/GUI/fxmlSheets/Login.fxml";
    public static final String NEWUSER = "/ClientProgram/GUI/fxmlSheets/NewUser.fxml";
    public static final String STARTSCREEN = "/ClientProgram/GUI/fxmlSheets/StartScreen.fxml";
    public static final String SHIPPLACEMENT = "/ClientProgram/GUI/fxmlSheets/ShipPlacementScreen.fxml";
    public static final String MAINGAME = "/ClientProgram/GUI/fxmlSheets/MainGameScreen.fxml";
    public static final String LEADERBOARD = "/ClientProgram/GUI/fxmlSheets/LeaderboardScreen.fxml";

    private static MainController mainController;

    public static void setMainController(MainController mainController) {
        PaneNavigator.mainController = mainController;
    }

    public static void loadPane(String fxml) {
        try {
            mainController.setPane(FXMLLoader.load(PaneNavigator.class.getResource(fxml)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static MainController getController(){
        return mainController;
    }


}
