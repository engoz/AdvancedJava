package com.eng.concurrents;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by servicium on 14.01.2016.
 */

public class Largest {

    public static void main(String[] args) {
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        myMap.put(1, 5);
        myMap.put(2, 20);
        myMap.put(3, 10);
        myMap.put(4, 15);
        myMap.put(5, 20);

        System.out.println(myMap);

        Map<Integer, Integer> concurrentMap = new ConcurrentHashMap<Integer, Integer>(myMap);

        Integer maxKey = concurrentMap.keySet().iterator().next();
        Integer max = myMap.get(maxKey);

        for(Integer key : concurrentMap.keySet()){
            Integer currValue = concurrentMap.get(key);
            if(max > currValue){
                concurrentMap.remove(key);
            } else if(max < currValue) {
                concurrentMap.remove(maxKey);
                max = concurrentMap.get(key);
                maxKey = key;
            }
        }

        System.out.println(concurrentMap);
    }

}
