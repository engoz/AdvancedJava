package com.eng.collections.queues;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueEx {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        Thread t1 = new Thread(()->{
            try {
                for (int i = 0; i<10; ++i)
                        queue.put("Merhaba - " +i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(()->{
            try {
                for (int i = 0; i<10; ++i)
                    queue.put("Merhaba - " +i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t3 = new Thread(()->{
            try {
                for (int i = 0; i<10; ++i) {
                    String take = queue.take();
                    System.out.println(" queue take " + i+ " -> " + take);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
        t3.start();


    }
}
