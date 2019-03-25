package ClientProgram.Game;
// import java.util.ArrayList;

import java.util.ArrayList;

public class Ship {

	private String type;
	private int length;
	private boolean alive;
	private ArrayList<String> locations = new ArrayList<>();
	private int counter = 0;

	public Ship(String type, int length) {
		this.type = type;
		this.length = length;
		alive = true;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}


	public String getType() {
		return type;
	}

	public int getLength() {
		return length;
	}

	public boolean getAlive() {
		return alive;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public void setLocation(ArrayList<String> locations) {
		this.locations = locations;
		locationCount();
	}

	public ArrayList<String> getLocation() {
		return locations;
	}

	public int locationCount() {
		int counter = 0;
		for (String location : locations) {
			counter++;
		}

		return counter;
	}



	public boolean locationsFull() {
		return locations.size() == length;
	}

	/**
	 * Checks the attempts made at all the ships in the gameboard
	 * @param locationAttempt location of the shot being fired in the format ROW!COLUMN
	 * @return HIT, MISS or DESTROYED depending on the result
	 */
	public String attempt(String locationAttempt) {


		for (String location : locations) {
			String[] split = location.split("_");
			String newLoc = split[0];
			System.out.println(newLoc);

			char[] chars = newLoc.toCharArray();
			StringBuffer loc = new StringBuffer();

			for (char c : chars) {
				StringBuilder temp = new StringBuilder();
				temp.append(c);
				if (temp.toString().matches("[A-Z0-9]")) loc.append(temp);
				System.out.println(loc);
			}

			// Uses a counter to determine if the ship has been destroyed
			if (locationAttempt.equals(loc.toString())) {
				if (counter == length-1) {
					setAlive(false);
					return "DESTROYED";
				} else {
					counter++;
					return "HIT";
				}
			}
		}
		return "MISS";
	}

}



