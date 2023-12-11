package examples;

/**
 * The Vector client generates a d-dimensional unit vector based on the document's k-grams,
 * which can be used by clients to evaluate its similarity to other documents.
 *
 **/

public class Sketch {
    private final Vector profile;
    public Sketch(String text, int k, int d)
    {
        int n = text.length();
        double[] freq = new double[d];
        for (int i = 0; i < n-k; i++)
        {
            String kgram = text.substring(i, i+k);
            int hash = kgram.hashCode();
            freq[Math.abs(hash % d)] +=1;
        }
        Vector vector = new Vector(freq);
        profile = vector.direction();
    }
    public double similarTo(Sketch other)
    {
        return profile.dot(other.profile);
    }
    public static void main(String[] args)
    {
//        int k = Integer.parseInt(args[0]);
//        int d = Integer.parseInt(args[1]);
        StdOut.println("Enter the length 'grams': ");
        int k = StdIn.readInt();
        StdOut.println("Enter the unit vector length: ");
        int d = StdIn.readInt();
        StdOut.println("Enter the text: ");
        String text = StdIn.readAll();
        Sketch sketch = new Sketch(text, k, d);
        StdOut.println(sketch);
    }
}
