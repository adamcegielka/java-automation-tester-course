package learning;

public class TypesDataVariablesConst {
    public static void main(String[] args) {
        // One mark
        char oneMark;
        oneMark = 'e';
        System.out.println(oneMark);

        // String
        String name;
        name = "Learning to program";
        System.out.println(name);

        // Boolean: true, false
        boolean logicalType;
        logicalType = true;
        System.out.println(logicalType);
        // true

        // Numbers (fixed-point)
        byte byteNumberMin = Byte.MIN_VALUE;
        byte byteNumberMax = Byte.MAX_VALUE;
        System.out.println("byte: " + " from " + byteNumberMin + " to " + byteNumberMax);
        // from -128 to 127

        short shortNumberMin = Short.MIN_VALUE;
        short shertNumberMax = Short.MAX_VALUE;
        System.out.println("short: " + " from " + shortNumberMin + " to " + shertNumberMax);
        // from -32768 to 32767

        int integerMin = Integer.MIN_VALUE;
        int integerMax = Integer.MAX_VALUE;
        System.out.println("integer: " + " from " + integerMin + " to " + integerMax);
        // from -2147483648 to 2147483647

        long longNumberMin = Long.MIN_VALUE;
        long longNumberMax = Long.MAX_VALUE;
        System.out.println("long: " + " from " + longNumberMin + " to " + longNumberMax);
        // from -9223372036854775808 to 9223372036854775807

        // real numbers (floating point)
        float floatNumberMin = Float.MIN_VALUE;
        float floatNumberMax = Float.MAX_VALUE;
        System.out.println("float: " + " from " + floatNumberMin + " to " + floatNumberMax);
        // from 1.4E-45 to 3.4028235E38
        float floatNumber = 8.12345F;
        System.out.println("float number: " + floatNumber);
        // 8.12345

        double doubleNumberMin = Double.MIN_VALUE;
        double doubleNumberMax = Double.MAX_VALUE;
        System.out.println("double: " + " from " + doubleNumberMin + " to " + doubleNumberMax);
        // from 4.9E-324 to 1.7976931348623157E308
        double doubleNumber = 9.12345678910111213D;
        System.out.println("double number: " + doubleNumber);
        // 9.123456789101112

        // Variables
        int firstNumber = 24;
        int secondNumber = 36;
        firstNumber = secondNumber;
        System.out.println(firstNumber);
        // 36

        // Const (final )
        final int constantNumber = 123;
    }
}
