package com.timur.bolum5.vectors;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Created by enginoz on 10/13/15.
 */
public class VectorErisim {

    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        System.out.println("Ambarin uzunlugu " + v.size());
        System.out.println("Ambarin Sigasi " + v.capacity());

        v.add("istanbul");
        v.add("Düzce");
        v.add("Muğla");
        v.add("Marmaris");
        v.add("Göcek");
        v.add("Bodrum");

        System.out.println("ilk eleman " + v.firstElement());
        System.out.println("istenilen indis " + v.elementAt(2));
        System.out.println("Son Element " + v.lastElement());

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

        ListIterator listIterator = v.listIterator();
        while (listIterator.hasNext())
            System.out.println(listIterator.next());


        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

    }

}
