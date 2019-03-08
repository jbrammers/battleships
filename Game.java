import java.util.ArrayList;

public class Game 
{
	
	private static ArrayList<String> locationCells;

	
	

	// We set number of hits to 0 at the beginning of the game.
	int numofHits = 0;
	
	
	

	
	// Setter method for locationCells which updates game's location.
	public static void setlocationCells(ArrayList<String> loc) 
	{
	
		locationCells = loc;
	}
	
	
	
	// Create a method to check whether what is the outcome of the player's attempt.
	// The method takes the userInput of type String and returns a String.
	// There are three output possibilities: miss, hit (part of the ship) & sunk (the whole ship)
	public static String checkLocation (String result)
	{
		
	// We assume that the attempt was a miss.
		result = "miss";
	
		
	// If user's attempt is a success, indexOf returns the ArrayList location. 
	// If the attempt is unsuccessful (miss), it will return -1. 
		String UserInput = null;
		int index = locationCells.indexOf(UserInput);
		
	
	// If index >= 0, userInput is in the ArrayList and the locationCell was "hit".
	// The method will remove index of that locationCell from ArrayList.
		if (index >= 0)
		{
			locationCells.remove(index);
		
	// If the ArrayList locationCells is not empty, it means it contains at least 1 element.
	// In this case, the ship is "hit", but not "sunk".
			if (!locationCells.isEmpty())
			{
				result = "hit";
			} // close if
			else
			{
	// If the ArrayList locationCells is empty, it means that there are no locations to "hit". This changes the status to "sunk".
	// Conclusion: if the list is empty -> the ship was sunk.
				result = "sunk";
				
				System.out.println("Contragulations! You " + result + "a ship" );
			} // close inner if
			
			 
		
		} // close outer if
				
	// Display the result of the attempt: "miss", "hit" or "sunk".
	// Remember: by default, the algorithm assumes the result is "miss" unless one of the other two conditions are true.
		
		System.out.println(result);
		return result; // miss, hit or sunk.
	
		
	} // end method




 

	
		
}
