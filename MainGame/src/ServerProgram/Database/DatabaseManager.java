package ServerProgram.Database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;


public class DatabaseManager {

    private Connection connection;

    public DatabaseManager() {
        String url = "jdbc:postgresql://mod-msc-sw1.cs.bham.ac.uk/group40";
        String username = "group40";
        String password = "52bsgkbp1x";

        try {
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Something went wrong connecting to the database");
            e.printStackTrace();
        }
    }

    /**
     * Run database code to determine whether a row exists with that username
     */
    private Boolean doesUsernameExist(String username) {
        String query = "SELECT * FROM player WHERE username = ?;";
        try {
            PreparedStatement preparedQuery = connection.prepareStatement(query);
            preparedQuery.setString(1, username);
            ResultSet rows = preparedQuery.executeQuery();

            return rows.next();

        } catch (SQLException e) {
            System.out.println("Something went wrong checking username exists");
            return true;
        }
    }


    /**
     * Insert a new user record into the database
     */
    public boolean addNewUserRecord(String username, String password) {
        if (doesUsernameExist(username)) {
            System.out.println("Username is taken");
            return false;
        }

        String playerStatement = "INSERT INTO player (username, password, salt) VALUES (?,?,?);";

        ArrayList<Object> pass = PasswordHandler.newPassword(password);

        try {
            PreparedStatement preparedPlayerStatement = connection.prepareStatement(playerStatement);

            preparedPlayerStatement.setString(1, username);
            preparedPlayerStatement.setString(2, (String) pass.get(0));
            preparedPlayerStatement.setBytes(3, (byte[]) pass.get(1));
            preparedPlayerStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Something went wrong adding new user record");
            e.printStackTrace();
            return false;
        }
    }


    /**
     * Checking the inputted username and passwords match those stored on the database to enable login
     * @return 0 if passed, 1 if username fails, 2 if password fails, 3 if something else is wrong
     */
    public int login(String username, String password) {
        String query = "SELECT username, password, salt FROM player WHERE username = ?;";

        try {
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, username);

            ResultSet players = statement.executeQuery();

            if (players.next()) {
                // Retrieve the hashed password and salt from the database.
                String dbHash = players.getString(2);
                byte[] dbSalt = players.getBytes(3);

                // Hash the new password with the original salt.
                String hash = PasswordHandler.hashPassword(password, dbSalt);
                if (hash == null) return 3;

                boolean matches = hash.equals(dbHash);

                if (matches) {
                    return 0;
                } else {
                    System.out.println("Password not found");
                    return 2;
                }

            } else {
                System.out.println("Username not found");
                return 1;
            }
        } catch (SQLException e) {
            System.out.println("Something went wrong logging in");
            e.printStackTrace();
            return 3;
        }
    }


    /**
     * This updates the database's record to record the win/loss and reevaluate the winratio
     */
    public void updateGameHistory(Boolean didUserWin, String username) {
        String update;
        if (didUserWin) {
            update = "UPDATE player " +
                    "SET wins = wins + 1," +
                    "winratio = (wins::float + 1)/(wins + 1 + losses) " +
                    "WHERE username = ?";
        } else {
            update = "UPDATE player " +
                    "SET losses = losses + 1, " +
                    "winratio = (wins::float)/(wins + losses + 1) " +
                    "WHERE username = ?";
        }

        try {
            PreparedStatement statement = connection.prepareStatement(update);

            statement.setString(1, username);

            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Something went wrong updating game history");
            e.printStackTrace();
        }
    }

    /**
     * Query the database to create a list of the top 10 players
     */
    public ArrayList<PlayerData> calculateLeaderBoard() {
        String query = "SELECT username, wins, losses, ROUND(winratio,2) AS winratio " +
                "FROM player " +
        "ORDER BY winratio DESC, wins DESC, losses ASC " +
                "LIMIT 10";

        try {
            PreparedStatement preparedQuery = connection.prepareStatement(query);

            ResultSet top10 = preparedQuery.executeQuery();

            ArrayList<PlayerData> results = new ArrayList<>();
            while (top10.next()){
                String username = top10.getString("username");
                Integer wins = top10.getInt("wins");
                Integer losses = top10.getInt("losses");
                Float winratio = top10.getFloat("winratio");

                PlayerData data = new PlayerData(username, wins, losses, winratio);

                results.add(data);
            }

            return results;
        } catch (SQLException e) {
            System.out.println("Something went wrong calculating the leader board");
            e.printStackTrace();
            return null;
        }
    }
}