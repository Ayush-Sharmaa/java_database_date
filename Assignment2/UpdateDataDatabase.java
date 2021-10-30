package Assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;


public class UpdateDataDatabase {
    public int UpdateData(UpdateEmployee updateEmployee){
        Calendar calendar = Calendar.getInstance();
        java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int count = 0;

        try {
            String sql = "update tab set name = ?,salary = ?, updated_by = ?,updated_on = ? where id = ?";
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "Trantor", "1234");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,updateEmployee.getName());
            preparedStatement.setDouble(2,updateEmployee.getSalary());
            preparedStatement.setString(3,updateEmployee.getUpdated_by());
            preparedStatement.setDate(4,ourJavaDateObject);
            preparedStatement.setInt(5,updateEmployee.getId());
            count = preparedStatement.executeUpdate();
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
        return count;


}}
