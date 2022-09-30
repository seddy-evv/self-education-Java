/**
 * The class receives a positive floating-point number c and calculates the square root of c
 * to 15 digits using Newton's method.
 * c - double - number to calculate
 **/

public class Sqrt
{
    public static void main(String[] args)
    {
//        double c = Double.parseDouble(args[0]);
        myMethod(9);
    }
    static void myMethod(double c)
    {
        double EPSILON = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > EPSILON * t)
        {
            t = (c/t + t) / 2.0;
        }
        System.out.println(t);
    }
}