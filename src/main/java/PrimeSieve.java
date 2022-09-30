/**
 * The class receives an integer and calculates the number of primes less than or equal to the received.
 * n - int - integer for which calculations are performed
 **/

public class PrimeSieve
{
    public static void main(String[] args)
    {
//        int n = Integer.parseInt(args[0]);
        myMethod(15);
    }
    static void myMethod(int n)
    {
        boolean[] isPrime = new boolean[n+1];
        for (int i=2; i <= n; i++)
            isPrime[i] = true;
        for (int i = 2; i <= n/i; i++)
        { if (isPrime[i])
        {
            for (int j=i; j <= n/i; j++)
            {
                isPrime[i * j] = false;
            }
        }
        }
        int primes = 0;
        for (int i=2; i <= n; i++)
        {
            if (isPrime[i])
            {
                primes++;
                System.out.println(i);
            }
        }
        System.out.println(primes);
    }
}