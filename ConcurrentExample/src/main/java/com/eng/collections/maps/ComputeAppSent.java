package com.eng.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class ComputeAppSent {
    public static void main(String[] args) {
        Map<String, Integer> stringLength = new HashMap<>();
        stringLength.put("John",3);
        Integer john = stringLength.computeIfAbsent("John", s -> s.length()+ 5);
        System.out.println(john);
        System.out.println(stringLength);
    }
}
