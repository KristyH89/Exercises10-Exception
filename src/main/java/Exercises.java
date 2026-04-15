
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

    // Exercises 3

    public static void exercise3(Scanner scanner) {
        System.out.println("\nExercises 3:");
        BankAccount account = new BankAccount(100);
        System.out.println("Starting balance: " + account.getBalance());

        while (true) {
            try {
                System.out.println("\n === Welcome to the Banking System === ");
                System.out.println("Please choose an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Show balance");
                System.out.println("0. Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();

                        if (depositAmount <= 0) {
                            System.out.println("Deposit must be positive!");
                            break;
                        }
                        account.deposit(depositAmount);
                        System.out.println("New Balance: " + account.getBalance());
                        break;

                    case 2:
                        System.out.println("Enter withdraw amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        System.out.println("New balance: " + account.getBalance());
                        break;

                    case 3:
                        System.out.println("Current balance: " + account.getBalance());
                        break;

                    case 0:
                        System.out.println("Exiting... Have a nice day!");
                        return;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }

            } catch (InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (InputMismatchException e) {
                System.out.println("Error: please enter a valid number.");
                scanner.nextLine();
            }


        }

    }

}


