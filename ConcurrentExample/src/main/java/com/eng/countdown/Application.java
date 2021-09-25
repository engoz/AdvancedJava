package com.eng.countdown;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by enginoz on 10/12/16.
 */
public class Application {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 3; i++) {
            executorService.submit(new Thread(new Processor(latch)));
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
        }

        System.out.println("Programi." + Thread.currentThread().getName());
        executorService.shutdown();
    }

}

class Processor implements Runnable {

    private CountDownLatch latch;

    public Processor(CountDownLatch latch) {
        this.latch = latch;
    }


    public void run() {
        System.out.println("Thread adı." + Thread.currentThread().getName() + "" + latch.getCount());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        latch.countDown();
    }

}
