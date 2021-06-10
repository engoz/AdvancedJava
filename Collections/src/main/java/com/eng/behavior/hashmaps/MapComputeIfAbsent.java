package com.eng.behavior.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class MapComputeIfAbsent {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        nameMap.put("Engin", 100);
        Integer value = nameMap.computeIfAbsent("Engin", s -> s.length());
        System.out.println(value);
    }
}
