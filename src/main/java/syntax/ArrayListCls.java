package syntax;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCls {
    public static void main(String[] args)
    {

        // Syntax:
        List<String> list = new ArrayList<String>();
        List<Integer> numbers = new ArrayList<Integer>();

        // Immutable Lists using List.of()
        // List<String> immutableList = List.of("Apple", "Banana", "Cherry");

        // Diamond syntax (Java 7+):
        //List<Integer> numbers = new ArrayList<>();

        // Adding elements:
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        numbers.add(5);
        numbers.add(10);

        // Accessing elements:
        String fruitEl = list.get(0);
        int number = numbers.get(1);

        // Modifying elements:
        list.set(1, "Cherry");  // Replaces the element at index 1 with "Cherry"

        // Removing elements:
        list.remove(0);

        // Finding the size:
        int size = list.size();

        // Important Methods:
        // add(E element): Adds an element to the end of the list.
        // add(int index, E element): Inserts an element at the specified position.
        // remove(int index): Removes the element at the specified position.
        // set(int index, E element): Replaces the element at the specified position with the specified element.
        // get(int index): Returns the element at the specified position.
        // size(): Returns the number of elements in the list.
        // clear(): Removes all elements from the list.
        // contains(Object o): Checks if the list contains the specified element.
        // indexOf(Object o): Returns the index of the first occurrence of the specified element, or -1 if the list doesn't contain it.

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String fruit : list) {
            System.out.println(fruit);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }


    }
}
