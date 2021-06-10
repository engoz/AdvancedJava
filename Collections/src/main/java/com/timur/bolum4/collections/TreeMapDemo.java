package com.timur.bolum4.collections;

import java.util.TreeMap;

/**
 * Created by enginoz on 10/8/15.
 */
public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(312, "Ankara");
        treeMap.put(212, "Istanbul");
        treeMap.put(380, "Düzce");

        System.out.println(treeMap);
    }
}
