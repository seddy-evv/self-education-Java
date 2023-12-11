package examples;
/**
 * The class is intended for use in Java programs that perform calculations on complex numbers.
 *
 **/

public class Complex
{
    private final double re;
    private final double im;

    public Complex(double real, double imag)
    { re = real; im = imag;}

    public Complex plus(Complex b)
    {
        double real = re + b.re;
        double imag = im + b.im;
        return new Complex(real, imag);
    }

    public Complex times(Complex b)
    {
        double real = re * b.re - im * b.im;
        double imag = re * b.im + im * b.re;
        return new Complex(real, imag);
    }

    public double abs()
    { return Math.sqrt(re*re + im*im);}

    public double re() { return re; }
    public double im() { return im; }

    public String toString()
    { return re + " + " + im + "i"; }

    public static void main(String[] args)
    {
        StdOut.println("Enter the real part: ");
        double real = StdIn.readDouble();
        StdOut.println("Enter the imaginary part: ");
        double imag = StdIn.readDouble();
        Complex z0 = new Complex(real, imag);
        Complex z = z0;
        z = z.times(z).plus(z0);
        z = z.times(z).plus(z0);
        StdOut.println(z);
    }
}