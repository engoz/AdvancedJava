package com.eng.basic;

/**
 * Created by servicium on 12.10.2016.
 */
public class Application {

    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public void doCount(){
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i=0; i<10000; i++){
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i=0; i<10000; i++){
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch ( InterruptedException e ) {
        }

    }

    public void yaz(){
        System.out.println("sayaç : " + count);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.doCount();
        application.yaz();
    }
}
