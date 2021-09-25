package com.eng.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by enginoz on 10/23/16.
 * submit(new Runable)
 */
public class Executor2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Asynchronous Task Submit");
            }
        });
        executorService.shutdown();
    }
}
