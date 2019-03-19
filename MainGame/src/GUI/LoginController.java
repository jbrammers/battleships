package GUI;

import Client.Client;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import Client.Client;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Oliver Grubb
 * This class is the controller for the elements in the login screen
 *
 */
public class LoginController extends Controller {

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

            try {
                Client client = (Client) DataStore.getData().getObject("client");
                client.start();
                client.logIn(userInput, passInput);
            } catch (Exception e) {
                e.printStackTrace();
            }


            //if (correct) {
            //    PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
           // }
           // else LoginErrorMessage.errorMessage("Login information incorrect");
//            PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
        }

    }

    public void handleNewUserButtonAction() {
        PaneNavigator.loadPane(PaneNavigator.NEWUSER);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Client client = new Client();
        Thread thread = new Thread(client);
        DataStore.getData().addObjects("client", client);
        DataStore.getData().addObjects("thread", thread);
    }
}
