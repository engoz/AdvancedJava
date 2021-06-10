package com.timur.bolum9.priortyqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by servicium on 30.12.2015.
 */
public class PriortyQueueDemo4 {

    public static void main(String[] args) {
        PriorityQueue<String> p = new PriorityQueue<String>();

        p.add("Engin");
        p.add("Can");
        p.add("Ozlem");
        p.add("Zeki");
        p.add("Remziye");


        Iterator it = p.iterator();
        while (it.hasNext())
            //Pool ile ambardan veri cekilir.
            System.out.println("Kuyrugun Basi " + it.next());

        System.out.println("Ambar Size " + p.size());
    }
}
