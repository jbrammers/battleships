package Game;
// import java.util.ArrayList;

public class Ship 
{
	
	
//	private Gameboard helper = new Gameboard();
//	private ArrayList<Ship> ship = new ArrayList<Ship>();
	
	static String name;
	private int number;
	private static int length;
//	private int numofAttempts = 0;
	

	
	
	// Setter method for name of the ship
		public void setname(String name)
		{
			Ship.name = name;
		}
		
	// Getter method for name of the ship
		public static Ship getname (Ship name)
		{
			return name;
		}
	
	
	// Setter method for the ship number;
		public void setnumber(int num)
		{
			this.number = num;
		}
		
	// Getter method for the ship number
		public int getnumber (int num)
		{
			return number;
		}
		
	// Setter method for the length of the ship
		public void setlength (int l)
		{
			Ship.length = l;
		}
		
	// Getter method for the length of the ship
		public int getlength (int l)
		{
			return length;
		}
		
	public static void setUpGame()
	// Create five ships, set names and locations for them.
	{
	
	Ship one = new Ship();
	one.setname ("Zeus");
	Ship.getname(one);
	one.setlength(5);
	
	Ship two = new Ship();
	two.setname ("Sledgehammer");
	Ship.getname(two);
	two.setlength(4);
	
	Ship three = new Ship();
	three.setname("Stellar");
	Ship.getname(three);
	three.setlength(3);
	
	Ship four = new Ship();
	four.setname ("Ajax");
	Ship.getname(four);
	four.setlength(3);
	
	Ship five = new Ship();
	five.setname("Vector");
	Ship.getname(five);
	five.setlength(2);
	
	System.out.println("Your goal is to sink five battleships:");
	
	
	System.out.println(Ship.name + "(" + Ship.length + ") ");
	
	
	System.out.println("You will need to do this in fewest attempts. Remember: if the other player sinks your ships before you, you lose!");
	
	}

	
}



