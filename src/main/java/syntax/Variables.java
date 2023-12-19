package syntax;

public class Variables {

    public static void main(String[] args)
    {
        // Primitive data types
        // Variables name is in the camelCase
        int clientAge;
        clientAge = 25;
        // OR
        int customerAge = 25;
        // Primitive data types
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        float salary = 1232f;
        double biggerSalary = 900717887.9;
        char initial = 'A';
        boolean isStudent = true;

        //Create a constant
        final double PI = 3.141592653589793;
        // Uncommenting the next line will cause a compile error
        // PI = 3.14;
        System.out.println(PI);
        // The final keyword can also be used with classes to prevent inheritance and with methods to prevent overriding.

        // Another data types
        String name = "John";
        String[] names = {"John", "Doe", "Jane"};
    }

}
