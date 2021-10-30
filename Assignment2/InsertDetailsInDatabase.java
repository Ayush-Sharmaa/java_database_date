package Assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

public class InsertDetailsInDatabase {
    public int InsertData(Employee employee){
        Calendar calendar = Calendar.getInstance();
        java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int count = 0;

        try {
            String sql = "insert into tab(id,name,salary,created_by,created_on) values(?,?,?,?,?)";
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "Trantor", "1234");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,employee.getId());
            preparedStatement.setString(2,employee.getName());
            preparedStatement.setDouble(3,employee.getSalary());
            preparedStatement.setString(4,employee.getCreated_by());
            preparedStatement.setDate(5, ourJavaDateObject);
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
    }
}
