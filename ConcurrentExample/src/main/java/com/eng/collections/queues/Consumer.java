package com.eng.collections.queues;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by enginoz on 17/02/17.
 */
public class Consumer implements Runnable {

    protected BlockingQueue queue = null;

    public Consumer(BlockingQueue queue){
        this.queue = queue;
    }

    public void run() {
        for (int i= 0; i<queue.size(); i++){
            try {
                System.out.println(queue.poll(1, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
