package com.eng.behavior.queues.arrayblockingqueues;

import java.util.concurrent.BlockingQueue;

/**
 * Created by enginoz on 17/02/17.
 */
public class Producer implements Runnable {

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }


    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                queue.put(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
