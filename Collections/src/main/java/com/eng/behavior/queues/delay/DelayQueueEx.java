package com.eng.behavior.queues.delay;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueEx {

    public static void main(String[] args)
            throws InterruptedException
    {

        // create object of DelayQueue
        // using DelayQueue() constructor
        BlockingQueue<DelayObject> DQ
                = new DelayQueue<DelayObject>();

        // Add numbers to end of DelayQueue
        // using add() method
        DQ.add(new DelayObject("A", 1));
        DQ.add(new DelayObject("B", 2));
        DQ.add(new DelayObject("C", 3));
        DQ.add(new DelayObject("D", 4));

        // print queue
        System.out.println("DelayQueue: "
                + DQ);

        // print the head using peek() method
        System.out.println("Head of DelayQueue: "
                + DQ.peek());

        // print the size using size() method
        System.out.println("Size of DelayQueue: "
                + DQ.size());

        // remove the head using poll() method
        System.out.println("Head of DelayQueue: "
                + DQ.poll());

        // print the size using size() method
        System.out.println("Size of DelayQueue: "
                + DQ.size());

        // clear the DelayQueue using clear() method
        DQ.clear();
        System.out.println("Size of DelayQueue"
                + " after clear: "
                + DQ.size());
    }

}



