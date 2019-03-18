package Client;

/**
 * Created by jxb1175 on 18/03/19.
 */
public class ClientRunner {
    public static void main(String[] args) {
        Client client = new Client("player", "password");
        client.run();
    }
}
