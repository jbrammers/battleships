package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * @author Oliver Grubb
 * This class is the controller for the elements in the login screen
 *
 */
public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button newUserButton;

    public void handleLoginButtonAction() {

        if (usernameField.getText().isEmpty()) {
            LoginErrorMessage.errorMessage("Please enter a valid username");
        }

        if (passwordField.getText().isEmpty()) {
            LoginErrorMessage.errorMessage("Please enter a valid password");
        }

        else {
            PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
        }

    }

    public void handleNewUserButtonAction() {
        PaneNavigator.loadPane(PaneNavigator.NEWUSER);

    }




}
