package com.eng.collections.maps.skipList;

import java.util.concurrent.ConcurrentSkipListMap;

public class AddingMappingsExample {
    public static void main(String[] args)
    {

        // Initializing the map
        ConcurrentSkipListMap<Integer, Integer> cslm
                = new ConcurrentSkipListMap<Integer, Integer>();

        // Adding elements to this map
        for (int i = 1; i <= 9; i++)
            cslm.put(i, i);

        // put() operation on the map
        System.out.println("After put(): " + cslm);
    }
}
