package Assignments_and_Quizes.Quiz1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Glass glass = new Glass();

        System.out.println("Welcome to the Assignments_and_Quizes.Quiz1.Glass Refill Robot!");
        System.out.println("Commands:\n1.Drink\n2.Refill\n3.Exit\n");

        while (true) {
            System.out.print("Choose an option (1, 2, 3): ");

            try {
                int input = scanner.nextInt();
                if (input == 2) {
                    glass.refill();
                } else if (input == 1) {
                    System.out.print("Enter the amount of ml you want to drink: ");
                    int amount = scanner.nextInt();
                    glass.drink(amount);
                } else if (input == 3) {
                    System.out.println("Exiting. Have a great day!");
                    break;
                } else {
                    System.out.println("Invalid input. Please use the following commands:\n1.Drink\n2.Refill\n3.Exit");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please choose a valid option (1, 2 or 3).");
//                scanner.nextLine();
            }
        }

        scanner.close();
    }
}