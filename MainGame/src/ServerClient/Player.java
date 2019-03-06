package ServerClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Player {
    private String username;
    private Socket socket;
    private InputStream is;
    private OutputStream os;
    private PrintWriter out;

    public Player (String username, Socket socket) {
        this.username = username;
        this.socket = socket;
        try {
            this.is = socket.getInputStream();
            this.os = socket.getOutputStream();
            out = new PrintWriter(os, true);
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

    public InputStream getIs() {
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
