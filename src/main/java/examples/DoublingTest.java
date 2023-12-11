package examples;

/**
 * The class prints to the standard output the relationship table for the sum of triples problem.
 * The table shows how doubling the task size affects the execution time of the ThreeSum.countTriples() method call;
 * the task size is initially 512 and is doubled for each table row. The experiment leads us to the hypothesis
 * that the execution time increases by a factor of eight when the size of the input data is doubled.
 **/

public class DoublingTest {
    public static double tineTrial(int n)
    {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = StdRandom.uniformInt(2000000) - 1000000;
        Stopwatch timer = new Stopwatch();
        int count = ThreeSum.countTriples(a);
        return timer.elapsedTime();
    }

    public static void main(String[] args)
    {
        for (int n = 512; true; n *=2)
        {
            double previous = tineTrial(n/2);
            double current = tineTrial(n);
            double ratio = current / previous;
            StdOut.printf("%7d %4.2f\n", n, ratio);
        }
    }
}
