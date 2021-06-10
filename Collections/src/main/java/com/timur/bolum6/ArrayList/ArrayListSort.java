package com.timur.bolum6.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by enginoz on 12/3/15.
 */
public class ArrayListSort {

    public static void main(String[] args) {
        List arrList = new ArrayList();
        arrList.add(10);
        arrList.add(20);
        arrList.add(40);
        arrList.add(4);
        arrList.add(11);
        arrList.add(13);
        arrList.add(44);
        arrList.add(21);

        Collections.sort(arrList);


        System.out.println(arrList);

    }
}
