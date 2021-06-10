package com.timur.bolum4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enginoz on 10/8/15.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(new Integer(35));
        arrList.add(new Integer(17));
        arrList.add(new Integer(21));

        System.out.println(arrList);
    }
}
