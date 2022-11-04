

public class ComplexDelete {
    private final double r;
    private final double theta;

    public ComplexDelete(double re, double im)
    {
        r = Math.sqrt(re*re + im*im);
        theta = Math.atan2(im, re);
    }

    public ComplexDelete plus (ComplexDelete b)
    {
        double real = re() + b.re();
        double imag = im() + b.im();
        return new ComplexDelete(real, imag);
    }

    public ComplexDelete times(ComplexDelete b)
    {
        double radius = r * b.r;
        double angle = theta + b.theta;
        return new ComplexDelete(radius, angle);
    }

    public double abs()
    {return r; }

    public double re() {return r * Math.cos(theta); }
    public double im() {return r * Math.sin(theta); }

    public String toString()
    { return re() + " + " + im() + "i"; }

    public static void main(String[] args)
    {
        ComplexDelete z0 = new ComplexDelete(1.0, 1.0);
        ComplexDelete z = z0;
        z = z.times(z).plus(z0);
        z = z.times(z).plus(z0);
        StdOut.println(z);
    }
}

