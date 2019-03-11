package GUI;

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

    private Pane loadMainPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();

        Pane mainPane = (Pane) loader.load(getClass().getResourceAsStream(PaneNavigator.MAIN));

        //initiates the stackpane
        MainController mainController = loader.getController();
        PaneNavigator.setMainController(mainController);

        //adds the startup page onto the stackpane (therefore to be shown first)
        PaneNavigator.loadPane(PaneNavigator.LOGIN);

        return mainPane;
    }

    private Scene createScene(Pane pane) {
        Scene scene = new Scene(pane);

        scene.getStylesheets().setAll(getClass().getResource("/resources/application.css").toExternalForm());

        return scene;
    }

    public static void main(String[] args) {
        launch(args);

    }
}

