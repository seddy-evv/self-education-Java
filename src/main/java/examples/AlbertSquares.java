package examples;

import java.awt.Color;
/**
 * The class outputs two colors specified in RGB format on the command line.
 * Colors are given in the well-known chromatic format that has been proposed
 * in the 1960s by color theorist Joseph Albers.
 *
 * r1, g1, b1 - RGB values
 * c1 - first color
 * r2, g2, b2 - RGB values
 * c2 - second value
 **/

public class AlbertSquares
{
    public static void main(String[] args)
    {
        StdOut.println("Enter six value: ");
//        int r1 = Integer.parseInt(args[0]);
//        int g1 = Integer.parseInt(args[1]);
//        int b1 = Integer.parseInt(args[2]);
        int r1 = StdIn.readInt();
        int g1 = StdIn.readInt();
        int b1 = StdIn.readInt();
        Color c1 = new Color(r1, g1, b1);

//        int r2 = Integer.parseInt(args[3]);
//        int g2 = Integer.parseInt(args[4]);
//        int b2 = Integer.parseInt(args[5]);
        int r2 = StdIn.readInt();
        int g2 = StdIn.readInt();
        int b2 = StdIn.readInt();
        Color c2 = new Color(r2, g2, b2);

        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(.25, 0.5, 0.2);
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(.25, 0.5, 0.1);
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(.75, 0.5, 0.2);
        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(.75, 0.5, 0.1);


    }
}