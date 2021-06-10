package com.timur.bolum6.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enginoz on 12/3/15.
 */
public class Demo {

    public static void main(String[] args) {
        List arrList = new ArrayList();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        arrList.add("D");
        arrList.add("E");
        arrList.add("F");

        System.out.println(arrList);
        arrList.add(3, "ENG");

        System.out.println(arrList);
        arrList.set(4, "OZ");
        System.out.println(arrList);
    }

}
