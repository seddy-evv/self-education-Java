/**
 * The class implements a simple number guessing game. User enters numbers
 * each of which can be viewed as an implicit question ("What's your guess?"),
 * and the program reports whether the user's guess turned out to be more or less than guessed
 * numbers. The user can always get to the answer ("You win!") in less than 20 questions.
 **/

public class TwentyQuestions
{
    public static void main(String[] args)
    {
        int secret = 1 + (int) (Math.random() * 1000000);
        StdOut.print("I'm thinking of a number ");
        StdOut.println("between 1 and 1,000,000");
        int guess = 0;
        while (guess != secret)
        {
            StdOut.print("What's your guess? ");
            guess = StdIn.readInt();
            if (guess == secret) StdOut.println ("You win!");
            if (guess < secret) StdOut.println ("You low ");
            if (guess > secret) StdOut.println ("You high ");
        }
    }
}