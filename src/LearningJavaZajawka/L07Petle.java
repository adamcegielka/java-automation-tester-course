package LearningJavaZajawka;

import java.util.ArrayList;
import java.util.List;

public class L07Petle {
    public static void main(String[] args) {
        exampleWhile();
        exampleWhileBreak();
        exampleWhileContinue();
        exampleDoWhile();
        exampleFor();
        exampleForArray();
        exampleForEach();
    }

    // Example of a While loop
    public static void exampleWhile() {
        int a = 4;
        while (a > 0) {
            System.out.println("a = " + a);
            a--;
        }
        System.out.println("While loop completed\n");
        /*
        a = 4
        a = 3
        a = 2
        a = 1
        While loop completed
        */
    }

    // Example of a While loop with Break
    public static void exampleWhileBreak() {
        int b = 4;
        while (true) {
            b--;
            System.out.println("b = " + b);
            if (b == 2) {
                break;
            }
        }
        System.out.println("While loop with Break completed\n");
        /*
        b = 3
        b = 2
        While loop with Break completed
        */
    }

    // Example of a While loop with Break
    public static void exampleWhileContinue() {
        int c = 4;
        while (c > 0) {
            c--;
            if (c == 2) {
                continue;
            }
            System.out.println("c = " + c);
        }
        System.out.println("While loop with Continue completed\n");
        /*
        c = 3
        c = 1
        c = 0
        While loop with Continue completed
        */
    }

    // Example of a Do-While loop
    public static void exampleDoWhile() {
        int d = 6;
        do {
            System.out.println("d = " + d);
            d--;
        } while (d > 9);

        System.out.println("Do-while loop completed\n");
        /*
        d = 6
        Do-while loop completed
        */
    }

    // Example of a for loop
    public static void exampleFor() {
        for(int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("For loop completed\n");
        /*
        i = 0
        i = 1
        i = 2
        For loop completed
        */
    }

    // Example of a for loop iterating through an array
    public static void exampleForArray() {
        int[] numbers = {1, 2, 3};

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Array element = " + numbers[i]);
        }
        System.out.println("Iteration over the array completed\n");
        /*
        Array element = 1
        Array element = 2
        Array element = 3
        Iteration over the array completed
        */
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
        /*
        Name = Jan
        Name = Anna
        Name = Piotr
        For-each iteration completed
        */
    }
}

