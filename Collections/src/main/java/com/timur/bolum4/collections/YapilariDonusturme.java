package com.timur.bolum4.collections;

import java.util.*;

/**
 * Created by enginoz on 10/9/15.
 */
public class YapilariDonusturme {

    public static void main(String[] args) {
        List<String> dizin = new LinkedList<String>();

        dizin.add("E");
        dizin.add("R");
        dizin.add("D");
        dizin.add("K");
        dizin.add("F");
        dizin.add("E");
        dizin.add("Z");
        dizin.add("E");
        dizin.add("Y");
        dizin.add("A");


        System.out.println(dizin);
        Enumeration e = Collections.enumeration(dizin);
        System.out.println(e);
        ArrayList<String> list = Collections.list(e);
        System.out.println(list.get(2));

        Collections.fill(dizin, "Java");
        System.out.println(dizin);
    }
}
