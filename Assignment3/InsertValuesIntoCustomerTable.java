package Assignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class InsertValuesIntoCustomerTable {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int count = 0;
        try {
            String sql = "insert into customer_details(cid,firstname,lastname,street,city,state,zipcode,product_name,created_on,created_by,updated_on,updated_by) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment1", "Trantor", "1234");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"Yash");
            preparedStatement.setString(3,"Sharma");
            preparedStatement.setString(4,"Sector 72");
            preparedStatement.setString(5,"Noida");
            preparedStatement.setString(6,"Uttar Pradesh");
            preparedStatement.setInt(7,201301);
            preparedStatement.setString(8,"Data Entry Project");
            preparedStatement.setDate(9,ourJavaDateObject);
            preparedStatement.setString(10,"Ayush");
            preparedStatement.setDate(11,ourJavaDateObject);
            preparedStatement.setString(12,"Ayush");
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
