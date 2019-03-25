package ServerProgram.Server;

import java.io.IOException;
import java.util.ArrayList;

public class Game implements Runnable {
    private int gameID;
    private ArrayList<Player> playerList;
    private Player player1;
    private Player player2;
    private boolean gameFilled = false;
    private boolean gameProgressing = false;
    private boolean gameFinished = false;

    public Game (Player player, int ID) {
        this.gameID = ID;
        playerList = new ArrayList<>();
        addPlayer(player);
    }

    /**
     * Allows a player to be added to a game instance
     * @param player Player to be added
     */
    public void addPlayer(Player player) {
        playerList.add(player);
        if (player1 == null) {
            player1 = player;
            player1.setGame(this);
        } else {
            player2 = player;
            player2.setGame(this);
            player1.setOpponent(player2);
            player2.setOpponent(player1);
            gameFilled = true;
        }
    }


    public void run() {
        try{
            // Loops through the game until a winner is found
            while (!this.isGameFinished()) {

                try {

                    // Checks to see if both players are ready and the game isn't already progressing
                    if (player1.isReady() &&
                        player2.isReady() &&
                            !gameProgressing) {
                        gameStart();
                    } else {
                        // Otherwise the game is either in progress or not ready, so the thread yields
                        Thread.yield();
                    }

                } catch (IllegalStateException e) {
                    Thread.yield();
                } catch (NullPointerException e){
                    Thread.sleep(1000);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } catch (InterruptedException e) {
            System.out.println("ClientProgram.Game ID" + gameID + " stalled ");
            new Thread(this).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Starts the game by sending a message to each player that they are now in a game
     */
    private void gameStart() {
        System.out.printf("ClientProgram.Game ID %d started!\n", gameID);
        for (Player player: playerList) {
            System.out.println(player.toString());
            player.getOut().println(("MESSAGE Welcome to a BattleShips match between " + playerList.get(0).getUsername() +
                                    " and " + playerList.get(1).getUsername()));
        }
        gameProgressing = true;
        player1.getOut().println("SYSTEM yourturn");
        player2.getOut().println("SYSTEM theirturn");
    }

    /**
     * Sends a message to each client that the game is over and disconnects them
     * @throws IOException
     */
    public void endGame() throws IOException {
        System.out.println(String.format("ClientProgram.Game ID %d ending!", gameID));
        for (Player p:
                playerList) {
            p.getOut().println("CLIENT_CLOSE");
            p.getSocket().close();
        }
        gameFinished = true;
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
