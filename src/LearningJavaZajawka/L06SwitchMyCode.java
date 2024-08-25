package LearningJavaZajawka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L06SwitchMyCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Type a number from 1 to 5 (or type 0 to exit):");
                int input = scanner.nextInt();

                // We check if the user wants to terminate the program
                if (input == 0) {
                    System.out.println("Exiting... Goodbye!");
                    break;
                }

                System.out.println("Your number is: " + input);

                switch (input) {
                    case 1 -> System.out.println("You missed it!");
                    case 2, 3 -> System.out.println("Wrong number!");
                    case 4 -> System.out.println("Bravo! 4 is a winning number!");
                    case 5 -> System.out.println("That's too much!");
                    default -> System.out.println("Invalid number! Please enter a number from 1 to 5.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number, not text.");
                scanner.next(); // We read the invalid input to avoid an infinite loop
            }
        }

        scanner.close(); // Closing the scanner when the program ends
    }
}
