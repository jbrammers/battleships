package Server;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Player {
    private String username;
    private Socket socket;
    private InputStreamReader is;
    private OutputStream os;
    private PrintWriter out;
    private Scanner input;
    private Player opponent;
    private boolean ready;

    public Player (String username, Socket socket) {
        this.username = username;
        this.socket = socket;
        try {
            this.is = new InputStreamReader(socket.getInputStream());
            this.os = socket.getOutputStream();
            out = new PrintWriter(os, true);
            input = new Scanner(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ready = false;
    }

    public String getUsername() {
        return username;
    }

    public Socket getSocket() {
        return socket;
    }

    public boolean isSocketConnected() {

        int tries = 1;
        while (tries <= 3) {
            try {
                input.nextLine();
                break;
            } catch (Exception e) {
                tries++;
            }
        }

        return !(tries >= 3);
    }

    public InputStreamReader getIs() {
        return is;
    }

    public OutputStream getOs() {
        return os;
    }

    public PrintWriter getOut() {
        return out;
    }

    public Scanner getInput() { return input; }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public Player getOpponent() { return opponent; }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", socket=" + socket +
                '}';
    }
}
