package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * @author Oliver Grubb
 * This class is the controller for the elements in the New User scene
 *
 */
public class NewUserController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField rePasswordField;

    @FXML
    private Button createAccountButton;

    @FXML
    private Button backButton;

    public void handleBackButtonAction() {
        PaneNavigator.loadPane(PaneNavigator.LOGIN);
    }

    public void handleCreateAccountButtonAction() {

        if (usernameField.getText().isEmpty()) {
            LoginErrorMessage.errorMessage("Please enter a username");
            return;

        }

        if (!passwordField.getText().equals(rePasswordField.getText())) {
            LoginErrorMessage.errorMessage("Passwords must match");
            return;

        }

        if (passwordField.getText().isEmpty()) {
            LoginErrorMessage.errorMessage("Please enter a password");
            return;

        }

        if (rePasswordField.getText().isEmpty()) {
            LoginErrorMessage.errorMessage("Please re-enter your password");
            return;

        }

        else {
            StandardUser newUser = new StandardUser(usernameField.getText(), passwordField.getText());
            PaneNavigator.loadPane(PaneNavigator.LOGIN);
        }

    }


}
