package com.timur.bolum4.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by enginoz on 10/8/15.
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        Set<Integer> arrList = new TreeSet<Integer>();
        arrList.add(new Integer(35));
        arrList.add(new Integer(17));
        arrList.add(new Integer(21));

        System.out.println(arrList);
    }

}
