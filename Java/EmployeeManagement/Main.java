import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: system.addEmployee(); break;
                case 2: system.viewEmployees(); break;
                case 3: system.updateEmployee(); break;
                case 4: system.deleteEmployee(); break;
                case 5:
                    System.out.println("Exiting Program...");
                    return;
                default:
                    System.out.println("Invalid Choice!\n");
            }
        }
    }
}
