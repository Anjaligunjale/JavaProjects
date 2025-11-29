import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private ArrayList<Employee> employees = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        employees.add(new Employee(id, name, department, salary));
        System.out.println("Employee Added Successfully!\n");
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No Employee Records Found.\n");
            return;
        }

        System.out.println("---- Employee Records ----");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();
    }

    public void updateEmployee() {
        System.out.print("Enter Employee ID to Update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Employee emp : employees) {
            if (emp.getId() == id) {
                System.out.print("Enter New Name: ");
                emp.setName(scanner.nextLine());

                System.out.print("Enter New Department: ");
                emp.setDepartment(scanner.nextLine());

                System.out.print("Enter New Salary: ");
                emp.setSalary(scanner.nextDouble());

                System.out.println("Employee Updated Successfully!\n");
                return;
            }
        }
        System.out.println("Employee Not Found.\n");
    }

    public void deleteEmployee() {
        System.out.print("Enter Employee ID to Delete: ");
        int id = scanner.nextInt();

        employees.removeIf(emp -> emp.getId() == id);
        System.out.println("Employee Deleted Successfully!\n");
    }
}
