package Tests;

import ClientProgram.Client.Client;
import ServerProgram.Server.Server;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.Socket;

import static org.junit.Assert.*;

public class ConnectionTest {
    private Server server;
    private Client player1;
    private Client player2;
    private Thread p1Thread;
    private Thread p2Thread;
    private ByteArrayOutputStream sout;

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


            Server newServer = new Server(80);
            new Thread(newServer).start();


            Socket testSocket = new Socket("localhost", 80);
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

        System.out.println("Null Pointer Exception printed below is expected.");

        sout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(sout));

        assertFalse(player1.logIn("badusername", "password"));

        String expected = "Username not found\r\n";

        assertEquals(expected, sout.toString());

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

        System.out.println("Null Pointer Exception printed below is expected.");

        sout = new ByteArrayOutputStream();
        System.setOut(new PrintStream(sout));

        assertFalse(player1.logIn("admin", "badpass"));

        String expected = "Password not found\r\n";

        assertEquals(expected, sout.toString());

        player1.endConnection();
    }

    @Test
    public void connectionTest() {
        player1.start();
        assertTrue(player1.logIn("player1", "password"));
        // assertEquals();
        player1.endConnection();
    }

    @Test
    public void twoPlayerCheck() {
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
        p1Thread.start();

        player2.start();
        assertTrue(player2.logIn("player2", "password"));
        p2Thread.start();


        player1.ready();
        player2.ready();

        player1.endConnection();
        player2.endConnection();

    }

}
