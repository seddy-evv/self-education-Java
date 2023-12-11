package examples;

/**
 * The class reads a sequence of double numbers from standard input, calculates their arithmetic mean,
 * and prints it to standard output (assuming sum a does not cause overflow).
 * From the point of view of the program, the size of the input stream is unlimited.
 **/

public class Average
{
    public static void main(String[] args)
    {
        double sum = 0.0;
        int n = 0;
        StdOut.print("Enter the number: ");
        while (!StdIn.isEmpty())
        {
            double value = StdIn.readDouble();
            sum += value;
            n++;
        }
        double average = sum / n;
        StdOut.println("Average is " + average);
    }
}