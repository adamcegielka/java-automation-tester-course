package LearningJavaForTester;

public class L01PrymitywneTypyDanych {
    public static void main(String[] args) {
        // liczby staloprzecinkowe
        byte exFirst = 127;         // 1 bajt -128 => 127
        short exSecond = 32689;     // 2 bajty -32768 => 32767
        int exThird = 32768999;     // 4 bajty -2 147 483 648 => 2 147 483 647
        long exFourt = 2148000L;    // 8 bajtów - 2^63 => (2^63)-1

        // liczby staloprzecinkowe
        float exFifth = 4.99934F;         // 4 bajty - max ok 6-7 liczb po przecinku
        double exSix = 3.99999999999999D; // 8 bajtów - max ok 15 cyfr po przecinku

        // wartosci logiczne
        boolean prawda = true;
        boolean falsz = false;

        // pojedynczy znak
        char letter = 'A';
    }
}
