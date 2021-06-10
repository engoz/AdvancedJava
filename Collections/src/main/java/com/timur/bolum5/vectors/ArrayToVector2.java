package com.timur.bolum5.vectors;

import java.util.Arrays;
import java.util.Vector;

/**
 * Created by enginoz on 10/15/15.
 */
public class ArrayToVector2 {

    public static void main(String[] args) {
        String[] arr = {"E", "A", "C", "D", "E", "F", "G"};
        Vector<String[]> v = new Vector<String[]>();
        v.add(arr);
        System.out.println(v);
    }
}
