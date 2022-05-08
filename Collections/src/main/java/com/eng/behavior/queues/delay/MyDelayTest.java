package com.eng.behavior.queues.delay;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class MyDelayTest {
    public static void main(String[] args) {
        // delay of 2 seconds
        final long delay = 2000;
        BlockingQueue<MyDelay> delayQueue = new DelayQueue<MyDelay>();

        // Producer thread
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    Random random = new Random();
                    int i = random.nextInt(1000);
                    // putting elements in delay queue
                    try {
                        delayQueue.put(new MyDelay("item" + i, delay));
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Error while putting values in the Queue " + e.getMessage());
                    }

                }
            }
        }.start();

        // Consumer thread
        new Thread() {
            @Override
            public void run() {

                while (true) {
                    // retrieving elements from delay queue
                    try {
                        System.out.println("Size = " +delayQueue.size() +" Consumer Consumed - " + delayQueue.take());
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Error while retrieving value from the Queue " + e.getMessage());
                    }
                }
            }

        }.start();
    }
}
