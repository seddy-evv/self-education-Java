package examples;

/**
 * The class encapsulates a simple integer counter: it gives it a string name and initializes it to 0
 * (default initialization in the Java language). The counter is incremented each time the client
 * calls increment(), returns the current value when calling value(), and creates a string with the
 * name and current value when calling toString().
 *
 **/

public class Counter
{
    private final String name;
    private final int maxCount;
    private int count;

    public Counter(String id, int max)
    { name = id; maxCount = max; }

    public void increment()
    { if (count < maxCount) count++; }

    public int value()
    { return count; }

    public String toString()
    { return name + ": " + count; }

    public static void main(String[] args)
    {
//        int n = Integer.parseInt(args[0]);
//        int trials = Integer.parseInt(args[1]);
        StdOut.println("Enter the n: ");
        int n = StdIn.readInt();
        StdOut.println("Enter the trials: ");
        int trials = StdIn.readInt();
        Counter[] hits = new Counter[n];
        for ( int i = 0; i < n; i++)
            hits[i] = new Counter(i + ",", trials);
        for (int t = 0; t < trials; t++)
            hits[StdRandom.uniformInt(n)].increment();
        for (int i = 0; i < n; i++)
            StdOut.println(hits[i]);
    }
}
