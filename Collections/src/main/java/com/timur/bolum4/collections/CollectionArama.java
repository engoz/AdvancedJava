package com.timur.bolum4.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by enginoz on 10/9/15.
 */
public class CollectionArama {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("Engin");
        list.add("Ozlem");
        list.add("Can");
        list.add("Zeki");
        list.add("Remziye");

        Boolean bool = list.contains("Engin");
        System.out.println(bool);

        int ndx = Collections.binarySearch(list, "Zeki");
        System.out.println(ndx);

        Integer i = list.lastIndexOf("Can");
        System.out.println(i);
    }
}
