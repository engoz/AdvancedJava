package com.eng.collections.queues.linked2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueTest {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

        Thread producer = new Thread(new Producer(queue));

        Thread consumer = new Thread(new Consumer(queue));

        producer.start();

        consumer.start();

    }
}
