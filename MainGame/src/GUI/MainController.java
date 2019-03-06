package GUI;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 * @author Oliver Grubb This class is the controller for the main scene. It
 *         works by being a stack of panes, on which all other scenes are added
 *         to for easy scene navigation.
 *
 */
public class MainController {

    @FXML
    private StackPane paneHolder;

    public void setPane(Node node) {
        paneHolder.getChildren().setAll(node);
    }

}
