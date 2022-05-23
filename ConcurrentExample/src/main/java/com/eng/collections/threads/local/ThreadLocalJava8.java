package com.eng.collections.threads.local;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Created by enginoz on 12.07.2018.
 */
public class ThreadLocalJava8 {
    private static final AtomicInteger transactionId = new AtomicInteger(10000);
    private static final ThreadLocal threadLocal = ThreadLocal.withInitial(() -> transactionId.getAndIncrement());

    public static void main(String[] args) {

        // Thread 1 executing and getting same Transaction Id for all iteration
        new Thread(() -> IntStream.range(0, 3).forEach(val -> {
            System.out.println(Thread.currentThread().getName() + " > " + threadLocal.get());
        })).start();

        // Thread 2 executing and getting same Transaction Id for all iteration
        new Thread(() -> IntStream.range(0, 3).forEach(val -> {
            System.out.println(Thread.currentThread().getName() + " > " + threadLocal.get());
        })).start();
        // Thread 3 executing and getting same Transaction Id for all iteration
        new Thread(new Runnable() {
            @Override
            public void run() {
                IntStream.range(0, 3).forEach(val -> {
                    System.out.println(Thread.currentThread().getName() + " > " + threadLocal.get());
                });
            }
        }).start();

    }
}
