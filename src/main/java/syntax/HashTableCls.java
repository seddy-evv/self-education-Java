package syntax;

import java.util.Enumeration;
import java.util.Hashtable;


//Features of Hashtable:

// Any non-null object can be used as a key or as a value.
// It is similar to HashMap, but is synchronized.
// Hashtable stores key/value pair in hash table.
// In Hashtable we specify an object that is used as a key, and the value we want to associate to that key.
// The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
// The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
// HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.
// In conclusion, while the Hashtable class still exists in Java and can still be used, it’s generally recommended
// to use the Map interface or one of its implementations instead.
public class HashTableCls {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding elements to the hashtable
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);

        // Getting values from the hashtable
        int valueA = hashtable.get("A");
        System.out.println("Value of A: " + valueA);

        // Removing elements from the hashtable
        hashtable.remove("B");

        // Enumerating the elements of the hashtable
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }
}