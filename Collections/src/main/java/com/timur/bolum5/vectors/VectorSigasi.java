package com.timur.bolum5.vectors;

import java.util.Vector;

/**
 * Created by enginoz on 10/14/15.
 */
public class VectorSigasi {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(3, 2);
        System.out.println("Vector baslangic boyu " + v.size());
        System.out.println("Vectorun kapasitesi " + v.capacity());

        v.add(new Integer(1));
        v.add(new Integer(2));
        v.add(new Integer(3));

        System.out.println("Vector baslangic boyu " + v.size());
        System.out.println("Vectorun kapasitesi " + v.capacity());

        v.add(new Integer(4));

        System.out.println("Vector baslangic boyu " + v.size());
        System.out.println("Vectorun kapasitesi " + v.capacity());
    }
}
