package com.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
//https://jenkov.com/tutorials/java-util-concurrent/blockingqueue.html
//                	Throws Exception	Special Value	Blocks	Times Out
//          Insert	add(o)	            offer(o)	    put(o)	offer(o, timeout, timeunit)
//          Remove	remove(o)	        poll()	        take()	poll(timeout, timeunit)
//          Examine	element()	        peek()

class Consumer implements Runnable{

    protected BlockingQueue queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer implements Runnable{

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
            Thread.sleep(1000);
            queue.put("4");
            System.out.println("Queue Size : " + queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class BlockingQueueExample {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue queue = new ArrayBlockingQueue(3);

        Producer producer = new Producer(queue);



        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(4000);
    }
}
