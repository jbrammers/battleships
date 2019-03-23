package Database;

import java.util.ArrayList;

public class DatabaseRunner {
    public static void main(String[] args) {
        DatabaseManager db = new DatabaseManager();
        ArrayList<PlayerData> results = db.calculateLeaderBoard();
        for (PlayerData player : results) {
            System.out.println(player.getUsername() + " " + player.getWinratio());
        }
    }
}
