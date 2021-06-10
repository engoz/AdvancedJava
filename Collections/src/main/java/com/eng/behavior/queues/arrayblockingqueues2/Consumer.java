package com.eng.behavior.queues.arrayblockingqueues2;

import java.util.concurrent.BlockingQueue;

/**
 * Created by enginoz on 18/02/17.
 */
public class Consumer implements Runnable {

    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        // Koleksiyona eleman ekledikce koleksiyonun o anki eleman sayisi
        //ve kalan kapasitesini konsola yaziyoruz
        while (queue.remainingCapacity() > 0) {
            System.out.println("Queue boyutu: " + queue.size() + ", kalan kapasite: " + queue.remainingCapacity());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}