package com.timur.bolum9.priortyqueue;

import java.util.PriorityQueue;

/**
 * Created by servicium on 29.12.2015.
 */
public class PriortyQueueDemo1 {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.add(100);
        p.add(new Double(23.47).intValue());
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
