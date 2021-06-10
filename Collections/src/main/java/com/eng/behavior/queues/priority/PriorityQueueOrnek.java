package com.eng.behavior.queues.priority;

/**
 * Created by enginoz on 18/02/17.
 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueOrnek {

    static class PQSiralama implements Comparator<Integer> {
        //Integer turunden iki nesnenin karsilastirma mantigini tanimlayalim
        public int compare(Integer one, Integer two) {
            return two - one;
        }
    }

    public static void main(String[] args) {
        int[] rakamlar = {1, 10, 5, 3, 4, 7, 6, 9, 8};
        PriorityQueue<Integer> birinciListe = new PriorityQueue<Integer>();

        // offer() metodu ile birinci listeye eleman eklemeye calisalim
        for (int rakam : rakamlar) {
            birinciListe.offer(rakam);
        }

        System.out.println("birinci liste : " + birinciListe);

        PQSiralama pqs = new PQSiralama();
        PriorityQueue<Integer> ikinciListe = new PriorityQueue<Integer>(10, pqs);
        //Comparator sinifi yazmak yerine Collections.reverseOrder() metodunu da
        //kullanabilirdik bu ornegimizde
        for (int rakam : rakamlar) {
            ikinciListe.offer(rakam);
        }

        System.out.println("ikinci liste : " + ikinciListe);

        // queue eleman sayisini konsola yaz
        System.out.println("ikinci liste eleman sayisi: " + ikinciListe.size());
        // queue icerisindeki en yuksek oncelikli elemani listeden cikarmadan don
        System.out.println("ikinci liste gozlemlenen eleman : " + ikinciListe.peek());
        // queue eleman sayisini konsola yaz
        System.out.println("ikinci liste eleman sayisi : " + ikinciListe.size());
        // en yuksek oncelikli elemani don ve listeden cikar
        System.out.println("ikinci listeden cikarilan: " + ikinciListe.poll());
        // queue eleman sayisini konsola yaz
        System.out.println("ikinci listedeki eleman sayisi: " + ikinciListe.size());

        System.out.print("ikinci liste elemanlar : " + ikinciListe);

    }

}
