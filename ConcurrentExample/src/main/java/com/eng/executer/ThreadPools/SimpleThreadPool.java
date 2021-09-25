package com.eng.executer.ThreadPools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by enginoz on 10/23/16.
 */
public class SimpleThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0; i<10; i++){
            Worker worker = new Worker(" Worker "+i);
            executorService.execute(worker);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){}
            System.out.println("finished all threads");
    }

}
