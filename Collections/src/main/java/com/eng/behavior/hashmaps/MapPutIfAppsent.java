package com.eng.behavior.hashmaps;

import java.util.concurrent.ConcurrentHashMap;

public class MapPutIfAppsent {

    public static void main(String[] args) {
        methot1();
        methot2();
    }

    public static void methot1() {
        ConcurrentHashMap<Integer, String> chm =
                new ConcurrentHashMap<Integer, String>();

        chm.put(100, "Geeks");
        chm.put(101, "for");
        chm.put(102, "Geeks");
        chm.put(103, "Gfg");
        chm.put(104, "GFG");

        // Displaying the HashMap
        System.out.println("Initial Mappings are: "
                + chm);

        // Inserting non-existing key along with value
        String returned_value = (String) chm.putIfAbsent(108, "All");

        // Verifying the returned value
        System.out.println("Returned value is: "
                + returned_value);

        // Displayin the new map
        System.out.println("New mappings are: "
                + chm);

        String returned_value2 = (String) chm.putIfAbsent(108, "ME");

        System.out.println("Returned value is: "
                + returned_value2);

        System.out.println("New mappings are: "
                + chm);

    }

    public static void methot2() {
        ConcurrentHashMap<Integer, String> chm =
                new ConcurrentHashMap<Integer, String>();

        chm.put(100, "Geeks");
        chm.put(101, "for");
        chm.put(102, "Geeks");
        chm.put(103, "Gfg");
        chm.put(104, "GFG");

        // Displaying the HashMap
        System.out.println("Initial Mappings are: "
                + chm);

        // Inserting existing key along with value
        String returned_value = (String) chm.putIfAbsent(100, "All");

        // Verifying the returned value
        System.out.println("Returned value is: "
                + returned_value);

        // Displayin the new map
        System.out.println("New mappings are: "
                + chm);
    }
}
