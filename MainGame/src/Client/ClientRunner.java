package Client;

/**
 * Created by jxb1175 on 18/03/19.
 */
public class ClientRunner {
    public static void main(String[] args) throws Exception {
        Client.start();
        Client.logIn("player", "password");
        Client client = new Client();
        client.run();
    }
}
