package com.eng.executer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by enginoz on 10/23/16.
 * submit(new Future)
 */
public class Executor3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future future = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Asynchronous Task Submit");
            }
        });

        try {
            System.out.println(future.get());   //returns null if the task has finished correctly.
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
