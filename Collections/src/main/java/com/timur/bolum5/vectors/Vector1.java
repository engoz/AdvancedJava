package com.timur.bolum5.vectors;

import java.util.Vector;

/**
 * Created by enginoz on 10/13/15.
 */
public class Vector1 {

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

        System.out.println("Ambarin uzunlugu " + v.size());
        System.out.println("Ambarin Sigasi " + v.capacity());

        //istemsiz donusum derleyeci int kendi Integer a donusturur.
        Vector<Integer> vint = new Vector<Integer>();
        vint.add(1);
        vint.add(2);
        vint.add(3);
        vint.add(4);
        vint.add(5);
        vint.add(4);


        System.out.println("Ambarin uzunlugu " + vint.size());
        System.out.println("Ambarin Sigasi " + vint.capacity());


        //Donusturulmus Dogrusu Bu
        vint.add(new Integer(9));
        vint.add(new Integer(5));
        vint.add(new Integer(4));
        vint.add(new Integer(3));
        vint.add(new Integer(2));
        vint.add(new Integer(1));

        System.out.println("Ambarin uzunlugu " + vint.size());
        System.out.println("Ambarin Sigasi " + vint.capacity());


    }
}
