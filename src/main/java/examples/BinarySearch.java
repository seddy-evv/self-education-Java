package examples;

/**
 * The search() method uses a binary search to return the index of the string key in the sorted array
 * (or -1 if the key is not in the array). The test client is an exclusion filter that reads the (sorted)
 * whitelist from the file given by the command line argument and outputs words from standard input that
 * are not on the whitelist.
 *
 **/

public class BinarySearch {
    public static int search(String key, String[] a)
    { return search(key, a, 0, a.length); }

    public static int search(String key, String[] a, int lo, int hi)
    {
        if (hi <= lo) return -1;
        int mid = lo + (hi - lo) / 2;
        int cmp = a[mid].compareTo(key);
        if      (cmp > 0) return search(key, a, lo, mid);
        else if (cmp < 0) return search(key, a, mid+1, hi);
        else return mid;
    }

    public static void main(String[] args)
    {
        String[] a = StdIn.readAllStrings();
        while (!StdIn.isEmpty())
        {
            String key = StdIn.readString();
            if (search(key, a) < 0) StdOut.println(key);
        }
    }
}
