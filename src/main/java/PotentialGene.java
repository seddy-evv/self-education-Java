/**
 * The class takes a string with a DNA strand as an argument and determines if this string
 * matches a potential gene: length is a multiple of 3, the string starts with a start codon (ATG),
 * ends with a stop codon (TAA, TAG or TGA) and does not contain intermediate stop codons.
 *
 * dna - parsed string
 * codon - three consecutive base elements
 **/

public class PotentialGene
{
    public static boolean isPotentialGne(String dna)
    {
        if (dna.length() % 3 != 0) return false;
        if (!dna.startsWith("ATG")) return false;
        for (int i = 3; i < dna.length() -  3; i++)
        {
            if (i % 3 == 0)
            {
                String codon = dna.substring(i, i+3);
                if (codon.equals("TAA")) return false;
                if (codon.equals("TAG")) return false;
                if (codon.equals("TGA")) return false;
            }
        }
        if (dna.endsWith("TAA")) return true;
        if (dna.endsWith("TAG")) return true;
        if (dna.endsWith("TGA")) return true;

        return false;
    }
    public static void main (String[] args)
    {
        StdOut.println("Enter the DNA: ");
        String dna = StdIn.readString();
        StdOut.println(isPotentialGne(dna));

    }
}