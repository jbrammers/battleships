package ClientProgram.GUI;

import ClientProgram.Client.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class LeaderBoardController implements javafx.fxml.Initializable {
    private ArrayList<PlayerData> leaderboard;
    private ArrayList<Label> labelArrayList = new ArrayList<>();

    @FXML
    Label Label1;
    @FXML
    Label Label2;
    @FXML
    Label Label3;
    @FXML
    Label Label4;
    @FXML
    Label Label5;
    @FXML
    Label Label6;
    @FXML
    Label Label7;
    @FXML
    Label Label8;
    @FXML
    Label Label9;
    @FXML
    Label Label10;
    @FXML
    Label Label11;
    @FXML
    Label Label12;
    @FXML
    Label Label13;
    @FXML
    Label Label14;
    @FXML
    Label Label15;
    @FXML
    Label Label16;
    @FXML
    Label Label17;
    @FXML
    Label Label18;
    @FXML
    Label Label19;
    @FXML
    Label Label20;
    @FXML
    Label Label21;
    @FXML
    Label Label22;
    @FXML
    Label Label23;
    @FXML
    Label Label24;
    @FXML
    Label Label25;
    @FXML
    Label Label26;
    @FXML
    Label Label27;
    @FXML
    Label Label28;
    @FXML
    Label Label29;
    @FXML
    Label Label30;
    @FXML
    Label Label31;
    @FXML
    Label Label32;
    @FXML
    Label Label33;
    @FXML
    Label Label34;
    @FXML
    Label Label35;
    @FXML
    Label Label36;
    @FXML
    Label Label37;
    @FXML
    Label Label38;
    @FXML
    Label Label39;
    @FXML
    Label Label40;

    public void handleBackButtonAction(ActionEvent actionEvent) {
        PaneNavigator.loadPane(PaneNavigator.STARTSCREEN);
    }

    private void initiliseLabelArray() {
        labelArrayList.add(Label1);
        labelArrayList.add(Label2);
        labelArrayList.add(Label3);
        labelArrayList.add(Label4);
        labelArrayList.add(Label5);
        labelArrayList.add(Label6);
        labelArrayList.add(Label7);
        labelArrayList.add(Label8);
        labelArrayList.add(Label9);
        labelArrayList.add(Label10);
        labelArrayList.add(Label11);
        labelArrayList.add(Label12);
        labelArrayList.add(Label13);
        labelArrayList.add(Label14);
        labelArrayList.add(Label15);
        labelArrayList.add(Label16);
        labelArrayList.add(Label17);
        labelArrayList.add(Label18);
        labelArrayList.add(Label19);
        labelArrayList.add(Label20);
        labelArrayList.add(Label21);
        labelArrayList.add(Label22);
        labelArrayList.add(Label23);
        labelArrayList.add(Label24);
        labelArrayList.add(Label25);
        labelArrayList.add(Label26);
        labelArrayList.add(Label27);
        labelArrayList.add(Label28);
        labelArrayList.add(Label29);
        labelArrayList.add(Label30);
        labelArrayList.add(Label31);
        labelArrayList.add(Label32);
        labelArrayList.add(Label33);
        labelArrayList.add(Label34);
        labelArrayList.add(Label35);
        labelArrayList.add(Label36);
        labelArrayList.add(Label37);
        labelArrayList.add(Label38);
        labelArrayList.add(Label39);
        labelArrayList.add(Label40);

    }

    private void occupyLeaderboard() {
        int counter = 0;
        for (PlayerData data : leaderboard) {
            String[] split = data.toString().split("!");
            for (int i = 0; i < 4; i++) {
                labelArrayList.get(counter).setText(split[i]);
                counter++;
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        leaderboard = new ArrayList<>();
        Client client = (Client) DataStore.getData().getObject("client");
        client.send("SYSTEM leaderboard");

        try {
            ObjectInputStream ois = new ObjectInputStream(client.getIs());
            List<String> data = (ArrayList<String>) ois.readObject();
            for (String s : data) {
                String[] strings = s.split("!");
                leaderboard.add(new PlayerData(strings[0],
                        Integer.parseInt(strings[1]),
                        Integer.parseInt(strings[2]),
                        Float.parseFloat(strings[3])));
            }
        } catch (Exception e) {
            System.out.println("Leaderboard information couldn't be collected");
            e.printStackTrace();
        }
        initiliseLabelArray();
        occupyLeaderboard();
    }
}

