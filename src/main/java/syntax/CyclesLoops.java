package syntax;

public class CyclesLoops {
    public static void main(String[] args)
    {
        // do-while

        // Syntax:
        // do {
            // code to be executed
        // } while (condition);

        int counter = 1;
        do {
            System.out.println("Counter value: " + counter);

            counter++;
        } while (counter <= 5);

        // while

        // Syntax:
        // while(condition) {
            // code to be executed
        // }

        int i = 1;
        while(i <= 5) {
            System.out.println(i);
            i++;
        }

        // for

        // Syntax:
        // for (initialization; termination; increment/decrement) {
            // Body of loop
        // }

        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
        }

        for (int t = 0; t <= 10; t += 2) {
            System.out.println(t);
        }

        for (int k = 1; k <= 5; k++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int m = 1;
        for (; m <= 5;) {
            System.out.println(m);
            m++;
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("The number is: " + num);
        }
    }

}
