package com.timur.bolum5.vectors;

import java.util.Arrays;
import java.util.Vector;

/**
 * Created by enginoz on 10/14/15.
 */
public class ArrayToVector {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        Vector<Integer> v = new Vector<Integer>(Arrays.asList(arr));
        System.out.println(v);
    }
}
