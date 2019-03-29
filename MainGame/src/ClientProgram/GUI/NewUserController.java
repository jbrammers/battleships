package ClientProgram.GUI;

import ClientProgram.Client.Client;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Oliver Grubb
 * This class is the controller for the elements in the New User scene
 *
 */
public class NewUserController implements Initializable {

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

    /**
     * handles click on back button
     */
    public void handleBackButtonAction() {
        PaneNavigator.loadPane(PaneNavigator.LOGIN);
    }

    /**
     * handles click on create account button
     */
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
            PopUpMessage.errorMessage("Password must be 32 characters or less");
            return;
        }

        else {
            Client client = (Client) DataStore.getData().getObject("client");

            if (client.newUser(usernameField.getText(), passwordField.getText())) {
                PopUpMessage.popUp("Congratulations, your account has been successfully created!");
                PaneNavigator.loadPane(PaneNavigator.LOGIN);
            } else {
                PopUpMessage.errorMessage("Couldn't set up your account. Please try again with a new username.");
                PaneNavigator.loadPane(PaneNavigator.NEWUSER);
            }
        }

    }

    /**
     * initilises pane
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {    }
}
