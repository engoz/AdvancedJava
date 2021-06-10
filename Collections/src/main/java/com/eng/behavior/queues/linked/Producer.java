package com.eng.behavior.queues.linked;

/**
 * Created by enginoz on 18/02/17.
 */

import java.util.concurrent.ConcurrentLinkedQueue;

public class Producer implements Runnable {

    private ConcurrentLinkedQueue queue;

    public Producer(ConcurrentLinkedQueue queue) {
        this.queue = queue;
    }

    public void run() {

        for (int i = 0; i < 5; i++) {
            queue.add(i);
            System.out.println("ConcurrentLinkedQueue eklenen eleman : " + i);
        }
    }
}
