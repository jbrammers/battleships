package Database;

import java.util.Random;

public class DatabaseRunner {
    public static void main(String[] args) {
        DatabaseManager db = new DatabaseManager();
        for (int i = 0; i <= 100; i++) {
            Random rand = new Random();
            int player1 = rand.nextInt(30);
            int player2 = rand.nextInt(30);
            while (player2 == player1)  {
                player2 = rand.nextInt(30);
            }
            db.updateGameHistory(true,"player" + player1 );
            db.updateGameHistory(false, "player"+player2);
        }
    }
}
