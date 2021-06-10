package com.eng.behavior.collectiongezinme;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by servicium on 19.02.2016.
 */
public class HashMapExample {
    public static void main(String[] args) {

        Map<String, BigDecimal> newMap = new HashMap<String, BigDecimal>();
        newMap.put("1", new BigDecimal(213.34));
        newMap.put("2", new BigDecimal(213.35));
        newMap.put("3", new BigDecimal(213.36));
        newMap.put("4", new BigDecimal(213.37));
        for (Map.Entry<String, BigDecimal> entry : newMap.entrySet()) {
            //map gezerken remove edilemez
            if (entry.getKey() == "2") {
                newMap.remove(entry.getKey());
            }
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
