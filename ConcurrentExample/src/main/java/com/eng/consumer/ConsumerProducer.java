package com.eng.consumer;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by enginoz on 16/02/17.
 */
public class ConsumerProducer {

    private static final Queue QUEUE = new LinkedList();
    private static final Runnable NUMBER_PRODUCER = new Runnable() {
        private final Random random = new SecureRandom();

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                synchronized (QUEUE) {
                    QUEUE.add(random.nextInt());
                    QUEUE.notify();
                }
            }
            synchronized (QUEUE) {
                THREAD_NUMBER_CONSUMER.interrupt();
            }
            System.out.println("Producer done!");
        }
    };
    private static final Runnable NUMBER_CONSUMER = new Runnable() {

        @Override
        public void run() {
            while (true) {
                int i;
                synchronized (QUEUE) {
                    if (QUEUE.isEmpty()) {
                        if (Thread.currentThread().isInterrupted())
                            break;
                        try {
                            QUEUE.wait();
                        } catch (InterruptedException e) {
                            System.out.println("Interrupted!");
                        }
                        continue;
                    } else {
                        i = (int) QUEUE.poll();
                    }
                }
                // Do something with the i value
                System.out.println(i);
            }
            System.out.println("Consumer done!");
        }
    };
    private static final Thread THREAD_NUMBER_PRODUCER = new Thread(
            NUMBER_PRODUCER, "Number Producer");
    private static final Thread THREAD_NUMBER_CONSUMER = new Thread(
            NUMBER_CONSUMER, "Number Consumer");

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting...");
        THREAD_NUMBER_CONSUMER.start();
        THREAD_NUMBER_PRODUCER.start();
        THREAD_NUMBER_CONSUMER.join();
        THREAD_NUMBER_PRODUCER.join();
        System.out.println("Done.");
    }
}
