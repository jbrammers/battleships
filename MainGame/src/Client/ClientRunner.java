package Client;

/**
 * Created by jxb1175 on 18/03/19.
 */
public class ClientRunner {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        client.start();
        client.logIn("player1", "password");
        new Thread(client).start();
        client.send("SYSTEM ready");
        client.send("SYSTEM ENDGAME");
    }
}
