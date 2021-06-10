package com.timur.bolum4.collections;

import java.util.*;

/**
 * Created by enginoz on 10/9/15.
 */
public class CollectionCoypExample {

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        List<Integer> list3 = new Vector<Integer>();
        List<Integer> list4 = new ArrayList<Integer>();


        list1.add(20);
        list1.add(30);
        list1.add(40);


        list2.add(50);
        list2.add(60);
        list2.add(70);


        list3.add(120);
        list3.add(130);
        list3.add(140);


        list4.add(250);
        list4.add(260);
        list4.add(270);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println("Copy");
        Collections.copy(list2, list1);

        System.out.println(list1);
        System.out.println(list2);


        System.out.println(list3);
        System.out.println(list4);

        Collections.copy(list4, list3);

        System.out.println("Copy");
        System.out.println(list3);
        System.out.println(list4);

    }
}
