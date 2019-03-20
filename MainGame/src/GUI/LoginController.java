package GUI;

import Client.Client;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Oliver Grubb
 * This class is the controller for the elements in the login screen
 *
 */
public class LoginController implements Initializable {

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
            PopUpMessage.errorMessage("Please enter a valid username");
        }

        else if (passwordField.getText().isEmpty()) {
            PopUpMessage.errorMessage("Please enter a valid password");
        }

        else {
            String userInput = usernameField.getText();
            String passInput = passwordField.getText();
            boolean auth = false;
            try {
                Client client = (Client) DataStore.getData().getObject("client");
                auth = client.logIn(userInput, passInput);
            } catch (Exception e) {
                e.printStackTrace();
            }


            if (auth) {
                PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
            }
            else {
                PopUpMessage.errorMessage("Login information incorrect");
                PaneNavigator.loadPane(PaneNavigator.LOGIN);
            }
        }

    }

    public void handleNewUserButtonAction() {
        PaneNavigator.loadPane(PaneNavigator.NEWUSER);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Client client = new Client();
        Thread thread = new Thread(client);
        client.start();
        DataStore.getData().addObjects("client", client);
        DataStore.getData().addObjects("thread", thread);
    }
}
