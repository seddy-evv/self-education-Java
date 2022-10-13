/**
 * The program reads matrices of transitions from standard input and calculates the probabilities that
 * a random surf will lead to each page (page ranks) after the number of steps given in the command line argument.
 *
 * trials - number of movements
 * n - number of pages
 * p[][] - transition matrix
 * ranks[] - page ranks
 * newRanks[] - new page ranks
 **/

public class Markov
{
    public static void main(String[] args)
    {
//        int trials = Integer.parseInt(args[0]);
        StdOut.println("Enter the number of movements: ");
        int trials = StdIn.readInt();
        StdOut.println("Enter the number of pages: ");
        int n = StdIn.readInt();
        double[][] p = new double[n][n];
        StdOut.println("Enter the values for matrices of transitions: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                p[i][j] = StdIn.readDouble();
        double[] ranks = new double [n];
        ranks[0] = 1.0;
        for (int t = 0; t < trials; t++)
        {
            double[] newRanks = new double[n];
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                    newRanks[j] += ranks[k] * p[k][j];
            }
            for (int j = 0; j < n; j++)
                ranks[j] = newRanks[j];
        }
        for (int i = 0; i < n; i++)
            StdOut.printf("%8.5f", ranks[i]);
        StdOut.println();

    }
}