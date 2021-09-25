package com.eng.executer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by enginoz on 12/15/15.
 */
public class ExcutorParalelCounting {
    public static void main(String[] args) {
        Runnable[] counters = {new Counter(1,10),new Counter(11,20), new Counter(21,30),new Counter(31,40),new Counter(41,50)};
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        System.out.println("Start");
        for (Runnable counter:counters)
            executorService.execute(counter);


        executorService.shutdown();
            while (!executorService.isTerminated());
            System.out.println("Finished");


    }
}
