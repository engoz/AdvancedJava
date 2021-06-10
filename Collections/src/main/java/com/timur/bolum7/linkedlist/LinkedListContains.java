package com.timur.bolum7.linkedlist;

import java.util.LinkedList;

/**
 * Created by servicium on 28.12.2015.
 */
public class LinkedListContains {

    public static void main(String[] args) {
        LinkedList liste = new LinkedList();
        liste.addFirst("Londra");
        liste.addFirst("Moskova");
        liste.addFirst("Ankara");
        liste.addFirst("Paris");
        liste.addFirst("Viyana");
        System.out.println(liste);
        liste.removeLast();
        liste.removeLast();
        System.out.println(liste);

        System.out.println("liste = " + liste);

        liste.add(2, "Tahran");
        liste.addLast("Bağdat");
        System.out.println("liste = " + liste);
        System.out.println("ilk öğe = " + liste.getFirst());
        System.out.println("son öğe = " + liste.getLast());

        System.out.println("var mı? = " + liste.contains("Kahire"));
        liste.clear();
        System.out.println("liste = " + liste);
    }
}
