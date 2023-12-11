package examples;

/**
 * Simple while loop example
 **/

public class TenHellos
{
    public static void main(String[] args)
    {
        myMethod();
    }
    static void myMethod()
    {
        System.out.println("1st Hello");
        System.out.println("2st Hello");
        System.out.println("3st Hello");
        int i = 4;
        while (i <= 10)
        {
            System.out.println(i + "th Hello");
            i = i + 1;
        }
    }
}