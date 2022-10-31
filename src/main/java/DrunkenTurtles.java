/**
 * The class simulates the Brownian motion of a drunken turtle (moving a fixed distance in a random direction).
 *
 **/

public class DrunkenTurtles {
    public static void main(String[] args)
    {
//        int n = Integer.parseInt(args[0]);
//        int trials = Integer.parseInt(args[1]);
//        double step = Double.parseDouble(args[2]);
        StdOut.println("Enter the number of turtles: ");
        int n = StdIn.readInt();
        StdOut.println("Enter the number of trials: ");
        int trials = StdIn.readInt();
        StdOut.println("Enter the travel length: ");
        double step = StdIn.readDouble();
        Turtle[] turtles = new Turtle[n];
        for (int i = 0; i < n; i++)
        {
            double x = StdRandom.uniformDouble(0.0, 1.0);
            double y = StdRandom.uniformDouble(0.0, 1.0);
            turtles[i] = new Turtle(x, y, 0.0);
        }
        for (int t = 0; t < trials; t++)
        {
            for (int i = 0; i < n; i++)
            {
                turtles[i].turnleft(StdRandom.uniformDouble(0.0, 360.0));
                turtles[i].goForward(step);
            }
        }
    }
}
