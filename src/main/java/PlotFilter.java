/**
 * The class reads a series of points from standard input and displays them using standard graphics.
 * The first four inputs are assumed to contain the minimum and maximum x and y coordinates.
 **/

public class PlotFilter
{
    public static void main(String[] args)
    {
        StdOut.println("Enter the minimum coordinate x: ");
        double x0 = StdIn.readDouble();
        StdOut.println("Enter the minimum coordinate y: ");
        double y0 = StdIn.readDouble();
        StdOut.println("enter the maximum coordinate x: ");
        double x1 = StdIn.readDouble();
        StdOut.println("enter the maximum coordinate y: ");
        double y1 = StdIn.readDouble();
        StdDraw.setXscale(x0,x1);
        StdDraw.setYscale(y0,y1);
        while (!StdIn.isEmpty())
        {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            StdDraw.point(x, y);
        }
    }
}