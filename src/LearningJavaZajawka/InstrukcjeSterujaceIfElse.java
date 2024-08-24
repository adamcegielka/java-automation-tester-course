package LearningJavaZajawka;

public class InstrukcjeSterujaceIfElse {
    public static void main(String[] args) {

        System.out.println("Can I drive a car?");
        int age = 17;

        if (age >= 18 && age < 70) {
            System.out.println("You can drive");
        } else if (age >= 16 && age < 18) {
            System.out.println("Only if your parent is next to");
        } else if (age >= 70) {
            System.out.println("Only if the doctor permits!");
        } else {
            System.out.println("You can't drive a car!");
        }
    }
}
