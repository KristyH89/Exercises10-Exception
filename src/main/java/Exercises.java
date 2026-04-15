
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercises {

    public static void exercise1(Scanner scanner) {

// Exercises 1
        System.out.println("Exercises 1:");

        try {
            System.out.println("\nEnter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter the second integer: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide by zero!");
        }
    }

// Exercises 2
    public static void exercise2(Scanner scanner) {
        System.out.println("\nExercises 2:");
    while (true) {
        try {
            System.out.println("Enter a number (1-100): ");
            int number = scanner.nextInt();

            if (number < 1 || number > 100) {
                throw new OutOfRangeException("Number must be between 1 and 100! Please try again.");
            }
            System.out.println("Valid number: " + number);
            break;
            } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            scanner.nextLine();

        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

    }
}

}
