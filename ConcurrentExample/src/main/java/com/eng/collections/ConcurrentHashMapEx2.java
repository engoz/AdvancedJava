package com.eng.collections;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx2 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> myMap = new ConcurrentHashMap<>();
        Map<String, Integer> test = new ConcurrentHashMap<>();
        test.put("A",1);
        test.put("B",2);
        test.put("C",3);
        myMap.put("A", test);

        Map<String, Integer> testMap = myMap.get("A");
        testMap.put("D",4);

        Set<Map.Entry<String, Map<String, Integer>>> entries = myMap.entrySet();
        for (Map.Entry mapping : entries) {

            System.out.printf("Key : %s, Value: %s %n", mapping.getKey(), mapping.getValue());

        }

    }
}
