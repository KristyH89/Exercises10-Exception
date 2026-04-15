
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

// Exercises 2
        System.out.println("\nExercises 2:");


    }
}
