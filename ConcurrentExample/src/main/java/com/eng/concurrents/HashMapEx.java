package com.eng.concurrents;

/**
 * Created by servicium on 10.06.2015.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class HashMapEx {

    public static void main(String[] args) {

        //ConcurrentHashMap
        Map<String,String> myMap = new ConcurrentHashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");
        myMap.put("4", "4");
        myMap.put("5", "5");
        myMap.put("6", "6");
        System.out.println("ConcurrentHashMap before iterator: "+myMap);
        Iterator<String> it = myMap.keySet().iterator();

        while(it.hasNext()){
            String key = it.next();
            if(key.equals("3")) myMap.put(key+"new", "new3");
        }
        System.out.println("ConcurrentHashMap after iterator: "+myMap);

        //Map icinde key dondurme
        for (Map.Entry<String,String> entry:myMap.entrySet()){
            if (entry.getValue().equals("4")){
                System.out.println(entry.getKey());
            }
        }

        //HashMap
        /**
         * HashMap içersindeki modCount volatile eklersen sorun çözülür
         * The number of times this HashMap has been structurally modified
         * Structural modifications are those that change the number of mappings in
         * the HashMap or otherwise modify its internal structure (e.g.,
         * rehash).  This field is used to make iterators on Collection-views of
         * the HashMap fail-fast.  (See ConcurrentModificationException).

         transient volatile int modCount;
         */


        myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("HashMap before iterator: "+myMap);
        Iterator<String> it1 = myMap.keySet().iterator();

        while(it1.hasNext()){
            String key = it1.next();
            if(key.equals("3")) myMap.put(key+"new", "new3");
        }
        System.out.println("HashMap after iterator: "+myMap);


    }

}
