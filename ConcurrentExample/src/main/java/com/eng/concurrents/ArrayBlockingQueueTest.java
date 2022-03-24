package com.eng.concurrents;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by servicium on 30.05.2016.
 */
public class ArrayBlockingQueueTest {
    private static BlockingQueue<String> bq = new ArrayBlockingQueue<String>(1);

    class PutThread1 implements Runnable {

        public void run() {
            try {
                int i = 0;
                while (true) {
                    bq.put("A" + i);
                    System.out.println("Producer 1 has put: A" + i);
                    i++;
               //     Thread.sleep(1000);
                }
            } catch (final Exception e) {
                e.printStackTrace();
            }

        }
    }

    class PutThread2 implements Runnable {

        public void run() {
            try {
                int i = 0;
                while (true) {
                    bq.put("A" + i);
                    System.out.println("Producer 2 has put: A" + i);
                    i++;
                 //   Thread.sleep(1000);
                }
            } catch (final Exception e) {
                e.printStackTrace();
            }

        }
    }

    class TakeThread implements Runnable {

        public void run() {
            try {
                while (true) {
                    final String data = bq.poll();
                    System.out.println("Consumer has consumed.." + data);
                }
            } catch (final Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(final String... args) {
        final Thread pt = new Thread(new ArrayBlockingQueueTest().new PutThread1());
        pt.start();

        final Thread pt2 = new Thread(new ArrayBlockingQueueTest().new PutThread2());
        pt2.start();

        final Thread tt = new Thread(new ArrayBlockingQueueTest().new TakeThread());
        tt.start();
    }
}
