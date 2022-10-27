/**
 * This class implements turtle graphics (with relative move commands) that often
 * make it easier to create vector drawings.
 **/


public class Turtle
{
    private double x, y;
    private double angle;

    public Turtle(double x0, double y0, double a0)
    { x = x0; y = y0; angle = a0; }

    public void turnleft (double delta)
    {angle += delta;}

    public void goForward(double step)
    {
        double oldx = x, oldy = y;
        x += step * Math.cos(Math.toRadians(angle));
        y += step * Math.sin(Math.toRadians(angle));
        StdDraw.line(oldx, oldy, x, y);
    }

    public static void main (String[] args)
    {
//        int n = Integer.parseInt(args[0]);
        StdOut.println("Enter the number of sides: ");
        int n = StdIn.readInt();
        double angle = 360.0 / n;
        double step = Math.sin(Math.toRadians(angle/2));
        Turtle turtle = new Turtle(0.5, 0.0, angle/2);
        for (int i = 0; i < n; i++)
        {
            turtle.goForward(step);
            turtle.turnleft(angle);
        }
    }
}