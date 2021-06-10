package com.timur.bolum5.vectors;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by enginoz on 10/15/15.
 */
public class VectorToArray {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("A");
        v.add("B");
        v.add("V");
        v.add("F");
        v.add("C");
        v.add("A");
        v.add("A");

        System.out.println("kopylamadan onceki vektor ogelerir" + v);
        ArrayList<String> arr = new ArrayList<String>(v);
        System.out.println("Kopyalandiktan sonra vektor ambarindaki ogeler" + v);
        System.out.println("Kopyalandiktan sonra Array ambarindaki ogeler" + arr);

    }
}
