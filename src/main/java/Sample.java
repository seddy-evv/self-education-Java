/**
 * The class receives two numbers and constructs a sample of integers from the range 0 to n - 1.
 * This process may be useful not for only in lotteries, but also in many scientific applications.
 * If the first argument is equal to the second, then the result is a random permutation of the integer
 * range from 0 to n-1. If the first argument is greater than the second, the program ends with
 * an ArrayOutOfBoundsException.
 * m - int - first argument
 * n - int - second argument
 **/

public class Sample
{
    public static void main(String [] args)
    {
//        int m = Integer.parseInt(args[0]);
//        int n = Integer.parseInt(args[1]);
        myMethod(10,10);
    }
    static void myMethod(int m, int n)
    {
        int[] perm = new int[n];

        for (int j = 0; j < n; j++)
            perm[j] = j;

        for (int i=0; i < m; i++)
        {
            int r = i + (int) (Math.random() * (n-i));
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
        }
        for (int i = 0; i < m; i++)
            System.out.print(perm[i] + " ");
        System.out.println();
    }
}