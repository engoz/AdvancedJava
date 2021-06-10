package com.timur.bolum6.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by enginoz on 10/16/15.
 */
public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] oyun = {"Kupa", "Sinek", "Karo", "Maca"};

        //Array to ArrayList
        List<String> arrList = Arrays.asList(oyun);

        System.out.println("listenin ogeleri");
        for (String s : arrList) {
            System.out.println(s);
        }

        ArrayList arrayList = new ArrayList();
        arrayList.addAll(arrList);
        System.out.println(arrayList);
    }
}
