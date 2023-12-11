package examples;
/**
 * This class implements a probability density function (pdf) and a distribution function (cdf) for
 * a Gaussian distribution, not implemented in the JavaMath library. The implementation of pdf()
 * follows straight from the definition, and the implementation of cdf() uses Taylor series and calls pdf().
 **/

public class Gaussian
{
    public static double pdf(double x)
    {
        return Math.exp(-x * x / 2) / Math.sqrt(2 * Math.PI);
    }

    public static double cdf(double z)
    {
        if (z < -8.0) return 0.0;
        if (z >  8.0) return 1.0;
        double sum = 0.0;
        double term = z;
        for (int i = 3; sum != sum + term; i += 2)
        {
            sum = sum + term;
            term = term * z * z / i;
        }
        return 0.5 + pdf(z) * sum;
    }

    public static void main(String[] args)
    {
//        double z = Double.parseDouble(args[0]);
//        double mu = Double.parseDouble(args[1]);
//        double sigma = Double.parseDouble(args[2]);
        StdOut.println("Enter the value z: ");
        double z     = StdIn.readDouble();
        StdOut.println("Enter the value mu: ");
        double mu    = StdIn.readDouble();
        StdOut.println("Enter the value sigma: ");
        double sigma = StdIn.readDouble();
        StdOut.printf("%.3f\n", cdf((z - mu) / sigma));
    }
}