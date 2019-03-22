package Database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseManager {

    private Connection connection;

    DatabaseManager(){
        String url = "jdbc:postgresql://mod-msc-sw1.cs.bham.ac.uk/group40";
        String username = "group40";
        String password = "52bsgkbp1x";

        try {
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Something went wrong connecting to the database");
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
            System.out.println("Something went wrong");
            return true;
        }
    }

    /**
     * Insert a new user record into the database
     */
    public boolean addNewUserRecord(String username, String password) {
       if (doesUsernameExist(username)){
           System.out.println("Username is taken");
           return false;
       }

        String playerStatement = "INSERT INTO player (username, password, salt) VALUES (?,?,?);";

        String[] pass1 = PasswordHandler.newPassword(password);

        try {
            PreparedStatement preparedPlayerStatement = connection.prepareStatement(playerStatement);

            preparedPlayerStatement.setString(1, username);
            preparedPlayerStatement.setString(2, pass1[0]);
            preparedPlayerStatement.setString(3, pass1[1]);
            preparedPlayerStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
           System.out.println("Something went wrong");
           return false;
        }

    }

    /**
     * Checking the inputted username and passwords match those stored on the database to enable login
     */
    public Boolean login(String username, String password) {
        String query = "SELECT username, password, salt FROM players WHERE username = ?;";

        try {
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, username);

            ResultSet players = statement.executeQuery();

            if (players.next()) {
                // Retrieve the hashed password and salt from the database.
                String dbHash = players.getString(2);
                String dbSalt = players.getString(3);

                // Hash the new password with the original salt.
                String hash = PasswordHandler.hashPassword(password, dbSalt.getBytes());
                if (hash == null)
                    return false;

                boolean matches = hash.equals(dbHash);

                if (matches) {
                    return true;
                } else {
                    System.out.println("Password not found");
                    return false;
                }

            } else {
                System.out.println("Username not found");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Something went wrong");
            return false;
        }

    }





    //Create the table, populate with info




    public void updateGameHistory(Boolean didUserWin, String username) {
        //if didUserWin = true:
        // Connect to database
        //update PLAYERS
        // set wins = wins + 1,
        // winratio = (wins::float + 1)/(wins + 1 + losses)
        // where username = ?

        //else:
        //Connect to database
        //update PLAYERS
        //set losses = losses + 1,
        //winratio = (wins::float + 1)/(wins + losses + 1)
        //where username = ?

    }

    //public //string args?? calculateLeaderBoard() {
    //connect to database
    //query *
    // username, winratio, sort winrtio, max 10

   // return //string args???
    //}

}






/* database login info from Piers:
Host: mod-msc-sw1.cs.bham.ac.uk
User: group name in lower case??
Database: group40
Password: 52bsgkbp1x
 */