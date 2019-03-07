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

        else if (passwordField.getText().isEmpty()) {
            LoginErrorMessage.errorMessage("Please enter a valid password");
        }

        else {
            String userInput = usernameField.getText();
            String passInput = passwordField.getText();


            //TODO Send login info to server to be checked against database

            //if (correct) {
            //    PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
           // }
           // else LoginErrorMessage.errorMessage("Login information incorrect");
            PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
        }

    }

    public void handleNewUserButtonAction() {
        PaneNavigator.loadPane(PaneNavigator.NEWUSER);

    }




}
