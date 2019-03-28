package Tests;

import ClientProgram.Client.Client;
import ServerProgram.Server.Server;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.Socket;

import static org.junit.Assert.*;

public class ConnectionTest {
    private static Server server;
    private Client player1;
    private Client player2;
    private Thread p1Thread;
    private Thread p2Thread;
    private ByteArrayOutputStream sout;

    @BeforeClass
    public static void oneTimeSetUp() {
        server = new Server(3000);
        new Thread(server).start();
    }

    @AfterClass
    public static void oneTimeTearDown() {
        server.stopServer();
    }

    @Before
    public void setUp() {

        player1 = new Client();
        player2 = new Client();

        p1Thread = new Thread(player1);
        p2Thread= new Thread(player2);
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test (expected = ConnectException.class)
    public void serverStart() throws Exception {
        try {
            Socket testSocket = new Socket("localhost", 80);
            testSocket.getOutputStream().write("test".getBytes());
        } catch (Exception e) {
            throw e;
        } finally {


            Server newServer = new Server(8000);
            new Thread(newServer).start();


            Socket testSocket = new Socket("localhost", 8000);
            testSocket.getOutputStream().write("test".getBytes());

            newServer.stopServer();
        }
    }


    @Test
    public void userFailTest() {
        player1.start();

        // Here to make sure the System.out is rerouted to the PrintStream properly
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Null Pointer Exception is thrown after the connection ends at the end of this test
        System.out.println("Null Pointer Exception printed below is expected.");

        sout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(sout));

        // Checks to see if the login method returns false for an incorrect login
        assertFalse(player1.logIn("badusername", "password"));

        String expected = "Username not found";

        // Ensures the login fails to username mismatch
        assertTrue(sout.toString().startsWith(expected));

        player1.endConnection();
    }

    @Test
    public void passFailTest() {
        player1.start();

        // Here to make sure the System.out is rerouted to the PrintStream properly
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Null Pointer Exception is thrown after the connection ends at the end of this test
        System.out.println("Null Pointer Exception printed below is expected.");

        sout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(sout));

        // Checks to see if the login method returns false for an incorrect login
        assertFalse(player1.logIn("admin", "badpass"));

        String expected = "Password not found";

        // Ensures the login fails based on password mismatch
        assertTrue(sout.toString().startsWith(expected));

        player1.endConnection();
    }

    @Test
    public void connectionTest() {
        player1.start();
        // Tests for a successful login
        assertTrue(player1.logIn("player1", "password"));
        player1.endConnection();
    }

    @Test
    public void twoPlayerCheck() {
        // Following code logs in 2 players and checks the connection is active by echoing the server
        player1.start();
        assertTrue(player1.logIn("player1", "password"));
        p1Thread.start();


        player2.start();
        assertTrue(player2.logIn("player2", "password"));
        p2Thread.start();

        player1.send("ECHO");
        player2.send("ECHO");

        player1.endConnection();
        player2.endConnection();
    }

    @Test
    public void gameStartTest() {
        player1.start();
        assertTrue(player1.logIn("player1", "password"));

        player2.start();
        assertTrue(player2.logIn("player2", "password"));

        // Both of these throw exceptions if they fail so no exceptions are a pass
        player1.ready();
        player2.ready();

        player1.endConnection();
        player2.endConnection();

    }

}
