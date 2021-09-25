package com.eng.countdown;

import java.util.concurrent.CountDownLatch;

/**
 * Created by servicium on 29.06.2016.
 */
public class IncDecTest {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        Waiter      waiter      = new Waiter(latch);
        Decrementer decrementer = new Decrementer(latch);

        new Thread(waiter).start();
        new Thread(decrementer).start();

        try {

            Thread.sleep(10000);
            System.out.println("Main Sleep -10000");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Waiter implements Runnable{

    CountDownLatch latch = null;

    public Waiter(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Waiter Released");
    }
}

class Decrementer implements Runnable {

    CountDownLatch latch = null;

    public Decrementer(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {

        try {
            System.out.println("1 -Sleap 1000");
            Thread.sleep(1000);
            this.latch.countDown();
            System.out.println("2 -Sleap 1000");
            Thread.sleep(1000);
            this.latch.countDown();
            System.out.println("3 -Sleap 1000");
            Thread.sleep(1000);
            this.latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}