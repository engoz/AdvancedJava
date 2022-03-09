package com.eng.collections;

import java.util.HashMap;
import java.util.Map;

public class ComputeAppSent {
    public static void main(String[] args) {
        Map<String, Integer> stringLength = new HashMap<>();
        Integer john = stringLength.computeIfAbsent("John", s -> s.length()+ 5);
        System.out.println(john);
        System.out.println(stringLength);
    }
}
