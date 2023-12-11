package examples;

/**
 * The simplest example of getting a random double number
 **/

public class RandomDouble
{
    public static void main(String[] args)
    {
       myMethod();
    }
    static void myMethod()
    {
        double r = Math.random();
        System.out.println(r * 100);
    }
}