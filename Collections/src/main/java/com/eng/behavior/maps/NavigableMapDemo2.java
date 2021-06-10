package com.eng.behavior.maps;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by servicium on 29.12.2016.
 */
public class NavigableMapDemo2 {
    public static void main(String[] args) {
        NavigableMap<String, Integer> map = new TreeMap<String, Integer>();

        map.put("X", 500);
        map.put("B", 600);
        map.put("A", 700);
        map.put("T", 800);
        map.put("Y", 900);
        map.put("Z", 200);

        NavigableSet navigableSet = map.descendingKeySet();
        System.out.println("Descending Navigable Set : " + navigableSet);

        NavigableMap navigableMap = map.descendingMap();
        System.out.println("Descending Navigable Map : " + navigableMap);

        //ilk önce sort edipkeyden öncekileri getirir.
        SortedMap sortedMap = map.headMap("T");
        System.out.println("headMap() return sorted map " + sortedMap);
        System.out.println("Orginal Map " + map);
    }
}
