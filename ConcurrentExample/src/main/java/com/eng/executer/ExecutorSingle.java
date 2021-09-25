package com.eng.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by enginoz on 10/23/16.
 * submit(new Runable)
 */
public class ExecutorSingle {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Gorev1());
        executorService.submit(new Gorev2());
        executorService.shutdown();
    }
}

class Gorev1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Start Gorev 1");
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End Gorev 1");
    }
}

class Gorev2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Start Gorev 2");
        try {
            Thread.sleep(1000);
            System.out.println("End Gorev 2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}