package com.eng.behavior.hashmaps;

/**
 * Created by servicium on 10.06.2015.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapDemo4 {

    public static void main(String args[]) {
// Create a hash map
        HashMap hm = new HashMap();
// Put elements to the map
        hm.put("Deniz", new Double(83.34));
        hm.put("Melek", new Double(67.22));
        hm.put("Berna", new Double(78.00));
        hm.put("Cansu", new Double(99.22));
        hm.put("Gökhan", new Double(84.08));
// Get a set of the entries
        Set set = hm.entrySet();
// Get an iterator
        Iterator i = set.iterator();
// Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }
        System.out.println();
// Berna'nın notunu düzelt
        double puan = ((Double) hm.get("Berna")).doubleValue();
        hm.put("Berna", new Double(puan + 10.07));
        System.out.println("Berna'nın yeni puanı: " + hm.get("Berna"));
    }

}
