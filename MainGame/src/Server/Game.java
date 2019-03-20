package Server;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

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
            new Thread(player1).start();
        } else {
            player2 = player;
            new Thread(player2).start();
            player1.setOpponent(player2);
            player2.setOpponent(player1);
            gameFilled = true;
        }
    }


    /**
     * Runs the game itself
     */
    public void run() {
        try {
            int endGame = 0;

            // Loops through the game until a winner is found
            while (!this.isGameFinished()) {
                // TODO replace this sleeping thread with the game engine

                try {
                    Iterator<Player> iterator = playerList.iterator();
                    while (iterator.hasNext()) {
                        Player p = iterator.next();


//                        String nextLine;
//                        try {
//                            while ((nextLine = p.getInput().readLine()) != null)  {
//                                MessageHandler.inputCheck(nextLine, p);
//                            }
//                        } catch (IndexOutOfBoundsException e) {
//                            endGame();
//                        }
                    }

                    if (player1.isReady() &&
                        player2.isReady() &&
                            !gameProgressing) {
                        gameStart();
                    } else {
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

                // TODO add the winning clause here in an if statement maybe?
                endGame++;
                // Uncomment these lines if you want a finite game length - can change the MAX_VALUE too
//                if (endGame == Integer.MAX_VALUE) {
//                    endGame();
//                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Starts the game by sending a message to each player that they are now in a game
     */
    public void gameStart() {
        System.out.printf("Game ID %d started!\n", gameID);
        for (Player player: playerList) {
            System.out.println(player.toString());
            player.getOut().println(("MESSAGE Welcome to a BattleShips match between " + playerList.get(0).getUsername() +
                                    " and " + playerList.get(1).getUsername()));
        }
        gameProgressing = true;
    }

    /**
     * Sends a message to each client that the game is over and disconnects them
     * @throws IOException
     */
    public void endGame() throws IOException {
        System.out.println(String.format("Game ID %d ending!", gameID));
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
