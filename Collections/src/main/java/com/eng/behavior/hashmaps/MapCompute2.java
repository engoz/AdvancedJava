package com.eng.behavior.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class MapCompute2 {
    // Main method
    public static void main(String[] args) {

        // Create a Map and add some values
        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 12);
        map.put("Key2", 15);

        // print map details
        System.out.println("Map: " + map);

        // remap the values
        // using compute method
        map.compute("Key1", (key, val)
                -> (val == null)
                ? 1
                : val + 1);
        map.compute("Key2", (key, val)
                -> (val == null)
                ? 1
                : val + 5);

        // print new mapping
        System.out.println("New Map: " + map);
    }
}
