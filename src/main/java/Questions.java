public class Questions {
    public static int binarySearch(int lo, int hi)
    {
        if (hi - lo == 1) return lo;
        int mid = lo + (hi - lo) / 2;
        StdOut.println("Greater than or equal to " + mid + "? ");
        if (StdIn.readBoolean())
            return binarySearch(mid, hi);
        else
            return binarySearch(lo, mid);
    }

    public static void main(String[] args)
    {
//        int k = Integer.parseInt(args[0]);
        int k = StdIn.readInt();
        int n = (int) Math.pow(2, k);
        StdOut.print("Think of a number ");
        StdOut.println("between 0 and " + (n-1));
        int guess = binarySearch(0, n);
        StdOut.println("Your number is " + guess);
    }
}
