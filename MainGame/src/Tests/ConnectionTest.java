package Tests;

import ClientProgram.Client.Client;
import ServerProgram.Server.Server;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConnectionTest {
    private Server server;
    private Client player1;
    private Client player2;
    private Thread p1Thread;
    private Thread p2Thread;

    @Before
    public void setUp() {
        server = new Server(3000);
        new Thread(server).start();

        player1 = new Client();
        player2 = new Client();

        p1Thread = new Thread(player1);
        p2Thread= new Thread(player2);
    }

    @After
    public void tearDown() {
        server.stopServer();
    }

    @Test
    public void connectionTest() {
        player1.start();
        p1Thread.start();
        // assertFalse(player1.logIn("badusername", "wrongpassword")); // TODO this will work once database is connected
        assertTrue(player1.logIn("player1", "password"));
        player1.endConnection();
    }

    @Test
    public void twoPlayerCheck() {
        player1.start();
        player1.logIn("player1", "password");
        p1Thread.start();


        player2.start();
        player2.logIn("player2", "password");
        p2Thread.start();

        player1.send("ECHO");
        player2.send("ECHO");

        player1.endConnection();
        player2.endConnection();
    }

    @Test
    public void gameStartTest() {
        player1.start();
        player1.logIn("player1", "password");
        p1Thread.start();

        player2.start();
        player2.logIn("player2", "password");
        p2Thread.start();


        player1.ready();
        player2.ready();

        player1.endConnection();
        player2.endConnection();

    }

}
