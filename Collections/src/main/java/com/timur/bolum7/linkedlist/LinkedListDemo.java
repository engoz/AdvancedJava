package com.timur.bolum7.linkedlist;

import java.util.LinkedList;

/**
 * Created by servicium on 28.12.2015.
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Portakal");
        list.add("Limon");
        list.add("Mandalina");
        list.add("Turunç");
        list.add("Muz");
        list.add("Elma");
        System.out.println("Liste =" + list);

        list.add(3, "Grayfut");
        System.out.println("Liste =" + list);
        System.out.println("ilk öge =" + list.getFirst());
        System.out.println("son öge =" + list.getLast());

        System.out.println("Silinen ilk=" + list.removeFirst());
        System.out.println("Silinen son" + list.removeLast());
        System.out.println("Liste =" + list);
    }
}
