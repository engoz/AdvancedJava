package com.eng.behavior.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enginoz on 4.12.2017.
 */
public class ArrayListTest {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("Engin");
        arr.add("Can");
        arr.add("Ozlem");


        List arr2 = getAnaBaba();
        arr.addAll(arr2);
        List arr3 = getKardes();
        arr.addAll(arr3);

        for (String a : arr) {
            System.out.println(a);
        }
    }


    private static List<String> getAnaBaba() {
        List<String> arr2 = new ArrayList<>();
        arr2.add("Remziye");
        arr2.add("Zeki");
        return arr2;
    }

    private static List<String> getKardes() {
        List<String> arr3 = new ArrayList<>();
        arr3.add("Nilgün");
        arr3.add("Nihal");
        return arr3;
    }
}
