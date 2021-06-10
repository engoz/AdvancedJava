package com.eng.behavior.collections;

/**
 * Created by servicium on 10.06.2015.
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

    public static void main(String[] args) {
        Collection torba = new ArrayList();

        String elemanbir = "elma";
        String elemaniki = "armut";

        torba.add(elemanbir);
        torba.add(elemaniki);

        Collection yedekTorba = new ArrayList();


        String elemanuc = "kiraz";
        String elemandort = "erik";

        yedekTorba.add(elemanuc);
        yedekTorba.add(elemandort);

        torba.addAll(yedekTorba);

        boolean sonucbir = torba.contains(elemaniki);
        System.out.println(elemaniki + " torbada varmı " + sonucbir);

        boolean sonuciki = torba.contains(yedekTorba);
        System.out.println("hepsi torbada varmi " + sonuciki);

        boolean sonucuc = torba.isEmpty();
        System.out.println("torba bosmu " + sonucuc);

        boolean silindimi = torba.remove(elemaniki);
        System.out.println(elemaniki + " silindimi " + silindimi);

        System.out.println("torbanin uzunlugu " + torba.size());

        //torbanin icerigini yaz
        Object[] dizi = torba.toArray();
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("---> " + dizi[i]);
        }

        //torbanin icierini yaz iki
        System.out.println(torba);

    }
}
