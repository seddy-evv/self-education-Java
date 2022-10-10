/**
 * This class reads notes and time intervals from standard input and produces a pure tone,
 * corresponding to each note for a given duration, using the standard
 * audio devices. Each note is given by the pitch (distance from the "concert A").
 * After reading each note and duration, the program creates an array by sampling the sine wave
 * and duration at 44,100 points per second, and plays back the data by calling the StdAudio.play()
 *
 * pitch - distance from the note "A"
 * duration - note playing time
 * hz - frequency
 * n - amount of points
 * a[] - sine wave sampling data
 **/

public class PlayThatTune{
    public static void main(String[] args)
    {
        int SAMPLING_RATE = 44100;
        {
            StdOut.println("Enter the distance from the note 'A': ");
            int pitch = StdIn.readInt();
            StdOut.println("Enter the note playing time: ");
            double duration = StdIn.readDouble();
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int n = (int) (SAMPLING_RATE * duration);
            double[] a = new double[n+1];
            for (int i = 0; i <= n; i++)
                a[i] = Math.sin(2+Math.PI * i * hz / SAMPLING_RATE);
            StdAudio.play(a);
        }
    }
}