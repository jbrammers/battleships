package Tests;

import Client.Client;
import Server.ServerThread;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConnectionTest {
    private ServerThread server;
    private Client player1;
    private Client player2;

    @Before
    public void setUp() {
        server = new ServerThread(3000);
        new Thread(server).start();

        player1 = new Client();
        player2 = new Client();
    }

    @After
    public void tearDown() {
        server.stopServer();
    }

    @Test
    public void connectionTest() {
        Thread p1Thread = new Thread(player1);
        player1.start();
        // assertFalse(player1.logIn("badusername", "wrongpassword")); // TODO this will work once database is connected
        assertTrue(player1.logIn("player1", "password"));
    }

}
