package ClientProgram.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Oliver Grubb
 * This class is the main class which starts the program and handles what is shown in the scene
 *
 */
public class application extends Application {

    /**
     * starts application
     * @param stage
     */
    @Override
    public void start(Stage stage) {

        stage.setTitle("Battleships");

        try {
            stage.setScene(createScene(loadMainPane()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.show();

    }

    /**
     * loads panes onto main stackpane
     * @return
     * @throws IOException
     */
    private Pane loadMainPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();

        Pane mainPane = (Pane) loader.load(getClass().getResourceAsStream(PaneNavigator.MAIN));

        //initiates the stackpane
        MainController mainController = loader.getController();
        PaneNavigator.setMainController(mainController);

        //adds the login page onto the stackpane (therefore to be shown first)
        PaneNavigator.loadPane(PaneNavigator.LOGIN);

        return mainPane;
    }

    /**
     * creates scene
     * @param pane
     * @return
     */
    private Scene createScene(Pane pane) {
        Scene scene = new Scene(pane);

        scene.getStylesheets().setAll(getClass().getResource("/ClientProgram/resources/application.css").toExternalForm());

        return scene;
    }

    /**
     * launches application
     * @param args
     */
    public static void main(String[] args) {
        launch(args);

    }
}

