package com.timur.bolum9.priortyqueue;

import java.util.PriorityQueue;

/**
 * Created by servicium on 30.12.2015.
 */
public class PriortyQueueDemo2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        p.add(100);
        p.add(23);
        p.add(13);
        p.add(47);
        p.add(25);
        p.add(16);

        while (p.size() > 0)
            //Pool ile ambardan veri cekilir.
            System.out.println("Kuyrugun Basi " + p.poll());

        System.out.println("Ambar Size " + p.size());
    }
}
