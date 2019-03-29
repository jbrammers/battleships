package ServerProgram.Database;

import java.util.ArrayList;
import java.util.Random;

public class DatabaseRunner {
    public static void main(String[] args) {
        DatabaseManager db = new DatabaseManager();

        // RETRIEVE AND DISPLAY DATABASE
        ArrayList<PlayerData> results = db.calculateLeaderBoard();
        for (PlayerData player : results) {
            System.out.println(player.getUsername() + " " + player.getWinratio() + " " + player.getWins() + " " + player.getLosses());
        }


        // POPULATE DATABASE
//        Random r1 = new Random();
//        for (int i = 0; i < 1000; i++) {
//            String player1 = "player";
//            int p1 = r1.nextInt(30);
//            player1 += p1;
//
//            String player2 = "player";
//            int p2 = r1.nextInt(30);
//            while (p1 == p2) {
//                p2 = r1.nextInt(30);
//            }
//
//            player2 += p2;
//
//            db.updateGameHistory(true, player1);
//            db.updateGameHistory(false, player2);
//        }
    }
}
