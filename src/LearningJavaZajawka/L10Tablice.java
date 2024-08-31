package LearningJavaZajawka;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L10Tablice {

    public static void main(String[] args) {

        // first method
        String[] cars = new String[4];
        cars[0] = "BMW";
        cars[1] = "Audi";
        cars[2] = "Toyota";
        cars[3] = "Fiat";

        System.out.println(cars[2]); // Toyota

        System.out.println(Arrays.toString(cars)); // [BMW, Audi, Toyota, Fiat]

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car[" + i + "]: " + cars[i]);
            /*
            Car[0]: BMW
            Car[1]: Audi
            Car[2]: Toyota
            Car[3]: Fiat
             */
        }

        // second method
        String[] names = new String[] {"Adam", "Ola", "Ewa", "Jan"};

        System.out.println(names[1]); // Ola

        System.out.println(Arrays.toString(names)); // [Adam, Ola, Ewa, Jan]

        for(String name : names) {
            System.out.println("Name: " + name);
            /*
            Name: Adam
            Name: Ola
            Name: Ewa
            Name: Jan
             */
        }
    }
}
