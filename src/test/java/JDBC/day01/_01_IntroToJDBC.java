package JDBC.day01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_IntroToJDBC {
    @Test
    public void test1() throws SQLException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        // url contains type of connection(jdbc), type of database(mysql), url to remote server,
        // port number of  the server, name of the database to we want to work on

        String userName = "root";
        String password = "'\"-LhCB'.%k[4S]z";       // '"-LhCV'.%k[4S]z Escape character

        Connection connection = DriverManager.getConnection(url,userName,password); //Create a connection to the database
        Statement statement = connection.createStatement();  // Created a statement to write our queries

        ResultSet rs = statement.executeQuery("select * from actor"); // Result is ready but not on our pc
        // The result is on the database to work faster

        // rs.next -> moves one by one
        rs.next(); // the arrow is on the first row
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        System.out.println("1st row first and last names: " + firstName+ " "+lastName);

        // rs.next -> moves one by one
        rs.next(); // the arrow is on the second window
        firstName = rs.getString(2);  // in DB index starts from 1
        lastName = rs.getString(3);
        System.out.println("2nd row first name and last name: "+ firstName+ " "+ lastName);
        connection.close(); // connection is closed

    }
}
