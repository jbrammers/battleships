package Game;
// import java.util.ArrayList;

import java.util.ArrayList;

public class Ship {

	private String type;
	private int length;
	private boolean alive;
	private ArrayList<String> locations;
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

	public void setLocation(ArrayList<String> locations) {
		this.locations = locations;
	}

	public ArrayList<String> getLocation() {
		return locations;
	}


	public boolean locationsFull() {
		if (locations.size() == length) {
			return true;
		}
		else return false;
	}

	public String attempt(String locationAttempt) {
		int counter = 0;
		for (String location : locations) {
			if (locationAttempt.equals(location)) {
				location = "DESTROYED";
				if (counter == length) {
					return "DESTROYED";
				}
				else return "HIT";
			}
			else {
				counter++;
			}
		}
		return "MISS";
	}
}



