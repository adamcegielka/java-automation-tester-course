package LearningJavaZajawka;
import java.util.Scanner;

public class L06Switch {
    public static void main(String[] args) {

        System.out.println("Type a number from 1 to 5");

        // Przechwytywanie informacji które użytkownik wprowadz
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Your number is: " + input);

        switch (input) {
            case 1 -> System.out.println("You missed it!");
            case 2,3 -> System.out.println("Wrong number!");
            case 4 -> System.out.println("Bravo! 4 is a winning number!");
            case 5 -> System.out.println("That's too much!");
            default -> System.out.println("Invalid number! Please enter a number from 1 to 5.");

        }
    }
}

/*
Old version:

        switch (input) {
            case 1:
                System.out.println("You missed it!");
                break;
            case 2,3:
                System.out.println("Wrong number!");
                break;
            case 4:
                System.out.println("Bravo! 4 is a winning number!");
                break;
            case 5:
                System.out.println("That's too much!");
                break;
        }

 */