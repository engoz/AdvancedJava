package com.timur.bolum9.priortyqueue;

import java.util.PriorityQueue;

/**
 * Created by servicium on 30.12.2015.
 */
public class PriortyQueueDemo5 {
    PriorityQueue<String> stringQueue;

    public static void main(String[] args) {
        PriortyQueueDemo5 pq = new PriortyQueueDemo5();
        pq.stringQueue = new PriorityQueue<String>();

        pq.stringQueue.add("Engin");
        pq.stringQueue.add("Can");
        pq.stringQueue.add("Ozlem");
        pq.stringQueue.add("Zeki");
        pq.stringQueue.add("Remziye");

        while (pq.stringQueue.size() > 0)
            System.out.println(pq.stringQueue.remove());

        System.out.println(pq.stringQueue.size());
    }
}
