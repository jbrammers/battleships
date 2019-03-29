package ClientProgram.GUI;


import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


/**
 * @author Oliver Grubb
 * This class is a helper class to throw an error message in a new window with a message
 *
 */
public class PopUpMessage {
    /**
     * launches error message
     * @param message
     */
    public static void errorMessage(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * launches informative pop up
     * @param message
     */
    public static void popUp(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(message);
        alert.showAndWait();
    }
}