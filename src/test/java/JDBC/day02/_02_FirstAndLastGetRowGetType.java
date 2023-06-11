package JDBC.day02;

import Utilities.JDBCConnection;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_FirstAndLastGetRowGetType extends JDBCConnection {
    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select city_id,city,country_id from city");
        rs.last(); // It jumps to the last row
        String cityName = rs.getString("city");
        System.out.println("City on the last row: " + cityName);

        // If a column contains pure numbers we can get them either as a String or as an int
        int idInt = rs.getInt("city_id");
        System.out.println("id int:" + idInt);


        String idStr = rs.getString("city_id");
        System.out.println("id String: "+ idStr);

       int currentRowNumber = rs.getRow(); // Returns a current row number as an int
        System.out.println("Current row number: " + currentRowNumber);
        // You can find how many rows your query returns by using last and getRow one after another

        rs.first(); // Jumps to the first row
        int firstRow = rs.getRow(); // You get the int value of first row
        System.out.println(firstRow);
    }
}
