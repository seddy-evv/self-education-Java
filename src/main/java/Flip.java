/**
 * The class simulates a coin toss
 **/

public class Flip
{
    public static void main(String[] args)
    {
        myMethod();
    }
    static void myMethod()
    {
        if (Math.random() < 0.5) System.out.println("Head");
        else                     System.out.println("Tails");
    }
}