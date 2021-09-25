package com.eng.countdown;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Java program to demonstrate How to use CountDownLatch in Java. CountDownLatch is
 * useful if you want to start main processing thread once its dependency is completed
 * as illustrated in this CountDownLatch Example
 *
 * @author Javin Paul
 */
public class CountDownLatchDemo2 {

    public static void main(String args[]) {
        final CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Thread(new Service2("CacheService", 10000, latch)));
        executorService.submit(new Thread(new Service2("AlertService", 1000, latch)));
        executorService.submit(new Thread(new Service2("ValidationService", 1000, latch)));
        executorService.shutdown();


        // application should not start processing any thread until all service is up
        // and ready to do there job.
        // Countdown latch is idle choice here, main thread will start with count 3
        // and wait until count reaches zero. each thread once up and read will do
        // a count down. this will ensure that main thread is not started processing
        // until all services is up.

        //count is 3 since we have 3 Threads (Services)

        try{
            latch.await();  //main thread is waiting on CountDownLatch to finish
            System.out.println("All services are up, Application is starting now");
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }

    }



}
/**
 * Service class which will be executed by Thread using CountDownLatch synchronizer.
 */
class Service2 implements Runnable{
    private final String name;
    private final int timeToStart;
    private final CountDownLatch latch;

    public Service2(String name, int timeToStart, CountDownLatch latch){
        this.name = name;
        this.timeToStart = timeToStart;
        this.latch = latch;
    }

    public void run() {
        try {
            System.out.println( name + " is Starting");
            Thread.sleep(timeToStart);
        } catch (InterruptedException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println( name + " is Down");
        latch.countDown(); //reduce count of CountDownLatch by 1
    }

}