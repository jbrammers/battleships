package GUI;

import Game.Gameboard;
import Game.Ship;

import java.util.ArrayList;

public class ShipPlacementController {

    Gameboard gameboard = new Gameboard();

    private int currentButtonNumber;

    private boolean validLocation(String locationAttempt, Ship ship) {

        for (Ship ships : gameboard.getBoard()) {
            for (String location : ships.getLocation()) {
                String[] split = location.split("_");
                if (split[1].equals(locationAttempt)) {
                    return false;
                }
            }
        }

        if (ship.getLocation().isEmpty()) {
            return true;
        } else {
            String[] interAttempt = locationAttempt.split("_");
            String[] splitRowColumnAttempt = interAttempt[0].split("!");
            if (ship.locationCount() == 1) {
                String[] splitLocationButton = ship.getLocation().get(0).split("_");
                int diff = Math.abs(Integer.parseInt(splitLocationButton[1]) - currentButtonNumber);
                String[] splitRowColumnLocation = splitLocationButton[0].split("!");
                if ((char) (splitRowColumnLocation[0].charAt(0) + diff) == splitRowColumnAttempt[0].charAt(0) ||
                        (char) (splitRowColumnLocation[0].charAt(0) - diff) == splitRowColumnAttempt[0].charAt(0) ||
                        Integer.parseInt(splitRowColumnLocation[1]) + diff == Integer.parseInt(splitRowColumnAttempt[1]) ||
                        Integer.parseInt(splitRowColumnLocation[1]) - diff == Integer.parseInt(splitRowColumnAttempt[1])) {
                    return true;
                }
            } else {
                ArrayList<Integer> setLocationsButtonNumbers = new ArrayList<>();
                ArrayList<String> locationsRows = new ArrayList<>();
                ArrayList<String> locationsColumns = new ArrayList<>();

                for (String location : ship.getLocation()) {
                    String[] splitLocationButton = location.split("_");
                    String[] splitRowsColumns = splitLocationButton[0].split("!");
                    setLocationsButtonNumbers.add(Integer.parseInt(splitLocationButton[1]));
                    locationsRows.add(splitRowsColumns[0]);
                    locationsColumns.add(splitRowsColumns[1]);
                }
                int max = setLocationsButtonNumbers.get(0);
                for (int buttonNumber : setLocationsButtonNumbers) {
                    if (buttonNumber > max) {
                        max = buttonNumber;
                    }
                }
                int min = setLocationsButtonNumbers.get(0);
                for (int buttonNumber : setLocationsButtonNumbers) {
                    if (buttonNumber < min) {
                        min = buttonNumber;
                    }
                }

                int diff = Math.abs(min - currentButtonNumber);

                //vertical
                if (locationsRows.get(0).equals(locationsRows.get(1))) {
                    if (min == 1) {
                        if (splitRowColumnAttempt[0].equals(locationsRows.get(0)) && (splitRowColumnAttempt[1].charAt(0) == ((char) (locationsColumns.get(setLocationsButtonNumbers.indexOf(min)).charAt(0) + diff)))) {
                            return true;
                        }
                    } else if (max == ship.getLength()) {
                        if (splitRowColumnAttempt[0].equals(locationsRows.get(0)) && (splitRowColumnAttempt[1].charAt(0) == ((char) (locationsColumns.get(setLocationsButtonNumbers.indexOf(max)).charAt(0) - diff)))) {
                            return true;
                        }
                    } else {
                        if ((splitRowColumnAttempt[0].equals(locationsRows.get(0)) && splitRowColumnAttempt[1].equals(locationsColumns.get(setLocationsButtonNumbers.indexOf(max)) + diff)) || (splitRowColumnAttempt[0].equals(locationsRows.get(0)) && splitRowColumnAttempt[1].equals(locationsColumns.get(setLocationsButtonNumbers.indexOf(min)) + diff)) ||
                                (splitRowColumnAttempt[0].equals(locationsRows.get(0)) && (splitRowColumnAttempt[1].charAt(0) == (char) (locationsColumns.get(setLocationsButtonNumbers.indexOf(min)).charAt(0) - diff))) || (splitRowColumnAttempt[0].equals(locationsRows.get(0)) && (splitRowColumnAttempt[1].charAt(0) == (char) (locationsColumns.get(setLocationsButtonNumbers.indexOf(max)).charAt(0) - diff)))) {
                            return true;
                        }
                    }
                }

                //horizontal
                else if (locationsColumns.get(0).equals(locationsColumns.get(1))) {
                    if (min == 1) {
                        if (splitRowColumnAttempt[1].equals(locationsColumns.get(0)) && (splitRowColumnAttempt[0].charAt(0) == ((char) (locationsRows.get(setLocationsButtonNumbers.indexOf(min)).charAt(0) + diff)))) {
                            return true;
                        }
                    } else if (max == ship.getLength()) {
                        if (splitRowColumnAttempt[1].equals(locationsColumns.get(0)) && (splitRowColumnAttempt[0].charAt(0) == ((char) (locationsRows.get(setLocationsButtonNumbers.indexOf(max)).charAt(0) - diff)))) {
                            return true;
                        }
                    } else {
                        if ((splitRowColumnAttempt[1].equals(locationsColumns.get(0)) && (splitRowColumnAttempt[0].charAt(0) == ((char) (locationsRows.get(setLocationsButtonNumbers.indexOf(min)).charAt(0) + diff)))) || (splitRowColumnAttempt[1].equals(locationsColumns.get(0)) && (splitRowColumnAttempt[0].charAt(0) == ((char) (locationsRows.get(setLocationsButtonNumbers.indexOf(max)).charAt(0) + diff)))) ||
                                (splitRowColumnAttempt[1].equals(locationsColumns.get(0)) && (splitRowColumnAttempt[0].charAt(0) == ((char) (locationsRows.get(setLocationsButtonNumbers.indexOf(max)).charAt(0) - diff)))) || (splitRowColumnAttempt[1].equals(locationsColumns.get(0)) && (splitRowColumnAttempt[0].charAt(0) == ((char) (locationsRows.get(setLocationsButtonNumbers.indexOf(min)).charAt(0) - diff))))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}