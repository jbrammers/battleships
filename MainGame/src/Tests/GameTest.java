package Tests;

import static org.junit.Assert.*;

import Game.Gameboard;
import Game.Ship;
import org.junit.Before;
import org.junit.Test;


public class GameTest {

	
	private Gameboard expected;
	private Ship ship1, ship2, ship3, ship4;


	
	
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
	}
	
	@Test
	public void addShipTest() {
		
		Gameboard gameboard = new Gameboard();
		
		gameboard.addShip(ship1);
		gameboard.addShip(ship2);
		gameboard.addShip(ship3);
		gameboard.addShip(ship4);
		
		
		
		

		
		assertEquals(expected.getBoard().size(), gameboard.getBoard().size());
	
	}
	
	@Test
	public void removeShipTest()
	{
		Gameboard gameboard = new Gameboard();
		gameboard.addShip(ship1);
		gameboard.removeShip(ship1);
		gameboard.removeShip(ship2);
		
		assertEquals(expected.getBoard().size(), gameboard.getBoard().size());
	}

	
	
}
