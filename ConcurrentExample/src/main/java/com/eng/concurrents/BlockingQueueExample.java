package com.eng.concurrents;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by servicium on 31.05.2016.
 */
public class BlockingQueueExample {

    public static void main(String[] args) throws Exception {

        BlockingQueue queue = new ArrayBlockingQueue(1024);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(4000);
    }
}

class Producer implements Runnable{

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.offer("1",1, TimeUnit.SECONDS);
            queue.offer("2",1, TimeUnit.SECONDS);
            queue.offer("3",1, TimeUnit.SECONDS);
            queue.offer("4",1, TimeUnit.SECONDS);
            queue.offer("5",1, TimeUnit.SECONDS);
            queue.offer("6",1, TimeUnit.SECONDS);

            /*
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
            */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable{

    protected BlockingQueue queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i=0; i<queue.size(); i++){
                System.out.println(queue.take());
            }
            /*
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}