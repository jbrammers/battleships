package GUI;


import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


/**
 * @author Oliver Grubb
 * This class is a helper class to throw an error message in a new window with a message
 *
 */
public class PopUpMessage {

    public static void errorMessage(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void popUp(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(message);
        alert.showAndWait();
    }
}