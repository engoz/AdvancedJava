package com.eng.behavior.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class MapComputeIfAbsent {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        nameMap.put("Engin", 100);
        Integer value = nameMap.computeIfAbsent("Engin", s -> s.length());
        Integer value2 = nameMap.computeIfAbsent("Can", s -> s.length());
        Integer mer = nameMap.putIfAbsent("put", 50);
        Integer mer2 = nameMap.putIfAbsent("put", 100);
        System.out.println(value);
        System.out.println(value2);
        System.out.println("Put If Apsent " + mer);
        System.out.println("Put If Apsent " + nameMap.get("put"));
        System.out.println("Put If Apsent " + mer2);
    }
}
