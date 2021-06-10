package com.eng.behavior.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class MapCompute3 {

    // Main method
    public static void main(String[] args) {

        // create a Map and add some values
        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 12);
        map.put("Key2", 15);

        // print map details
        System.out.println("Map: " + map);

        try {

            // remap the values using compute() method
            // passing null value will throw exception
            map.compute(null, (key, value)
                    -> value + 3);
            System.out.println("New Map: " + map);
        } catch (NullPointerException e) {

            System.out.println("Exception: " + e);
        }
    }
}
