package com.timur.bolum4.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by enginoz on 10/9/15.
 */
public class DegismezKume {

    public static void main(String[] args) {
        Set s = new TreeSet();
        s.add(new Integer(10));
        s.add(new Integer(20));
        s.add(new Integer(40));
        s.add(new Integer(20));
        s.add(new Integer(40));
        s.add(new Integer(50));


        Iterator iterator = s.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        Set set = Collections.unmodifiableSet(s);
        set.add(new Integer(90));
        System.out.println(set);
    }
}
