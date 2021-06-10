package com.eng.behavior.queues.arrayblockingqueues3;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by enginoz on 18/02/17.
 */
public class Application {

    private static BlockingQueue queue = new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) throws InterruptedException {
        Thread producerThread = new Thread(() -> {
            produce();
        });

        Thread consumerThread = new Thread(() -> {
            consume();
        });

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }

    private static void produce() {
        Random random = new Random();
        while (true) {
            try {
                queue.put(random.nextInt(100));
            } catch (InterruptedException e) {
            }
        }
    }

    private static void consume() {
        while (true) {
            try {
                Thread.sleep(100);
                Integer value = (Integer) queue.take();
                System.out.println("Alınan: " + value + ", Kuyruğun boyutu: " + queue.size());
            } catch (InterruptedException e) {
            }
        }
    }

}
