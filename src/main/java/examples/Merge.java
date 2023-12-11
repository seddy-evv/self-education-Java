package examples;

/**
 * The sort() function implements the merge sort algorithm. It sorts arrays
 * with any data type that implements the Comparable interface. Unlike Insertion.sort()
 * this implementation is also suitable for very large arrays.
 **/

public class Merge {
    public static void sort(Comparable[] a)
    {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length);
    }

    private static void sort(Comparable[] a, Comparable[] aux,
                             int lo, int hi)
    {
        if (hi - lo <= 1) return;
        int mid = lo + (hi-lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid, hi);
        int i = lo, j = mid;
        for (int k = lo; k < hi; k++)
            if      (i == mid) aux[k] = a[j++];
            else if (j == hi)  aux[k] = a[i++];
            else if (a[j].compareTo(a[i]) < 0) aux[k] = a[j++];
            else                               aux[k] = a[i++];
        for (int k = lo; k < hi; k++)
            a[k] = aux[k];
    }

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
