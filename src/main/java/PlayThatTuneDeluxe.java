/**
 * This class improves the sounds produced by the class PlayThatTune; to do this, he creates harmonics
 * using static methods, which makes the sound more realistic than a pure tone.
 *
 * pitch - distance from the note "A"
 * duration - note playing time
 * hz - frequency
 * hi[] - upper harmonic
 * lo[] - lower harmonic
 * h[] - tone with harmonics
 **/


public class PlayThatTuneDeluxe
{
    public static double[] superpose(double[] a, double[] b, double awt, double bwt)
    {
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++)
            c[i] = a[i] * awt + b[i] * bwt;
        return c;
    }
    public static double[] tone(double hz, double t)
    {
        int Rate = 44100;
        int n = (int) (Rate * t);
        double[] a = new double[n + 1];
        for (int i = 0; i <= n; i++)
            a[i] = Math.sin(2 * Math.PI * i * hz / Rate);
        return a;
    }
    public static double[] note (int pitch, double t)
    {
        double hz = 440.0 * Math.pow(2, pitch / 12.0);
        double[] a = tone(hz, t);
        double[] hi = tone(2 * hz, t);
        double[] lo = tone(hz / 2, t);
        double[] h = superpose(hi, lo, 0.5,0.5);
        return superpose(a, h, 0.5, 0.5);
    }

    public static void main (String[] args)
    {
        StdOut.println("Enter the values: ");
        while (!StdIn.isEmpty())
        {
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble();
            double[] a = note(pitch, duration);
            StdAudio.play(a);
        }
    }
}