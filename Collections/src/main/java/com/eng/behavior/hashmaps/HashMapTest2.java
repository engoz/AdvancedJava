package com.eng.behavior.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest2 {

    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Bilim", "12");
        m1.put("Sanat", "3");
        m1.put("Edebiyat", "5");
        m1.put("Siyaset", "9");
        m1.put(null, null);

        Map<Integer, Map> m2 = new HashMap();
        m2.put(1, m1);

        Map gMap = m2.get(1);
        gMap.put("Engin", "10");

        System.out.println();
        System.out.println(" Map Oğeleri:");
        System.out.print("\t" + m2.get(1));
    }

}
