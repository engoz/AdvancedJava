package com.eng.collections;

/**
 * Created by enginoz on 04/03/17.
 */
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] argv) throws Exception {
        int capacity = 10;
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(capacity);

        int numWorkers = 2;
        Worker[] workers = new Worker[numWorkers];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker(queue,i);
            workers[i].start();
        }

        for (int i = 0; i < 100; i++) {
            queue.put(i);
        }


    }
}

class Worker extends Thread {
    int id;
    BlockingQueue<Integer> q;

    Worker(BlockingQueue<Integer> q, int id) {
        this.q = q;
        this.id=id;
    }

    public void run() {
        try {
            while (true) {
                Integer x = q.take();
                if (x == null) {
                    break;
                }
                System.out.println(this.id +" - " +x);
            }
        } catch (InterruptedException e) {
        }
    }
}
