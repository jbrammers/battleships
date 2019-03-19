package Tests;


import static org.junit.Assert.*;

import Game.Gameboard;
import Game.Ship;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class GameTest {

	
	private Gameboard expected;
	private Ship ship1, ship2, ship3, ship4;
	private ArrayList<String> locations;

	
	
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


		locations = new ArrayList<>();
		locations.add("1");
		locations.add("2");
		locations.add("3");
		locations.add("4");
		locations.add("5");
	// locations.add("6");


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
		Gameboard gameboard = new Gameboard();

		ship1.setLocation(locations);


		assertEquals("1", ship1.getLocation().get(0));
	}


	@Test
	public void setTypeTest() {
		Gameboard gameboard = new Gameboard();

		assertEquals("1", ship1.getType());
		assertEquals("2", ship2.getType());
		assertEquals("3", ship3.getType());
		assertEquals("4", ship4.getType());

	}

    @Test
    public void setLengthTest()
    {
        Gameboard gameboard = new Gameboard();

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


		assertEquals(true, ship1.locationsFull());
    }



    @Test
	public void locationCountTest()
	{
		Gameboard gameboard = new Gameboard();

		assertEquals(5, locations.size());
	}


	@Test
	public void setAliveTest()
	{
		Gameboard gameboard = new Gameboard();

		assertTrue(ship1.getAlive());
		assertTrue(ship2.getAlive());
		assertTrue(ship3.getAlive());
		assertTrue(ship4.getAlive());
	}









}
