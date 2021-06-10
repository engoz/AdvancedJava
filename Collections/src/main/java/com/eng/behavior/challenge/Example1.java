package com.eng.behavior.challenge;

import com.timur.bolum6.ArrayList.ArrayToHashSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by enginoz on 1/25/16.
 */
public class Example1 {

    public static void main(String[] args) {

        String[] s = {"kagit", "kalem", "araba", "araba", "kalem"};

        System.out.println(getOnlyOne(s));

    }


    // {"kagit", "kalem", "araba", "araba", "kalem"}
    public static String getOnlyOne(String[] list) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : list) {
            if (map.containsKey(s)) {
                Integer value = map.get(s);
                map.put(s, value + 1);
            } else {
                map.put(s, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

}
