package com.timur.bolum6.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enginoz on 10/16/15.
 */
public class ArrayListToArray {

    public static void main(String[] args) {
        List a = new ArrayList();
        a.add("Paris");
        a.add("Londra");
        a.add("İstanbul");

        System.out.println("ArrayList" + a);

        Object[] arr = new String[5];

        arr = a.toArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
