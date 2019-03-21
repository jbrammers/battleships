package Game;
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

	public String attempt(String locationAttempt) {
		for (String location : locations) {

			char[] chars = location.toCharArray();
			StringBuffer loc = new StringBuffer();
			loc.append(chars[0]);
			loc.append(chars[2]);
			if (chars[3] == '0') loc.append('0');

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



