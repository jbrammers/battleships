package Database;

/** Importing the extra stuff
 */

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDateTime;


public class Database {

	
	/**
	 * Method for testing simple database interactions.
	 * Not for final use in game!
	 */
    public static void run() {

        String url = "jdbc:postgresql://mod-msc-sw1.cs.bham.ac.uk/group40";
        String username = "group40"; // TODO Add username once we know
        String password = "52bsgkbp1x";

        try {
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            String playerStatement = "INSERT INTO player (username, password, wins, losses) VALUES (?,?,?,?);";
            PreparedStatement preparedPlayerStatement = connection.prepareStatement(playerStatement);

            preparedPlayerStatement.setString(1, "exampleusername");
            preparedPlayerStatement.setString(2, "examplepassword");
            preparedPlayerStatement.setInt(3, 1);
            preparedPlayerStatement.setInt(4, 0);
            preparedPlayerStatement.executeUpdate();

            preparedPlayerStatement.setString(1, "exampleusername2");
            preparedPlayerStatement.setString(2, "examplepassword2");
            preparedPlayerStatement.setInt(3, 0);
            preparedPlayerStatement.setInt(4, 1);
            preparedPlayerStatement.executeUpdate();


            String messageStatement = "INSERT INTO messages (sender, recipient, datetime, content) VALUES (?,?,?,?);";
            PreparedStatement preparedMessageStatement = connection.prepareStatement(messageStatement);

            preparedMessageStatement.setString(1, "exampleusername");
            preparedMessageStatement.setString(2, "exampleusername2");
            LocalDateTime localDateTime = LocalDateTime.now();
            preparedMessageStatement.setObject(3, localDateTime);
            preparedMessageStatement.setString(4, "Example message content");
            preparedMessageStatement.executeUpdate();




        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Database().run();
    }
}






/* database login info from Piers:
Host: mod-msc-sw1.cs.bham.ac.uk
User: group name in lower case??
Database: group40
Password: 52bsgkbp1x
 */