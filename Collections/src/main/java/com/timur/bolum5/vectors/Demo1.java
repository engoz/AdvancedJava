package com.timur.bolum5.vectors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by enginoz on 10/14/15.
 */
public class Demo1 {


    ArrayList<String> arrayListYap() {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Istanbul");
        arrList.add("Izmir");
        arrList.add("Ankara");
        arrList.add("Istanbul");
        arrList.add("Istanbul");
        return arrList;
    }

    void arrayListYaz(ArrayList<String> arr) {
        System.out.println("Array List Ambarindaki ogeler");
        Iterator<String> iter = arr.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    void arrayListToVector(ArrayList<String> a) {
        Vector vector = new Vector(a);
        System.out.println("Vector Ambarindaki ogeler");
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement() + " ");
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        ArrayList<String> arr = demo1.arrayListYap();
        demo1.arrayListYaz(arr);
        demo1.arrayListToVector(arr);

    }


}
