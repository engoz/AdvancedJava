package com.eng.concurrents;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by servicium on 14.01.2016.
 */
public class MapFiltering {

    public static void main(String[] args) {
        Random rnd = new Random();
        Map<String, Integer> myMap = new HashMap<>();
        int i = 1;
        for (int j = 0; j < 10; j++) {
            myMap.put("k" + j, rnd.nextInt(100));
        }
        System.out.println("BEFORE");
        printMap(myMap);
        filterMap(myMap);
        System.out.println("AFTER");
        printMap(myMap);
    }

    private static void printMap(Map<String, Integer> map) {
        map.entrySet().stream().forEach((e) -> {
            System.out.println("K=" + e.getKey() + " V=" + e.getValue());
        });
    }

    private static void filterMap(Map<String, Integer> map) {
        Map.Entry<String, Integer> get
                = map.entrySet()
                .stream()
                .max((Comparator<? super Map.Entry<String, Integer>>) new Comparator<Map.Entry<String, Integer>>() {

                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                }).get();
        map.clear();
        map.put(get.getKey(), get.getValue());
    }
}