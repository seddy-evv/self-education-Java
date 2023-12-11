package examples;
/**
 * The class counts the number of attempts to fill in all coupon fields
 * n - int - number of coupon fields
 **/

public class CouponCollector
{
    public static void main(String[] args)
    {
//        int n = Integer.parseInt(args[0]);
        myMethod(15);
    }
    static void myMethod(int n)
    {
        boolean[] isCollected = new boolean[n];
        int count = 0;
        int distinct = 0;

        while (distinct < n)
        {
            int r = (int) (Math.random() * n);
            count++;
            if (!isCollected[r])
            {
                distinct++;
                isCollected[r] = true;
            }
        }
        System.out.println(count);
    }
}