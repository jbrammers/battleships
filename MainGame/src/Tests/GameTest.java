package Tests;


import ClientProgram.GUI.NewUserController;
import ClientProgram.Game.Gameboard;
import ClientProgram.Game.Ship;
import javafx.scene.control.TextField;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class GameTest {

	private Gameboard expected;
	private Ship ship1, ship2, ship3, ship4;
	private ArrayList<String> locations;
	private ArrayList<String> locationAttempt;
	private ArrayList<Ship> board = new ArrayList<>();

    private NewUserController user;
	private ArrayList<TextField> usernameField;
	
	@Before
	public void setUp() {


		ship1 = new Ship("1", 5);
		ship2 = new Ship("2", 4);
		ship3 = new Ship("3", 3);
		ship4 = new Ship ("4", 3);
		
		expected = new Gameboard();
		expected.addShip(ship1);
		expected.addShip(ship2);
		expected.addShip(ship3);
		expected.addShip(ship4);


        usernameField = new ArrayList<>();
        usernameField.add(null);
		user = new NewUserController();

		locations = new ArrayList<>();
		locations.add("1");
		locations.add("2");
		locations.add("3");
		locations.add("4");
	    locations.add("5");

        locationAttempt = new ArrayList<>();
        locationAttempt.add("1");
        locationAttempt.add("2");
        locationAttempt.add("3");
        locationAttempt.add("4");

        board = new ArrayList<>();
        board.add(0, ship1);
        board.add(1, ship2);
        board.add(2, ship3);
        board.add(3, ship4);


	}
	
	@Test
	public void addShipTest() {
		
		Gameboard gameboard = new Gameboard();
		
		gameboard.addShip(ship1);
		gameboard.addShip(ship2);
		gameboard.addShip(ship3);
		gameboard.addShip(ship4);
		
		
		
		assertEquals(4, gameboard.getBoard().size());
	
	}
	
	@Test
	public void removeShipTest()
	{
		Gameboard gameboard = new Gameboard();
		gameboard.addShip(ship1);
		gameboard.addShip(ship2);
		gameboard.addShip(ship3);
		gameboard.addShip(ship4);
		gameboard.removeShip(ship3);

		assertEquals(3, gameboard.getBoard().size());
	}


	@Test
	public void setLocationTest()
	{
		ship1.setLocation(locations);

		assertEquals("1", ship1.getLocation().get(0));
	}


	@Test
	public void setTypeTest() {

		assertEquals("1", ship1.getType());
		assertEquals("2", ship2.getType());
		assertEquals("3", ship3.getType());
		assertEquals("4", ship4.getType());

	}

    @Test
    public void setLengthTest()
    {

        assertEquals(5, ship1.getLength());
        assertEquals(4, ship2.getLength());
        assertEquals(3, ship3.getLength());
        assertEquals(3, ship4.getLength());

    }

    @Test
    public void locationFullTest()
    {
        Gameboard gameboard = new Gameboard();

        gameboard.addShip(ship1);
        ship1.setLocation(locations);


		assertTrue(ship1.locationsFull());
    }



    @Test
	public void locationCountTest()
	{
		assertEquals(5, locations.size());
	}


	@Test
	public void setAliveTest()
	{
		assertTrue(ship1.getAlive());
		assertTrue(ship2.getAlive());
		assertTrue(ship3.getAlive());
		assertTrue(ship4.getAlive());
	}

	@Test
    public void attemptHitTest()
    {
        ship1.setLocation(locations);
        ship1.attempt("1");


        assertEquals("HIT", ship1.attempt("1"));
    }

    @Test
    public void attemptMissTest()
    {
        ship1.setLocation(locations);

        assertEquals("MISS", ship1.attempt("6"));
    }

    @Test
    public void attemptDestroyedTest()
    {
        ship1.setLocation(locations);

        assertEquals("HIT", ship1.attempt("1"));
        assertEquals("HIT", ship1.attempt("2"));
        assertEquals("HIT", ship1.attempt("3"));
        assertEquals("HIT", ship1.attempt("4"));
        assertEquals("DESTROYED", ship1.attempt("5"));

		assertFalse(ship1.getAlive());
    }


	@Test
	public void setBoardTest()
	{
		Gameboard gameboard = new Gameboard();

		gameboard.setBoard(board);

		assertEquals(4, gameboard.getBoard().size());

	}

	@Test
	public void endTurnCheckTest()
	{
		ship1.setLocation(locations);

		assertEquals("HIT", ship1.attempt("1"));
		assertTrue(ship1.getAlive());
	}


	@Test
	public void destroyShip2Test()
	{
		ship2.setLocation(locationAttempt);

		assertEquals("HIT", ship2.attempt("1"));
		assertEquals("HIT", ship2.attempt("2"));
		assertEquals("HIT", ship2.attempt("3"));
		assertEquals("DESTROYED", ship2.attempt("4"));
		assertEquals("MISS", ship2.attempt("5"));
		assertFalse(ship2.getAlive());
	}


}
