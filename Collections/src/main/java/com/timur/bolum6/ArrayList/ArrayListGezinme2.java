package com.timur.bolum6.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enginoz on 12/3/15.
 */
public class ArrayListGezinme2 {

    public static void main(String[] args) {
        List a = new ArrayList();
        for (int i = 0; i < 5; i++) {
            a.add(10 * i);
        }

        Object[] arr = a.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---------------");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
