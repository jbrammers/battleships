package ClientProgram.Game;

import java.util.ArrayList;

public class Gameboard {

	private ArrayList<Ship> board = new ArrayList<>();

	public Gameboard() {}

	public void setBoard(ArrayList<Ship> board) {
		this.board = board;
	}

	public ArrayList<Ship> getBoard() {
		return board;
	}

	public void addShip(Ship ship) {
		board.add(ship);
	}

	public void removeShip(Ship ship) {
		board.remove(ship);
	}

	/**
	 * Checks the attempts made at all the ships in the gameboard
	 * @param location location of the shot being fired in the format ROW!COLUMN
	 * @return HIT, MISS or DESTROYED depending on the result
	 */
	public String attempt(String location) {

		String result = "";

		for (Ship ship : board) {
			if (ship.attempt(location).equals("HIT")) {
				return "HIT";
			}
			else if (ship.attempt(location).equals("DESTROYED")) {
				return "DESTROYED";
			}
			else result = "MISS";
		}
		return result;
	}

	public String toString() {
		String boardState = "";
		for (Ship ship : board) {
			for (String location : ship.getLocation()) {
				String[] split = location.split("_");
				boardState += split[0] + " ";
			}
		}
		return boardState;
	}

	public boolean endTurnCheck() {
		for (Ship ship :
				board) {
			if (ship.getAlive()) {
				return false;
			}
		}
		return true;
	}

}
