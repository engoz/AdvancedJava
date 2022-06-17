package com.eng.collections.maps;

import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx3 {

    public static void main(String[] args) {

        Map<Integer, Integer> test = new ConcurrentHashMap<>();
        double initalSize = (1000000 / 0.75)+1;
        Map<Integer, Integer> test2 = new ConcurrentHashMap<>((int)initalSize);

        long startTimeOfString = new Date().getTime();
        for (int i = 0; i< 1_000_000; i++){
            test.put(i, new Random().nextInt());
        }
        System.out.println("Time taken by Map: " + (new Date().getTime() - startTimeOfString) + "ms");

        startTimeOfString = new Date().getTime();
        for (int i = 0; i< 1_000_000; i++){
            test2.put(i, new Random().nextInt());
        }
        System.out.println("Time taken by Map: " + (new Date().getTime() - startTimeOfString) + "ms");

    }



}
