/**
 * Integer to Binary converter
 * n - int - Integer number
 **/

public class Binary
{
    public static void main(String[] args)
    {
//        int n = Integer.parseInt(args [0]);
        myMethod(15);
    }
    static void myMethod(int n)
    {
        int power = 1;
        while (power <= n/2)
            power = 2*power;
        while (power > 0)
        {
            if (n < power) { System.out.print(0);            }
            else           { System.out.print(1); n -= power;}
            power /= 2;
        }
        System.out.println();
    }
}