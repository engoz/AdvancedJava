package com.timur.bolum4.collections;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by enginoz on 10/9/15.
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("E");
        linkedList.add("R");
        linkedList.add("M");
        linkedList.add("E");
        linkedList.add("K");
        linkedList.add("k");
        linkedList.add("A");
        linkedList.add("a");
        linkedList.add("c");
        linkedList.add("C");

        System.out.println("Siralanmamis Liste");
        System.out.println(linkedList);


        System.out.println("Siralanmis Liste");
        Collections.sort(linkedList);
        System.out.println(linkedList);

        System.out.println("TersSiralanmis Liste");
        Collections.reverse(linkedList);
        System.out.println(linkedList);


        System.out.println("Karistirilmis Liste");
        Collections.shuffle(linkedList);
        System.out.println(linkedList);


        System.out.println("Swap Liste");
        Collections.swap(linkedList, 1, 6);
        System.out.println(linkedList);

    }
}
