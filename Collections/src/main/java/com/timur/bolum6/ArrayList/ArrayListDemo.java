package com.timur.bolum6.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enginoz on 10/15/15.
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        List a = new ArrayList();
        a.add("A");
        a.add("B");
        a.add("V");
        a.add("D");
        a.add("E");
        a.add("A");
        System.out.println("a = " + a);
        a.add(3, "Engin");
        System.out.println("a = " + a);
        a.set(4, "Can");
        System.out.println("a = " + a);

        //copy
        List b = new ArrayList();
        b.addAll(a);
        b.add("OZ");
        System.out.println("b =" + b);

    }
}
