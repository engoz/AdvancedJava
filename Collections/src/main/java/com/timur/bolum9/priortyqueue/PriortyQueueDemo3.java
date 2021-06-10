package com.timur.bolum9.priortyqueue;

import java.util.PriorityQueue;

/**
 * Created by servicium on 30.12.2015.
 */
public class PriortyQueueDemo3 {
    public static void main(String[] args) {
        PriorityQueue<Double> p = new PriorityQueue<Double>();
        p.add(new Double(100));
        p.add(23.47);
        p.add(new Double(13));
        p.add(new Double(47));
        p.add(new Double(25));
        p.add(new Double(16));

        while (p.size() > 0)
            //Pool ile ambardan veri cekilir.
            System.out.println("Kuyrugun Basi " + p.poll());

        System.out.println("Ambar Size " + p.size());
    }
}
