package Assignment3;

import java.sql.*;

public class RetriveDataFromDatabase {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        int count = 0;
        try {
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment1", "Trantor", "1234");
            statement = connection.createStatement();
            statement.executeUpdate("select * from customer_details");
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
