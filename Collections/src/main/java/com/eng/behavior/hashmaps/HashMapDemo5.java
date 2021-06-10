package com.eng.behavior.hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by servicium on 24.03.2016.
 */
public class HashMapDemo5 {

    public static void main(String args[]) {
// Create a hash map
        HashMap hm = new HashMap();
// Put elements to the map
        hm.put(1, "Deniz");
        hm.put(2, "Melek");
        hm.put(3, "Berna");
        hm.put(1, "Cansu");
        hm.put(2, "Gökhan");
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

    }
}
