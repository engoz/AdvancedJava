package com.eng.basic.trpdf;

import com.eng.basic.Processor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuterExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i =0; i<=5; i++){
            executorService.submit(new MyProcessor(i));
        }

        executorService.shutdown();

        System.out.println("Tüm Görevler eklendi ");

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tüm Görevler tamamlandi ");
    }
}
