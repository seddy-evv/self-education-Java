package examples;

/**
 * Example of typical operations on integer values
 **/

public class IntOps
{
    public static void main(String[] args)
    {
//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
        myMethod(10,3);
    }
    static void myMethod(int a, int b)
    {
        int p = a * b;
        int q = a / b;
        int r = a % b;
        double h = (double) a / b;
        System.out.println(a + " * " + b + " = " + p);
        System.out.println(a + " / " + b + " = " + q + " - int");
        System.out.println(a + " / " + b + " = " + h + " - double");
        System.out.println(a + " % " + b + " = " + r);
        System.out.println(a + " = " + q + " * " + b + " + " + r);
    }
}