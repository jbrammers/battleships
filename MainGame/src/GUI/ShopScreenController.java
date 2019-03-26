package GUI;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class ShopScreenController {


    public void handleRowBombardmentButtonAction(ActionEvent actionEvent) {
        if (MainGameController.getScore() >= 800) {
            MainGameController.rowBombardmentCounter++;
            MainGameController.setScore(MainGameController.getScore()-800);
            MainGameController ctrl = (MainGameController) DataStore.getData().getObject("main game");
            Platform.runLater(() -> ctrl.updateScoreCounter());
            Platform.runLater(() -> ctrl.updateShopOptions());
        }
    }

    public void handleNukeButtonAction(ActionEvent actionEvent) {
        if (MainGameController.getScore() >= 800) {
            MainGameController.nukeCounter++;
            MainGameController.setScore(MainGameController.getScore()-800);
            MainGameController ctrl = (MainGameController) DataStore.getData().getObject("main game");
            Platform.runLater(() -> ctrl.updateScoreCounter());
            Platform.runLater(() -> ctrl.updateShopOptions());
        }
    }

    public void handleColumnBombardmentButtonAction(ActionEvent actionEvent) {
        if (MainGameController.getScore() >= 1000) {
            MainGameController.columnBombardmentCounter++;
            MainGameController.setScore(MainGameController.getScore()-1000);
            MainGameController ctrl = (MainGameController) DataStore.getData().getObject("main game");
            Platform.runLater(() -> ctrl.updateScoreCounter());
            Platform.runLater(() -> ctrl.updateShopOptions());
        }
    }
}
