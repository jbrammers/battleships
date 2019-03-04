package ServerClient;

public class Server {

    public static void main(String args[]) {
        // Creates a server on port 3000
        ServerThread server = new ServerThread(3000);
        new Thread(server).start();

        // Imitates the server being open for 200 seconds and then shuts it
        try {
            Thread.sleep(10000*20);
        } catch (Exception e) {
            e.printStackTrace();
        }

        server.stopServer();
    }
}
