package com.timur.bolum6.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by enginoz on 12/3/15.
 */
public class ArrayListGezinme {

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

        Enumeration enumeration = Collections.enumeration(a);
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
