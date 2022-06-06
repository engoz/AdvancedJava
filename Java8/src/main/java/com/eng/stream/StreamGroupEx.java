package com.eng.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupEx {
    public static void main(String[] args) {
        checkDuplicateOccurance();
    }

    public static void checkDuplicateOccurance() {
        List<String> duplicateList = new ArrayList<String>();
        duplicateList.add("Cat");
        duplicateList.add("Dog");
        duplicateList.add("Cat");
        duplicateList.add("cow");
        duplicateList.add("Cow");
        duplicateList.add("Goat");
        Map<String, Long> couterMap = duplicateList.stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
        System.out.println(couterMap);
    }
}
