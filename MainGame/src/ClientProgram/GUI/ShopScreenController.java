package ClientProgram.GUI;

import javafx.application.Platform;
import javafx.event.ActionEvent;
/**
 * @author Oliver Grubb
 * This class controls all the elements seen in the shop.
 *
 */
public class ShopScreenController {

    /**
     * handles click on buy button for row bombardment
     * @param actionEvent
     */
    public void handleRowBombardmentButtonAction(ActionEvent actionEvent) {
        if (MainGameController.getScore() >= 800) {
            MainGameController.rowBombardmentCounter++;
            MainGameController.setScore(MainGameController.getScore()-800);
            MainGameController ctrl = (MainGameController) DataStore.getData().getObject("main game");
            Platform.runLater(() -> ctrl.updateScoreCounter());
            Platform.runLater(() -> ctrl.updateShopOptions());
        }
        else {
            PopUpMessage.popUp("Insufficient points!");
        }
    }
    /**
     * handles click on buy button for nuke
     * @param actionEvent
     */
    public void handleNukeButtonAction(ActionEvent actionEvent) {
        if (MainGameController.getScore() >= 800) {
            MainGameController.nukeCounter++;
            MainGameController.setScore(MainGameController.getScore()-800);
            MainGameController ctrl = (MainGameController) DataStore.getData().getObject("main game");
            Platform.runLater(() -> ctrl.updateScoreCounter());
            Platform.runLater(() -> ctrl.updateShopOptions());
        }
        else {
            PopUpMessage.popUp("Insufficient points!");
        }
    }
    /**
     * handles click on buy button for column bombardment
     * @param actionEvent
     */
    public void handleColumnBombardmentButtonAction(ActionEvent actionEvent) {
        if (MainGameController.getScore() >= 1000) {
            MainGameController.columnBombardmentCounter++;
            MainGameController.setScore(MainGameController.getScore()-800);
            MainGameController ctrl = (MainGameController) DataStore.getData().getObject("main game");
            Platform.runLater(() -> ctrl.updateScoreCounter());
            Platform.runLater(() -> ctrl.updateShopOptions());
        }
        else {
            PopUpMessage.popUp("Insufficient points!");
        }
    }
}
