package syntax;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetCls {
    public static void main(String[] args)
    {
        // Syntax:
        // Set<String> name = new HashSet<>();

        // Create a new HashSet
        Set<String> fruits = new HashSet<String>();

        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");  // This won't be added again

        // Display the HashSet
        System.out.println("Fruits: " + fruits);

        // Check if an element exists
        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterate over a HashSet
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        // Immutable HashSet example:
        Set<String> originalSet = new HashSet<String>();
        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add("Cherry");

        // Creating an unmodifiable set
        Set<String> unmodifiableSet = Collections.unmodifiableSet(originalSet);
        // Creating Immutable Sets with Set.of() (JDK 9+)
        // Set<String> immutableSet = Set.of("Apple", "Banana", "Cherry");

        // This line will throw UnsupportedOperationException
        // unmodifiableSet.add("Dragonfruit");

        // Usefull Info:
        // HashSet and Mutable Elements:
            // If mutable objects are used as elements in a HashSet and their values are modified after insertion,
            // it can produce unexpected results since the hashcode will change.
            // Example: If an object of a class with mutable fields is placed in a HashSet, and later one of its fields
            // (that affects hashcode) is modified, this object might be lost in the set because the hashcode is used to determine where it is stored.
        // Using Immutable Elements:
            // Ensuring that elements are immutable prevents issues related to changes in the hashcode of stored objects
            // and provides more predictable behavior.
            // Example: Common immutable objects like String or Integer are often used as elements in a HashSet to prevent such issues.
    }
}
