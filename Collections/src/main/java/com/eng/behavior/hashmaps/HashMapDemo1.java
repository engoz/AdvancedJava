package com.eng.behavior.hashmaps;

/**
 * Created by servicium on 10.06.2015.
 */

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo1 {

    public static void main(String[] args) {
        Map<Integer, Character> m = new HashMap<Integer, Character>();

        for (int i = 65; i < 90; i++) {
            m.put(i, (char) i);
        }

        //Map icinde key dondurme
        for (Map.Entry<Integer, Character> entry : m.entrySet()) {
            if (entry.getValue().equals('A')) {
                System.out.println(entry.getKey());
            }
        }
    }
}
