package ServerClient;

public class RunServer {

    public static void main(String args[]) {
        // Creates a server on port 3000
        ServerThread server = new ServerThread(3000);
        new Thread(server).start();
    }
}
