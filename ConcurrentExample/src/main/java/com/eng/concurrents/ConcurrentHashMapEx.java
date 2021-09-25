package com.eng.concurrents;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by servicium on 27.04.2016.
 */
public class ConcurrentHashMapEx {
    private static final ConcurrentMap<Integer, String> tmuSpreads = new ConcurrentHashMap<Integer, String>();

    public static void main(String[] args) {
           tmuSpreads.put(1, "Can");
           tmuSpreads.put(2, "Engin");
           tmuSpreads.put(3, "Ozlem");


        for (Map.Entry<Integer,String> entry:tmuSpreads.entrySet()){
                 if (entry.getValue().equals("Ozlem")){
                     System.out.println(entry.getKey());
                 }
        }

        for (Map.Entry<Integer,String> entry:tmuSpreads.entrySet()){
            if (entry.getKey() == 1){
                entry.setValue("Engin");
            }
        }

        for (Map.Entry<Integer,String> entry:tmuSpreads.entrySet()){
            System.out.println(entry.getValue());
        }



        tmuSpreads.put(1, "Can");


        for (Map.Entry<Integer,String> entry:tmuSpreads.entrySet()){
            System.out.println(entry.getValue());
        }


    }
}
