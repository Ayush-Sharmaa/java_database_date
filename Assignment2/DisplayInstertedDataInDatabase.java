package Assignment2;

import java.util.Scanner;

public class DisplayInstertedDataInDatabase {
    public static void main(String[] args) {
        Employee employee = new Employee();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter id : ");
        int id = scanner.nextInt();
        System.out.print("Enter name : ");
        String name = scanner.next();
        System.out.print("Enter salary : ");
        double salary = scanner.nextDouble();
        System.out.print("Enter Creator name : ");
        String Created_by = scanner.next();

        employee.setId(id);
        employee.setName(name);
        employee.setSalary(salary);
        employee.setCreated_by(Created_by);

        InsertDetailsInDatabase insertDetailsInDatabase = new InsertDetailsInDatabase();
        int count = insertDetailsInDatabase.InsertData(employee);
        System.out.print(count);

        scanner.close();
    }
}
