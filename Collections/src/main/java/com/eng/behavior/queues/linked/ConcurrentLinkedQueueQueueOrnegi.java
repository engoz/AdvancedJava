package com.eng.behavior.queues.linked;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by enginoz on 18/02/17.
 */
public class ConcurrentLinkedQueueQueueOrnegi {

    public static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();

        Thread producer = new Thread(new Producer(queue));
        producer.start();

        Thread consumer = new Thread(new Consumer(queue));
        consumer.start();
    }
}
