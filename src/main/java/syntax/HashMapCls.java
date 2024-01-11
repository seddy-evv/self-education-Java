package syntax;

import java.util.HashMap;
import java.util.Map;

public class HashMapCls {
    public static void main(String[] args)
    {
        // Syntax:
        // Map<String, Integer> name = new HashMap<>();

        Map<String, Integer> map = new HashMap<String, Integer>();

        // Adding elements to HashMap:
        map.put("One", 1);
        map.put("Two", 2);

        // Retrieving a value by key:
        int value = map.get("One");  // value will be 1

        // Removing a value by key:
        map.remove("One");

        // Checking if a key exists:
        boolean hasKey = map.containsKey("Two");  // true

        // Iterating over a HashMap:
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            System.out.println(key + " => " + val);
        }


        // Important Methods of HashMap:
            // put(K key, V value): Inserts the specified value with the specified key.
            // get(Object key): Returns the value to which the specified key is mapped.
            // remove(Object key): Removes the mapping for a key.
            // containsKey(Object key): Checks if this map contains a mapping for the specified key.
            // size(): Returns the number of key-value mappings.
            // isEmpty(): Checks if the map is empty.
            // clear(): Removes all the mappings.
        // Differences Between HashMap and Hashtable:
            // Thread Safety: HashMap is not synchronized, whereas Hashtable is. This means Hashtable is thread-safe, but HashMap is faster.
            // Null keys/values: HashMap allows one null key and multiple null values, while Hashtable doesn’t allow any null key or value.
            // Superclass: HashMap extends AbstractMap class while Hashtable extends Dictionary class.
    }

}
