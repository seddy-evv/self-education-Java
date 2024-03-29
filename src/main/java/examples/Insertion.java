package examples;
/**
 * The sort() function implements insertion sort. It sorts arrays of any data type that implements
 * the Comparable interface (and therefore contains the compareTo() method). The implementation of Insertion.sort()
 * is only suitable for small and/or nearly ordered arrays; for large unordered arrays it works
 * too slow.
 *
 **/

public class Insertion {
    public static void sort(Comparable[] a)
    {
        int n = a.length;
        for (int i = 1; i < n; i++)
            for (int j = 1; j > 0; j--)
                if (a[j].compareTo(a[j-1]) < 0)
                    exchange(a, j-1, j);
                else break;
    }
    public static void exchange(Comparable[] a, int i, int j)
    { Comparable temp = a[j]; a[j] = a[i]; a[i] = temp; }

    public static void main(String[] args)
    {
        StdOut.println("Enter the strings for sort: ");
        String[] a = StdIn.readAllStrings();
        sort(a);
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }
}
