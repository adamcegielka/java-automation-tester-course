package LearningJavaZajawka;

public class Operatory {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int a = 5;
        int b = 3;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;

        String x = "5";
        String y = "3";
        String z = x + y;
        String firstName = "John ";
        String lastName = "Smith";
        String fullName = firstName + lastName;

        System.out.println("Integer:");
        System.out.println(a); // 5
        System.out.println(b); // 3
        System.out.println(c); // 8
        System.out.println(d); // 2
        System.out.println(e); // 15
        System.out.println(f); // 1
        System.out.println(g); // 2 (reszta z dzielenia)
        System.out.println("String:");
        System.out.println(z); // 53
        System.out.println(fullName); // John Smith
    }
}
