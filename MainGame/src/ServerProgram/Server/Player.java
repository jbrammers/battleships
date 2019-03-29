package ServerProgram.Server;

import java.io.*;
import java.net.Socket;

public class Player implements Runnable{
    private String username;
    private Socket socket;
    private InputStreamReader is;
    private OutputStream os;
    private PrintWriter out;
    private BufferedReader input;
    private Player opponent;
    private boolean ready;
    private Game game;
    private Server server;
    private boolean connected;

    public Player (String username, Socket socket, Server server) {
        this.username = username;
        this.socket = socket;
        this.server = server;
        this.connected = true;
        try {
            this.is = new InputStreamReader(socket.getInputStream());
            this.os = socket.getOutputStream();
            out = new PrintWriter(os, true);
            input = new BufferedReader(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ready = false;
    }

    public void run() {
        try {
            while (true) {
                String nextLine = input.readLine();
                MessageHandler.inputCheck(nextLine, this);
            }
        } catch (IOException e) {}
    }

    public String getUsername() {
        return username;
    }

    Socket getSocket() {
        return socket;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * Sends an echo to the client and expects a reply - used to check the player is still connected
     *
     */
    public void isSocketConnected() {

        int tries = 1;
        while (tries <= 3) {
            try {
                out.println("ECHO");
                if (input.readLine().equals("ECHO REPLY")) {
                    break;
                }
            } catch (Exception e) {
                tries++;
            }
        }

        if (tries > 3) {
            connected = false;
        } else {
            connected = true;
        }
    }

    public InputStreamReader getIs() {
        return is;
    }

    public PrintWriter getOut() {
        return out;
    }

    public OutputStream getOs() {
        return os;
    }

    void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    Player getOpponent() { return opponent; }

    boolean isReady() {
        return ready;
    }

    void setReady(boolean ready) {
        this.ready = ready;
    }

    public Server getServer() {
        return server;
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", socket=" + socket +
                '}';
    }
}
