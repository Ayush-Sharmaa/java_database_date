package Assignment2;

import java.util.Scanner;

public class updateDataInDatabase {
    public static void main(String[] args) {
        UpdateEmployee updateEmployee = new UpdateEmployee();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the id : ");
        int id = scanner.nextInt();
        System.out.print("Enter name : ");
        String name = scanner.next();
        System.out.print("Enter salary : ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the Name ");
        String updated_by = scanner.next();

        updateEmployee.setId(id);
        updateEmployee.setName(name);
        updateEmployee.setSalary(salary);
        updateEmployee.setUpdated_by(updated_by);

        UpdateDataDatabase updateDataDatabase = new UpdateDataDatabase();
        int count = updateDataDatabase.UpdateData(updateEmployee);
        System.out.println(count);


    }
}
