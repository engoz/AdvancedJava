package com.eng.concurrents;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

/**
 * Created by servicium on 31.05.2016.
 */
public class DelayQueueExample {
    public static void main(String[] args) {
        DelayQueue queue = new DelayQueue();
        Delayed element = new DelayedElement();
        queue.add(element);
        try {
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
