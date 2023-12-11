package examples;

/**
 * The class receives three integers as arguments : the initial amount 'stake', the target 'goal',
 * and the number of trials 'trials'. The inner 'while' loop models a player with
 * an initial amount who makes a series of $1 bets and continues playing until he goes bust or reaches his goal.
 * The execution time of this program is proportional to the product of the number of trials and the
 * average number of bets.
 **/

public class Gambler
{
    public static void main(String[] args)
    {
//        int stake = Integer.parseInt(args[0]);
//        int goal = Integer.parseInt(args[1]);
//        int trials = Integer.parseInt(args[2]);
        myMethod(1, 10, 15);
    }
    static void myMethod(int stake, int goal, int trials)
    {
        int bets = 0;
        int wins = 0;
        for (int t = 0; t < trials; t++)
        {
            int cash = stake;
            while (cash > 0 && cash < goal)
            {
                bets++;
                if (Math.random() < 0.5) cash++;
                else                     cash--;
            }
            if (cash == goal) wins++;
        }
        System.out.println(100*wins/trials + "% wins");
        System.out.println("Avg # bets: " + bets/trials);
    }
}