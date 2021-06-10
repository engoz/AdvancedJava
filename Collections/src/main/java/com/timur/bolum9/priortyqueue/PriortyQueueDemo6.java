package com.timur.bolum9.priortyqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by servicium on 30.12.2015.
 */
public class PriortyQueueDemo6 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(20, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                int result = o1 % 2 - o2 % 2;
                if (result == 0)
                    result = o1 - o2;
                return result;
            }
        });

        for (int i = 0; i < 20; i++) {
            pq.offer(20 - i);
        }

        for (int i = 0; i < 20; i++) {
            System.out.print("\t" + pq.poll());
        }


    }
}
