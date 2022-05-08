package com.eng.behavior.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class MapComputeIfAbsent {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        nameMap.put("Engin", 100);
        Integer value = nameMap.computeIfAbsent("Engin", s -> s.length());
        Integer value2 = nameMap.computeIfAbsent("Can", s -> s.length());

        System.out.println("ComputeIfApsent with present value " + value);
        System.out.println("ComputeIfApsent with apsent value " + value2);

        Integer value3 = nameMap.computeIfAbsent("Can", s -> s.length()+100);
        System.out.println("ComputeIfApsent with apsent value " + value3);

        Integer mer = nameMap.putIfAbsent("put", 50);
        System.out.println("PutIfApsent with apsent value " + mer);
        System.out.println("PutIfApsent get " + nameMap.get("put"));

        Integer mer2 = nameMap.putIfAbsent("put", 100);
        System.out.println("PutIfApsent with present value " + mer2);
        System.out.println("PutIfApsent get " + nameMap.get("put"));
    }
}
