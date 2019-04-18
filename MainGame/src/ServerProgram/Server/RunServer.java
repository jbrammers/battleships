package ServerProgram.Server;

public class RunServer {

    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.println("Please only pass the port number for the server as an argument.");
            System.exit(1);
        } else if (args.length < 1) {
            args = new String[1];
            args[0] = "3000";
        }
        // Creates a server on port 3000
        Server server = new Server(Integer.parseInt(args[0]));
        server.run();
    }
}
