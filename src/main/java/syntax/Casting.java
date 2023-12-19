package syntax;

public class Casting {
    public static void main(String[] args)
    {
        // Implicit casting:
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myDouble);
        // Order of Implicit Casting:
        // byte -> short -> char -> int -> long -> float -> double

        // Explicit Casting:
        // Syntax:
        // (targetType) value
        double newDouble = 9.78;
        int newInt = (int) newDouble; // Explicit casting: double to int
        System.out.println(newInt);
    }

}
