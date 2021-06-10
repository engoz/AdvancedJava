package com.timur.bolum5.vectors;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by enginoz on 10/13/15.
 */
public class VectorTipDemo {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<Object>();
        int primitiveType = 100;
        Integer wrapperType = new Integer(200);
        String str = "Baskent Ankara";

        vector.add(primitiveType);
        vector.add(wrapperType);
        vector.add(str);
        vector.add(2, new Integer(200));

        System.out.println("Vektorun ogeleri " + vector);
        System.out.println("Vektorun uzunlugu " + vector.size());
        System.out.println("Vektorun iki numaralai elemani " + vector.elementAt(2));
        System.out.println("Vektorun ilk elemani " + vector.firstElement());
        System.out.println("Vektorun son elemani " + vector.lastElement());
        vector.removeElementAt(2);
        System.out.println("Vektorun ogeleri " + vector);
        Enumeration e = vector.elements();
        while (e.hasMoreElements()) {
            System.out.println("Vektorun ogeleri " + e.nextElement());
        }


    }
}
