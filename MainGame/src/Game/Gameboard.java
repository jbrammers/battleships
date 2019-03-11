package Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Gameboard {
	
	private int gridLength;
	private int gridSize;
	// Grid needs to be inserted
	// grid length, size constructors
	
	// method which creates the algorithm for placing the ships on the gameboard.
	// For example, a ship of size 5 starting at position  should not be placed horizontally 
	public ArrayList<String> placeShip (int shipSize)
	{
		
		return null;
	}
	
	
	public String getUserInput (String prompt)
	{
		String userInput = null;
		System.out.println(prompt + " ");
		
		try
		{
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			userInput = is.readLine();
			
		if (userInput.length() == 0)
			return null;
		} 
			catch (IOException A)
		{
				System.out.println("IOException: " + A);
		}
		
		return userInput;
	}
}