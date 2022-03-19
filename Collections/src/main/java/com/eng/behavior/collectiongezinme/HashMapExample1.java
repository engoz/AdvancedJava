package com.eng.behavior.collectiongezinme;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args) {

        Map<String, BigDecimal> newMap = new HashMap<String, BigDecimal>();
        newMap.put("1", new BigDecimal(213.34));
        newMap.put("2", new BigDecimal(213.35));
        newMap.put("3", new BigDecimal(213.36));
        newMap.put("4", new BigDecimal(213.37));
        Set<Map.Entry<String, BigDecimal>> entries = newMap.entrySet();

        for (Iterator<Map.Entry<String, BigDecimal>> iterator = entries.iterator(); iterator.hasNext();) {
            //map gezerken remove edilemez önemli
            Map.Entry<String, BigDecimal> next = iterator.next();
            if (next.getKey() == "2") {
                newMap.remove(next.getKey() );
            }
            System.out.println(next.getKey() + " " + next.getValue());
        }

    }
}
