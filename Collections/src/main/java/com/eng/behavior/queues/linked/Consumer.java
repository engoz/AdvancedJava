package com.eng.behavior.queues.linked;

/**
 * Created by enginoz on 18/02/17.
 */

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;


public class Consumer implements Runnable {

    private ConcurrentLinkedQueue queue;

    public Consumer(ConcurrentLinkedQueue queue) {
        this.queue = queue;
    }

    public void run() {
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println("ConcurrentLinkedQueue okunan eleman : " + iterator.next());
        }
    }
}
