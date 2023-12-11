package examples;

/**
 * The simplest example of getting a random integer number
 **/

public class RandomInt
{
    public static void main(String[] args)
    {
        myMethod();
    }
    static void myMethod()
    {
        double r = Math.random();
        int value = (int)(r * 100);
        System.out.println(value);
    }
}