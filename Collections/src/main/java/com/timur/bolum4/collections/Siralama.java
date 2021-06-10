package com.timur.bolum4.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by enginoz on 10/8/15.
 */
public class Siralama {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();

        arrList.add("B");
        arrList.add("E");
        arrList.add("A");
        arrList.add("F");
        arrList.add("G");
        arrList.add("Y");
        arrList.add("Z");
        arrList.add("A");

        System.out.println("Siralanmamis Liste");
        System.out.println(arrList);

        Collections.sort(arrList);

        System.out.println("Siralanmis Liste");
        System.out.println(arrList);

        Comparator tersSirala = Collections.reverseOrder();

        Collections.sort(arrList, tersSirala);
        System.out.println("Ters Siralanmis Liste");
        System.out.println(arrList);

    }
}
