package GUI;

import java.io.IOException;

import javafx.fxml.FXMLLoader;

/**
 * @author Oliver Grubb This class contains all the fxml file locations for all
 *         scenes in the project and has methods to load a scene onto the stage.
 *
 */
public class PaneNavigator {

    public static final String MAIN = "/GUI/fxmlSheets/Main.fxml";
    public static final String LOGIN = "/GUI/fxmlSheets/Login.fxml";
    public static final String NEWUSER = "/GUI/fxmlSheets/NewUser.fxml";
    public static final String STARTSCREEN = "/GUI/fxmlSheets/StartScreen.fxml";
    public static final String SHIPPLACEMENT = "/GUI/fxmlSheets/ShipPlacementScreen.fxml";
    public static final String MAINGAME = "/GUI/fxmlSheets/MainGameScreen.fxml";

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
}
