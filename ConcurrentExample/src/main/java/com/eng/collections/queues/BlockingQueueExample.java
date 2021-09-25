package com.eng.collections.queues;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by enginoz on 17/02/17.

 Throws Exception 	Special Value 	Blocks 	Times Out
 Insert 	add(o) 	    offer(o) 	put(o) 	offer(o, timeout, timeunit)
 Remove 	remove(o) 	poll() 	    take() 	poll(timeout, timeunit)
 Examine 	element() 	peek()

 */
public class BlockingQueueExample {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue queue =  new ArrayBlockingQueue(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(10000);

    }

}
