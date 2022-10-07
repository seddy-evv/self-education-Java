/**
 * The class simulates the movement of the ball in the field with coordinates from -1 to +1.
 * The ball is repelled from the boundaries according to the laws of inelastic collisions.
 * The twenty millisecond delay in StdDraw.pause() keeps the black ball on the screen even
 * though most of its pixels change from black to white and vice versa.
 **/

public class BouncingBall
{
    public static void main(String[] args)
    {
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        double rx = 0.480, ry = 0.860;
        double vx = 0.015, vy = 0.023;
        double radius = 0.05;
        StdDraw.enableDoubleBuffering();
        while (true)
        {
            if (Math.abs(rx + vx) + radius > 1.0) vx = -vx;
            if (Math.abs(ry+ vy) + radius > 1.0) vy = -vy;
            rx += vx;
            ry += vy;
            StdDraw.clear();
            StdDraw.filledCircle(rx, ry, radius);
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}