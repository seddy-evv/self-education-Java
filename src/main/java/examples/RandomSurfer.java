package examples;

/**
 * The program uses a transition matrix to model the behavior of random surfing. It takes the number
 * of moves as a command line argument, reads the transition matrix, performs the given number of moves,
 * and prints the relative frequency of visits to each page. A key role in the calculations belongs to the
 * simulation of a random transition to the next page.
 *
 * trials - number of movements
 * n - number of pages
 * page - current page
 * p[i][j] - probability of going from page i to page j
 * freq[i] - number of page i visits
 **/

public class RandomSurfer
{
    public static void main(String[] args)
    {
//        int trials = Integer.parseInt(args[0]);
        StdOut.println("Enter the number of movements: ");
        int trials = StdIn.readInt();
        StdOut.println("Enter the number of pages: ");
        int n = StdIn.readInt();
        double[][] p = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                p[i][j] = StdIn.readDouble();
        int page = 0;
        int[] freq = new int[n];
        for (int t = 0; t < trials; t++)
        {
            double r = Math.random();
            double sum = 0.0;
            for (int j = 0; j < n; j++)
            {
                sum += p[page][j];
                if (r < sum) {page = j; break;}
            }
            freq[page]++;
        }
        for (int i = 0; i < n; i++)
            StdOut.printf("%8.5f", (double) freq[i] / trials);
        StdOut.println();
    }
}