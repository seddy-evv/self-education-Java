package examples;

/**
 * The simplest example of getting a random double number sequence
 **/

public class RandomSeq
{
    public static void main(String[] args)
    {
//        int n = Integer.parseInt(args[0]);
        myMethod(10);
    }
    static void myMethod(int n)
    {
        for (int i=0; i < n; i++)
            System.out.println(Math.random() * 100);
    }
}
