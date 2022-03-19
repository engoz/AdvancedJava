package com.eng.behavior.collectiongezinme;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample3 {
    public static void main(String[] args) {
        Map<Integer, Character> m = new HashMap<Integer, Character>();

        for (int i = 65; i < 90; i++) {
            m.put(i, (char) i);
        }

        Set<Integer> kSet = m.keySet();

        Iterator<Integer> sayac = kSet.iterator();
        while (sayac.hasNext()) {
            Integer anahtar = sayac.next();
            //map gezerken remove edilemez önemli
            m.remove(anahtar);
            System.out.println(anahtar + "-" + m.get(anahtar));
        }
    }
}
