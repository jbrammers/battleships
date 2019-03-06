package ServerClient;

import java.io.IOException;
import java.util.ArrayList;

public class Game implements Runnable {
    private double gameID;
    private ArrayList<Player> playerList;
    private boolean gameFilled = false;
    private boolean gameProgressing = false;
    private boolean gameFinished = false;

    public Game (Player player) {
        this.gameID = Math.random()*100;
        playerList = new ArrayList<>();
        this.playerList.add(player);
    }

    /**
     * Allows a player to be added to a game instance
     * @param player Player to be added
     */
    public void addPlayer(Player player) {
        playerList.add(player);
        gameFilled = true;
    }

    /**
     * Checks to see if the first player is still connected
     * @return
     */
    public boolean waitingCheck() {
        if (playerList.isEmpty()) return false;
        return playerList.get(0).getSocket().isConnected();
    }

    /**
     * Runs the game itself
     */
    public void run() {
        try {
            // Starts the game
            gameStart();

            // Loops through the game until a winner is found
            while (!this.isGameFinished()) {
                // TODO replace this sleeping thread with the game engine
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                // TODO add the winning clause here in an if statement maybe?
                gameFinished = true;
            }

            endGame();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Starts the game by sending a message to each player that they are now in a game
     * @throws IOException
     */
    public void gameStart() throws IOException {
        System.out.printf("Game ID %.0f started!\n", gameID);
        for (Player player: playerList) {
            System.out.println(player.toString());
            player.getOut().println(("Welcome to a BattleShips match between " + playerList.get(0).getUsername() +
                                    " and " + playerList.get(1).getUsername()));
        }
        gameProgressing = true;
    }

    /**
     * Sends a message to each client that the game is over and disconnects them
     * @throws IOException
     */
    public void endGame() throws IOException {
        System.out.println(String.format("Game ID %.0f ending!", gameID));
        for (Player p:
                playerList) {
            p.getOut().println("CLIENT_CLOSE");
            p.getSocket().close();
        }
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public boolean isGameFilled() {
        return gameFilled;
    }

    public boolean isGameProgressing() {
        return gameProgressing;
    }

    public boolean isGameFinished() {
        return gameFinished;
    }

    public double getID() {
        return gameID;
    }
}
