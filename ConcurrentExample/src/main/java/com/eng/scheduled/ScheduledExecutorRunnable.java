package com.eng.scheduled;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorRunnable {

    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        task1();
        Runnable task2 = () -> System.out.println("Task2");
        ses.schedule(task2,5, TimeUnit.SECONDS);
        task3();
        ses.shutdown();

    }

    private static void task1() {
        System.out.println("Running Task1 ....");
    }

    private static void task3() {
        System.out.println("Running Task3 .....");
    }
}
