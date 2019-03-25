package ServerProgram.Server;

public class RunServer {

    public static void main(String args[]) {
        // Creates a server on port 3000
        Server server = new Server(3000);
        server.run();
    }
}
