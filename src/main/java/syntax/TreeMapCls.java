package syntax;

import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.util.Collection;

public class TreeMapCls {
    public static void main(String[] args) {
        // Features:
        // Stores key-value pairs in a sorted order based on the keys.
        // Allows rapid access to the entries.
        // Does not allow duplicate keys but can have duplicate values.
        // Allows only one null key (as long as a custom comparator isn't used).

        // Syntax:
        // TreeMap<String, String> name = new TreeMap<String, String>();

        TreeMap<String, String> treeMap = new TreeMap<String, String>();

        treeMap.put("key1", "value1");
        treeMap.put("key2", "value2");
        treeMap.put("key3", "value3");
        System.out.println(treeMap);

        String value = treeMap.get("key1");
        System.out.println(value);

        treeMap.remove("key2");

        boolean hasKey = treeMap.containsKey("key2");
        System.out.println(hasKey);

        int size = treeMap.size();

        // Advanced Features:
        // firstKey(): Returns the first (lowest) key.
        // lastKey(): Returns the last (highest) key.
        // higherKey(K key): Returns the next higher key than the given key.
        // lowerKey(K key): Returns the next lower key than the given key.

        // Retrieving all keys, values, or key-value pairs:
        Set<String> keys = treeMap.keySet();
        Collection<String> values = treeMap.values();
        Set<Map.Entry<String, String>> entries = treeMap.entrySet();
        System.out.println(keys);
        System.out.println(values);
        System.out.println(entries);

        // Comparison with Other Map Implementations:
        // TreeMap vs HashMap: While both store key-value pairs, TreeMap maintains order whereas HashMap does not.
        // HashMap generally offers better performance for insertion, deletion, and locate operations.
        // TreeMap vs LinkedHashMap: LinkedHashMap maintains the order of insertion, while TreeMap maintains a natural ordering or the order defined by a comparator.
    }
}
