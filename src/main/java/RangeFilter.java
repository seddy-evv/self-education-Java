/**
 * The class copies to the output stream only those numbers from the input stream that are within
 * the range specified by the lo and hi. The length of streams is not limited.
 **/

public class RangeFilter
{
    public static void main(String[] args)
    {
//        int lo = Integer.parseInt(args[0]);
//        int hi = Integer.parseInt(args[1]);
        int lo = 100;
        int hi = 200;
        StdOut.println("Enter the number: ");
        while (!StdIn.isEmpty())
        {
            int value = StdIn.readInt();
            if (value >= lo && value <=hi)
                StdOut.println(value + " ");
        }
        StdOut.println();
    }
}