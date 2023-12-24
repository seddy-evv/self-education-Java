package syntax;

public class IfElse {
    public static void main(String[] args)
    {
        // Syntax:
        // if (condition1) {
            // code
        // } else if (condition2) {
            // code
        // } else {
            // code
        // }

        // Three main logical operators:
        // &&: Logical AND
        // ||: Logical OR
        // !: Logical NOT

        int number = 6;
        if (number > 0 && number % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else {
            System.out.println("The number does not meet the criteria.");
        }

        number = 7;
        if (number < 0 || number % 2 != 0) {
            System.out.println("The number is either negative or odd.");
        } else {
            System.out.println("The number is positive and even.");
        }

        number = 5;
        if (! (number == 0)) {
            System.out.println("The number is not zero.");
        } else {
            System.out.println("The number is zero.");
        }

        // Ternary Operator Syntax:
        //(condition) ? value_if_true : value_if_false;

        int a = 5, b = 7;
        int max = (a > b) ? a : b;
        System.out.println("The larger number is: " + max);
    }

}
