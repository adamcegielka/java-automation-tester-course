package LearningJavaZajawka;

import java.util.Scanner;

public class L08Palindrom {
    public static void main(String[] args) {
        System.out.println("Type the word which is Palindrome");

        Scanner scanner = new Scanner(System.in);

        boolean isPalindrom = false;
        while (scanner.hasNext()) {
            String sentence = scanner.nextLine();
            if (sentence.equals("end")) {
                break;
            }

            isPalindrom = true;
            for (int i = 0; i < sentence.length() / 2; i++) {
                char currentChar = sentence.charAt(i);
                char otherChar = sentence.charAt(sentence.length() - i - 1);

                if (currentChar != otherChar) {
                    isPalindrom = false;
                    break;
                }
            }
            if (isPalindrom) {
                System.out.println("Typed word: [" + sentence + "] is palindrom");
            } else {
                System.out.println("Typed word: [" + sentence + "] is not palindrom");
            }
            System.out.println("- Try again\n- Or type [end] to finish");
        }

        System.out.println("End of the program");
    }
}

// kobyłamamałybok
// możejutrotadamasamadatortujeżom