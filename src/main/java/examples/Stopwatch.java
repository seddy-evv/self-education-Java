package examples;

/**
 * The class implements a simple data type that can be used to compare the execution time of
 * two time-critical methods. The test client compares the execution time of two functions
 * for calculating the square root from the Java Math library. For the task of calculating the sum
 * of the square roots of numbers from 1 to n, the version that calls Math.sqrt() is 10 times faster than
 * the version that calls Math.pow(). However, most likely, this result will depend on the specific system.
 **/


public class Stopwatch
{
    private final long start;

    public Stopwatch()
    {start = System.currentTimeMillis();}

    public double elapsedTime()
    {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    public static void main(String[] args)
    {
//        int n = Integer.parseInt(args[0]);
        StdOut.println("Enter the number: ");
        int n = StdIn.readInt();
        Stopwatch timer1 = new Stopwatch();
        double sum1 = 0.0;
        for (int i = 1; i <= n; i++)
            sum1 += Math.sqrt(i);
        double time1 = timer1.elapsedTime();
        StdOut.printf("%e (%.2f seconds)\n", sum1, time1);

        Stopwatch timer2 = new Stopwatch();
        double sum2 = 0.0;
        for (int i = 1; i <= n; i++)
            sum2 += Math.pow(i, 0.5);
        double time2 = timer2.elapsedTime();
        StdOut.printf("%e(%.2f seconds)\n", sum2, time2);

    }
}