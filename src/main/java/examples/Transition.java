package examples;

/**
 * The class is a filter that reads references from standard input and outputs the corresponding transition
 * matrix to standard output. The program first processes the input data and counts the outgoing links
 * for each page, and then applies the 90/10 rule to build the transition matrix. It is assumed
 * that in the output matrix there is not a single page that does not have outbound links.
 *
 * n - number of pages
 * count[i][j] - number of links from page i to page j
 * outDegrees[i] - number of links from page i to anywhere
 * p - transition probability
 **/

public class Transition
{
    public static void main(String[] args)
    {
        StdOut.println("Enter the number of pages: ");
        int n = StdIn.readInt();
        int[][] counts = new int[n][n];
        int [] outDegrees = new int[n];
        StdOut.println("Enter the links: ");
        while (!StdIn.isEmpty())
        {
            int i = StdIn.readInt();
            int j = StdIn.readInt();
            outDegrees[i]++;
            counts[i][j]++;
        }
        StdOut.println(n + " " + n);
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                double p = 0.9*counts[i][j]/outDegrees[i] + 0.1/n;
                StdOut.printf("%8.5f", p);
            }
            StdOut.println();
        }
    }
}