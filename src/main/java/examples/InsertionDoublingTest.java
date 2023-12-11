package examples;

/**
 * The timeTrials() method performs Insertion.sort() on arrays of random doubles. The first argument
 * n is the length of the array; the second argument to trials specifies the number of trials.
 * Increasing the number of trials improves the accuracy of the results because it eliminates system-specific
 * effects and the actual insertion sort time depends on the input.
 **/


public class InsertionDoublingTest {
    public static double timeTrials(int trials, int n)
    {
        double total = 0.0;
        Double[] a = new Double[n];
        for (int t = 0; t < trials; t++)
        {
            for (int i = 0; i < n; i++)
                a[i] = StdRandom.uniformDouble(0.0, 1.0);
            Stopwatch timer = new Stopwatch();
            Insertion.sort(a);
            total += timer.elapsedTime();
        }
        return total;
    }
    public static void main(String[] args)
    {
//        int trials = Integer.parseInt(args[0]);
        StdOut.println("Enter the number of trials: ");
        int trials = StdIn.readInt();
        for (int n = 1024; true; n += n)
        {
            double prev = timeTrials(trials, n/2);
            double curr = timeTrials(trials, n);
            double ratio = curr / prev;
            StdOut.printf("%7d %4.2f\n", n, ratio);
         }
    }
}
