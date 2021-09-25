package com.eng.executer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by enginoz on 10/23/16.
 */
public class Executor5 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Set<Callable<String>>  callables = new HashSet<>();
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task -1  " ;
            }
        });
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task -2  " ;
            }
        });
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task -3  " ;
            }
        });

        String result = executorService.invokeAny(callables);
        System.out.println("Result " + result);
        executorService.shutdown();
    }
}
