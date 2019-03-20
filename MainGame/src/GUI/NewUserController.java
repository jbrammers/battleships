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
            PopUpMessage.errorMessage("Please enter a username");
            return;
        }

        if (!passwordField.getText().equals(rePasswordField.getText())) {
            PopUpMessage.errorMessage("Passwords must match");
            return;
        }

        if (passwordField.getText().isEmpty()) {
            PopUpMessage.errorMessage("Please enter a password");
            return;
        }

        if (rePasswordField.getText().isEmpty()) {
            PopUpMessage.errorMessage("Please re-enter your password");
            return;
        }

        if (usernameField.getText().length() > 16) {
            PopUpMessage.errorMessage("Username must be 16 characters or less");
            return;
        }
        else if (passwordField.getText().length() > 32) {
            PopUpMessage.errorMessage("Username must be 16 characters or less");
            return;
        }

        else {
            //TODO check if username is unique, if so add new user into database, else display error
            StandardUser newUser = new StandardUser(usernameField.getText(), passwordField.getText());
            PopUpMessage.popUp("Congratulations, your account has been successfully created!");
            PaneNavigator.loadPane(PaneNavigator.LOGIN);
        }

    }


}
