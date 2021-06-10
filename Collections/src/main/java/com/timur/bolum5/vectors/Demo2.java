package com.timur.bolum5.vectors;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by enginoz on 10/14/15.
 */
public class Demo2 {

    Vector<Integer> v = new Vector<Integer>();
    ArrayList<Integer> arr = new ArrayList<Integer>();

    Vector<Integer> vektorYarat(Vector w) {
        w.add(100);
        w.add(200);
        w.add(300);
        return w;
    }

    ArrayList arrayListYarat(ArrayList arr) {
        arr.add("400");
        arr.add("500");
        return arr;
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.vektorYarat(d.v);
        d.arrayListYarat(d.arr);
        d.v.addAll(d.arr);
        System.out.println("Vektorun OGeleri");
        for (int i = 0; i < d.v.size(); i++) {
            System.out.println(d.v.get(i) + " ");
        }
    }

}
