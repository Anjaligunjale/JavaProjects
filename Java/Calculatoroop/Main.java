import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== OOP Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Calculator...");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calc.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + calc.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + calc.multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + calc.divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

            System.out.println();
        }

        sc.close();
    }
}