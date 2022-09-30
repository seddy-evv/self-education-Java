/**
 * The class receives arguments n and trials and simulates random walks without self-intersections
 * on a n*n grid. For each walk, the program creates a boolean array, starts the walk at the center,
 * and keeps moving until it hits a dead end or reaches a boundary. The result of the calculation is the
 * percentage of walks that ended in a dead end. Increasing the number of experiments increases the
 * accuracy of the estimate.
 * n - int - grid side size
 * trials - int - number of trials
 **/

public class SelfAvoidingWalk
{
    public static void main(String[] args)
    {
//        int n  = Integer.parseInt(args[0]);
//        int trials = Integer.parseInt(args[1]);
        myMethod(10,100);
    }
    static void myMethod(int n, int trials)
    {
        int deadEnds = 0;
        for (int t=0; t < trials; t++)
        {
            boolean[][] a = new boolean[n][n];
            int x = n/2, y = n/2;
            while (x > 0 && x < n-1 && y > 0 && y < n-1)
            {
                a[x][y] = true;
                if (a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1])
                { deadEnds++;break; }
                double r = Math.random();
                if      (r < 0.25) { if (!a[x+1][y]) x++; }
                else if (r < 0.50) { if (!a[x-1][y]) x--; }
                else if (r < 0.75) { if (!a[x][y+1]) y++; }
                else if (r < 1.00) { if (!a[x][y-1]) y--; }
            }
        }
        System.out.println(100*deadEnds/trials + "% dead ends");
    }
}