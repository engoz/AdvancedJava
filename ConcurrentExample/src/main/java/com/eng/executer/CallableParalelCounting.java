package com.eng.executer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by enginoz on 12/15/15.
 */
public class CallableParalelCounting {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableCounter[] counters = {new CallableCounter(1,10),new CallableCounter(11,20), new CallableCounter(21,30),new CallableCounter(31,40),new CallableCounter(41,50)};
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (CallableCounter callableCounter : counters){
            Future<Integer> future = executorService.submit(callableCounter);
            Integer result = future.get();
            System.out.println("Result " + result);
        }
        executorService.shutdown();
        while (!executorService.isTerminated());
        System.out.println("Finis");
    }

}
