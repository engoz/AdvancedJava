package com.eng.collections.maps;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class ConcurrentHashMapPerformance {
    public static void main(String[] args) {

        double initalSize = (2000000 / 0.75)+1;
        Map<String, Map> map = new ConcurrentHashMap<>((int)initalSize);
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i = 0; i< 1_000_000; i++){
            list1.add("Link1"+i);
            list2.add("Link2"+i);
        }

        long startTimeOfString = new Date().getTime();
        StringBuilder builder = new StringBuilder(30);
        for (String s1 : list1){
            for (String s2:list2){
                builder.append(s1);
                builder.append("/");
                builder.append(s2);
                map.put(builder.toString(), new ConcurrentHashMap());

            }
        }
        System.out.println("Time taken by Map: " + (new Date().getTime() - startTimeOfString) + "ms");

        startTimeOfString = new Date().getTime();
        StringBuilder builder2 = new StringBuilder(30);


        for (String s1 : list1){
            for (String s2:list2){
                builder2.append(s1);
                builder2.append("/");
                builder2.append(s2);
                map.put(builder2.toString(), new ConcurrentHashMap());
                builder.delete(0,builder.length());
            }
        }
        System.out.println("Time taken by Map: " + (new Date().getTime() - startTimeOfString) + "ms");
    }
}
