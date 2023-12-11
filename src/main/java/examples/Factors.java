package examples;

/**
 * The class decomposes the number into prime factors
 * n - long - number to decompose
 **/

public class Factors
{
    public static void main(String[] args)
    {
//        long n = Long.parseLong(args[0]);
        myMethod(19);
    }
    static void myMethod(long n)
    {
        for (long factor = 2; factor <= n/factor; factor++)
        {
            while (n % factor == 0)
            {
                n /= factor;
                System.out.print(factor + " ");
            }
        }
        if ( n > 1) System.out.print(n);
        System.out.println();
    }
}