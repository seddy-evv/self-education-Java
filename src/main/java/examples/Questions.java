package examples;

/**
 * The program uses binary search to play: you pick a number and the program tries to guess it.
 * She receives an integer k as a command line argument and offers to guess a number
 * from the range from 0 to n - 1, where n = pow(2, k).
 * The program is guaranteed to guess the answer in k questions.
 *
 * lo - smallest possible value
 * hi - lo - highest possible value
 * mid - middle
 * k - number of questions
 * n - number of possible values
 **/


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
        StdOut.println("Enter the number of questions: ");
        int k = StdIn.readInt();
        int n = (int) Math.pow(2, k);
        StdOut.print("Think of a number ");
        StdOut.println("between 0 and " + (n-1));
        int guess = binarySearch(0, n);
        StdOut.println("Your number is " + guess);
    }
}
