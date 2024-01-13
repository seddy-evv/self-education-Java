package syntax;

import java.util.TreeSet;

public class TreeSetCls {
    public static void main(String[] args) {
        // Features:
        // Ordered: Elements are stored in ascending order.
        // No duplicates: Just like any other set, it doesn’t allow duplicates.
        // Non-synchronized: Operations on TreeSet are not synchronized.
        // Performance: Operations like add, remove, and search take O(log n) time.
        // Allows null initially: However, if you try to add another null, it will throw an exception.

        // Syntax:
        // TreeSet<Integer> name = new TreeSet<Integer>();

        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        System.out.println(numbers);

        numbers.remove(10);
        System.out.println(numbers);

        boolean hasValueFive = numbers.contains(5);
        System.out.println(hasValueFive);

        // Since TreeSet implements NavigableSet, it provides some powerful navigation methods:

        // first(): Returns the first (lowest) element.
        // last(): Returns the last (highest) element.
        // ceiling(E e): Returns the least element that is greater than or equal to the given element.
        // floor(E e): Returns the greatest element that is less than or equal to the given element.
        // higher(E e): Returns the least element that is strictly greater than the given element.
        // lower(E e): Returns the greatest element that is strictly less than the given element.

        System.out.println(numbers.ceiling(7));  // Outputs: 15
        System.out.println(numbers.floor(7));   // Outputs: 5

        // You can define a custom ordering for the elements in the TreeSet by providing a comparator.
        // TreeSet<String> names = new TreeSet<String>(Comparator.reverseOrder());
    }
}
