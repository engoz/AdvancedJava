package com.eng.behavior.queues.delay;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DelaxQueueEx2 {

    public static void main(String[] args)
            throws InterruptedException
    {

        // create object of DelayQueue
        // using DelayQueue() constructor
        BlockingQueue<DelayObject> DQ
                = new DelayQueue<DelayObject>();

        // Add numbers to end of DelayQueue
        // using add() method

        ExecutorService executerService = Executors.newSingleThreadExecutor();
        executerService.execute(new Runnable() {
            @Override
            public void run() {

               for (int i=0; i<2; i++) {

                   DQ.add(new DelayObject("A " + i , 10000));
                   DQ.add(new DelayObject("B " +i, 2));
                   DQ.add(new DelayObject("C "+i, 3));
                   DQ.add(new DelayObject("D "+i, 4));

                   System.out.println("Sleep Before DelayQueue: "
                           + DQ);
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }

                   System.out.println("Sleep After DelayQueue: "
                           + DQ);

               }
                // print queue

            }
        });

        executerService.shutdown();


    }
}
