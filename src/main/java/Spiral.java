/**
 * A modified version of the Turtle class where the amount of movement decreases with each step,
 * and the turtle makes 10 full turns. The shape of the helix depends on the angle and attenuation factor.
 *
 **/


public class Spiral
{
    public static void main (String[] args)
    {
//        int n = Integer.parseInt(args[0]);
//        double decay = Double.parseDouble(args[1]);
        StdOut.println("Enter the angle: ");
        int n = StdIn.readInt();
        StdOut.println("Enter the attenuation factor: ");
        double decay = StdIn.readDouble();
        double angle = 360.0 / n;
        double step = Math.sin(Math.toRadians(angle/2));
        Turtle turtle = new Turtle(0.5, 0, angle/2);

        for (int i = 0; i < 10 * 360 / angle; i++)
        {
            step /= decay;
            turtle.goForward(step);
            turtle.turnleft(angle);
        }
    }
}