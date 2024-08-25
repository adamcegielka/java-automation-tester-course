package LearningJavaZajawka;

public class L04Operatory {
    public static void main(String[] args) {

//      Integer
        System.out.println("-- Integer:");

        int a = 5;
        int b = 3;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b; // 2 (Modulo)

        System.out.println(a); // 5
        System.out.println(b); // 3
        System.out.println(c); // 8
        System.out.println(d); // 2
        System.out.println(e); // 15
        System.out.println(f); // 1
        System.out.println(g); // 2 (Modulo)

//      String
        System.out.println("-- String:");

        String x = "5";
        String y = "3";
        String z = x + y;
        String firstName = "John ";
        String lastName = "Smith";
        String fullName = firstName + lastName;

        System.out.println(z); // 53
        System.out.println(fullName); // John Smith

//      Boolean
        System.out.println("-- Boolean");

        boolean yes = true;
        boolean no = false;

        System.out.println("a > b: " + (a > b)); // a > b: true
        System.out.println("a < b: " + (a < b)); // a = b: false
        System.out.println("a >= b: " + (a >= b)); // a >= b: true
        System.out.println("a <= b: " + (a <= b)); // a <= b: false
        System.out.println("a == b: " + (a == b)); // a == b: false
        System.out.println("a != b: " + (a != b)); // a != b: true
        System.out.println("firstName.equals(lastName): " + firstName.equals(lastName)); // a != b: false
        System.out.println("!firstName.equals(lastName): " + !firstName.equals(lastName)); // a != b: true

        System.out.println(yes && no); // (and): false
        System.out.println(yes || no); // (or): true
        System.out.println(!yes); // (negation): false
        System.out.println(!no); // (negation): true

//      Assignment operator
        System.out.println("-- Assignment operator");

        int numb5 = 5;
        int numb7 = 7;
        numb5 += 4; // numb5 + 4 = 9
        numb7 -= 2; // numb7 - 2 = 5
        numb5++; // numb5(9) + 1 = 10
        numb7--; // numb7(6) - 1 = 4
        ++numb5; // 11
        --numb7; // 3

        System.out.println(numb5); // 11
        System.out.println(numb7); // 3

//      Explanation of how it works
        System.out.println("-- Explanation of how it works");
        int numb3a = 3;
        int numb3b = 3;

//      Post-increment i++
        System.out.println("Post-increment i++");
        System.out.println(numb3a);   // 3
        System.out.println(numb3a++); // 3
        System.out.println(numb3a);   // 4

//      Pre-increment ++i
        System.out.println("Pre-increment ++i");
        System.out.println(numb3b);   // 3
        System.out.println(++numb3b); // 4
        System.out.println(numb3b);   // 4

//      Post-decrement i--
        System.out.println("Post-decrement i--");
        System.out.println(numb3a);   // 4
        System.out.println(numb3a--); // 4
        System.out.println(numb3a);   // 3

//      Pre-decrement --i
        System.out.println("Pre-decrement --i");
        System.out.println(numb3b);   // 4
        System.out.println(--numb3b); // 3
        System.out.println(numb3b);   // 3
    }
}
