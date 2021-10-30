package Assignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class UpdateDataInDatabase {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int count = 0;
        try {
            String sql = "update customer_details set firstname = ?,lastname = ?,street = ?,city = ?,state = ?,zipcode = ?,product_name = ?,created_on = ?,created_by = ?,updated_on = ?,updated_by = ? where cid = ? ";
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment1", "Trantor", "1234");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"Aman");
            preparedStatement.setString(2,"Sharma");
            preparedStatement.setString(3,"Sector 3");
            preparedStatement.setString(4,"Greater noida");
            preparedStatement.setString(5,"Uttar Pradesh");
            preparedStatement.setInt(6,201301);
            preparedStatement.setString(7,"Data update Project");
            preparedStatement.setDate(8,ourJavaDateObject);
            preparedStatement.setString(9,"Ayush");
            preparedStatement.setDate(10,ourJavaDateObject);
            preparedStatement.setString(11,"Ayush");
            preparedStatement.setInt(12,1);
            count = preparedStatement.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
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