import java.util.ArrayList;

public class Ship 
{
	
	
	private Gameboard helper = new Gameboard();
	private ArrayList<Ship> ship = new ArrayList<Ship>();
	
	private String name;
//	private int numofAttempts = 0;
	
	
	
	// Setter method for name of the ship
		public void setname(String n)
		{
			this.name = n;
		}
	
	public void setUpGame()
	// Create five ships, set names and locations for them.
	{
	
	Ship one = new Ship();
	one.setname ("Zeus");
	
	Ship two = new Ship();
	two.setname ("Sledgehammer");
	
	Ship three = new Ship();
	three.setname("Stellar");
	
	Ship four = new Ship();
	four.setname ("Ajax");
	
	Ship five = new Ship();
	five.setname("Vector");
	
	System.out.println("Your goal is to sink five battleships:");
	System.out.println(one + ", " + two + ", " + three + ", " + four + ", " + five + ".");
	System.out.println("You will need to do this in fewest attempts. Remember: if the other player sinks your ships before you, you lose!");
	
	}

	
}


