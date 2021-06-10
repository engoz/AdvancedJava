package com.timur.bolum4.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by enginoz on 10/9/15.
 */
public class TreeSetErisim {

    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<Integer>();
        s.add(new Integer(20));
        s.add(new Integer(50));
        s.add(new Integer(30));
        s.add(new Integer(40));
        s.add(new Integer(70));
        s.add(new Integer(90));
        s.add(new Integer(20));
        s.add(new Integer(20));

        Iterator i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Boolean bool = s.contains(40);
        System.out.println(bool);
    }
}
