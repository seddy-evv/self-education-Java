package examples;

/**
 * The class outputs powers of two for the passed value.
 * n - int - max power of two
 **/

public class PowersofTwo
{
    public static void main(String[] args)
    {
//        int n = Integer.parseInt(args[0]);
        myMethod(10);
    }
    static void myMethod(int n)
    {
        int power = 1;
        int i = 0;
        while (i <= n)
        {
            System.out.println(i + " " + power);
            power = 2 * power;
            i = i + 1;
        }
    }
}