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
