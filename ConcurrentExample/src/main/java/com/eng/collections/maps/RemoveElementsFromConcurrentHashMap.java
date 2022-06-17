package com.eng.collections.maps;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RemoveElementsFromConcurrentHashMap {
    public static void main(String[] args)
    {
        // Creating ConcurrentHashMap
        Map<String, String> my_cmmap
                = new ConcurrentHashMap<String, String>();

        // Adding elements to the map
        // using put() method
        my_cmmap.put("1", "1");
        my_cmmap.put("2", "1");
        my_cmmap.put("3", "1");
        my_cmmap.put("4", "1");
        my_cmmap.put("5", "1");
        my_cmmap.put("6", "1");

        // Printing the map
        System.out.println("Map: " + my_cmmap);
        System.out.println();

        // Removing the mapping
        // with existing key 6
        // using remove() method
        String valueRemoved = my_cmmap.remove("6");

        // Printing the map after remove()
        System.out.println(
                "After removing mapping with key 6:");
        System.out.println("Map: " + my_cmmap);
        System.out.println("Value removed: "
                + valueRemoved);
        System.out.println();

        // Removing the mapping
        // with non-existing key 10
        // using remove() method
        valueRemoved = my_cmmap.remove("10");

        // Printing the map after remove()
        System.out.println(
                "After removing mapping with key 10:");
        System.out.println("Map: " + my_cmmap);
        System.out.println("Value removed: "
                + valueRemoved);
        System.out.println();

        // Now clear the map using clear()
        my_cmmap.clear();

        // Print the clea Map
        System.out.println("Map after use of clear(): "
                + my_cmmap);
    }
}
