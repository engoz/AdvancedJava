package com.eng.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by enginoz on 10/23/16.
 * execute(Runnable)
 */
public class Executor1 {

    public static void main(String[] args) {
        ExecutorService executerService = Executors.newSingleThreadExecutor();
        executerService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Asynchronous Task");
            }
        });

        executerService.shutdown();
    }
}
