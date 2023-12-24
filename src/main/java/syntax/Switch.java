package syntax;

public class Switch {
    public static void main(String[] args)
    {
        // Syntax:
        // switch (expression) {
            // case value1:
                // code block 1
                // break;
            // case value2:
                // code block 2
                // break;
            // ...
            // default:
                // default code block

        // }

        // Important Points
        // The expression used in the switch statement must yield a value of either char, byte, short, int, enum, or String.
        // Every case label should have a unique value within the same switch.
        // The break keyword breaks out of the switch block. If omitted, execution will continue with the next case or default, causing a fallthrough.
        // The default case is optional and can be omitted. It is executed when no case matches the evaluated expression.

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
        }

        // Share the same code block in the multiple case labels:
        int number = 5;
        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("The number is odd.");
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("The number is even.");
                break;
            default:
                System.out.println("Number not recognized.");
        }
    }
}
