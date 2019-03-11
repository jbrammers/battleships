package ServerClient;

import java.io.*;
import java.net.Socket;

public class Player {
    private String username;
    private Socket socket;
    private InputStreamReader is;
    private OutputStream os;
    private PrintWriter out;
    private BufferedReader input;

    public Player (String username, Socket socket) {
        this.username = username;
        this.socket = socket;
        try {
            this.is = new InputStreamReader(socket.getInputStream());
            this.os = socket.getOutputStream();
            out = new PrintWriter(os, true);
            input = new BufferedReader(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            out.println("ECHO");
            try {
                if (input.readLine() == "ECHO") {
                    return true;
                }
            } catch (IOException e) {
                tries ++;
            }
        }

        return false;
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

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", socket=" + socket +
                '}';
    }
}
