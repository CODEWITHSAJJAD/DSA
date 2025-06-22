package scientificClaculator;
import java.util.Scanner;
public class Claculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exponentiation");
            System.out.println("7. Logarithm");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");

            int choice = scanner.nextInt();

            if (choice == 8) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double result = 0.0;

            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();
                    result = num1 + num2;
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    break;
                case 4:
                    System.out.print("Enter the dividend: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the divisor: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.print("Enter the dividend: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the divisor: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 % num2;
                    } else {
                        System.out.println("Modulus operation with divisor 0 is not allowed.");
                    }
                    break;
                case 6:
                    System.out.print("Enter the base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    num2 = scanner.nextDouble();
                    result = Math.pow(num1, num2);
                    break;
                case 7:
                    System.out.print("Enter the number for which you want to calculate the logarithm: ");
                    num1 = scanner.nextDouble();
                    result = Math.log(num1);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-8).");
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}