package examples;

/**
 * The class receives an integer argument and calculates the value of the nth harmonic number.
 * n - int - Integer number
 **/

public class HarmonicNumber
{
    public static void main(String[] args)
    {
//        int n = Integer.parseInt(args[0]);
        myMethod(10);
    }
    static void myMethod(int n)
    {
        double sum = 0.0;
        for (int i = 1; i <= n; i++)
        {
            sum += 1.0/i;
        }
        System.out.println(sum);
    }
}