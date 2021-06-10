package com.timur.bolum7.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by servicium on 28.12.2015.
 */
public class LinkedList02 {

    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("Engin Öz");
        list.add("Özlem Öz");
        list.add("Uras Can ÖZ");
        Iterator iterator = list.iterator();
        for (int i = 0; i < 3; i++) {
            System.out.println(iterator.next());
        }
    }
}
