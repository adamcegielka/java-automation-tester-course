package LearningJavaZajawka;

import java.util.ArrayList;
import java.util.List;

public class L07PetleWhile {
    public static void main(String[] args) {
        exampleWhile();
        exampleDoWhile();
        exampleFor();
        exampleForArray();
        exampleForEach();
    }

    // Example of a While loop
    public static void exampleWhile() {
        int a = 7;
        while (a > 0) {
            System.out.println("a = " + a);
            a--;
        }
        System.out.println("While loop completed\n");
    }

    // Example of a Do-While loop
    public static void exampleDoWhile() {
        int b = 10;
        do {
            System.out.println("c = " + b);
            b--;
        } while (b > 0);

        System.out.println("Do-while loop completed\n");
    }

    // Example of a for loop
    public static void exampleFor() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("For loop completed\n");
    }

    // Example of a for loop iterating through an array
    public static void exampleForArray() {
        int[] numbers = {1, 2, 3, 4, 5};

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Array element = " + numbers[i]);
        }
        System.out.println("Iteration over the array completed\n");
    }

    // Example of a for-each loop iterating through the elements of a list
    public static void exampleForEach() {
        List<String> names = new ArrayList<>();
        names.add("Jan");
        names.add("Anna");
        names.add("Piotr");

        for(String name : names) {
            System.out.println("Name = " + name);
        }
        System.out.println("For-each iteration completed\n");
    }
}

