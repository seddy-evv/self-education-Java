/**
 * This version of class CouponCollector demonstrates the correct style of programming by encapsulating computations
 * with static methods. This code works in the same way as CouponCollector, but in it the code is better divided
 * into three components: generating a random integer from 0 to n - 1, conducting an experiment with coupon collection
 * and input/output management.
 *
 * n - number of denominations (from 0 to n-1)
 * isCollected[i] - coupon i was received?
 * count - number of collected coupons
 * distinct - number of different coupons collected
 * r - random coupon
 **/

public class Coupon
{
    public static int getCoupon(int n)
    {
        return (int) (Math.random() * n);
    }
    public static int collectCoupons(int n)
    {
        boolean[] isCollected = new boolean[n];
        int count = 0, distinct = 0;
        while (distinct < n)
        {
            int r = getCoupon(n);
            count++;
            if (!isCollected[r])
                distinct++;
            isCollected[r] = true;
        }
        return count;
    }

    public static void main(String[] args)
    {
//        int n = Integer.parseInt(args[0]);
        StdOut.println("Enter the number of denominations: ");
        int n = StdIn.readInt();
        int count = collectCoupons(n);
        StdOut.println(count);
    }
}