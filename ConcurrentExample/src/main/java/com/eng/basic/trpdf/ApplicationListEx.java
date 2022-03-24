package com.eng.basic.trpdf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ApplicationListEx {

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    public static void main(String[] args) {

        ApplicationListEx app = new ApplicationListEx();
        long startTime = System.currentTimeMillis();
        app.work();
        long endTime = System.currentTimeMillis();
        System.out.println("Gecen Zaman : " + (endTime-startTime) );
        System.out.println("List1 Size : " + app.list1.size() );
        System.out.println("List2 Size : " + app.list2.size() );
    }

    private void work() {
        Thread t1 = new Thread(()->{
            process();
        });
        Thread t2 = new Thread(()->{
            process();
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void process() {
        for (int i =0; i< 1000; i++) {
            addNewIntegerToList1();
            addNewIntegerToList2();
        }
    }

    private void addNewIntegerToList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(new Random().nextInt());
        }
    }

    private void addNewIntegerToList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(new Random().nextInt());
        }
    }
}
