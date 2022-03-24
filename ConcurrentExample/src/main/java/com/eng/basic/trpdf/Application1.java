package com.eng.basic.trpdf;

public class Application1 {

    private int count = 0;


    public synchronized void increment(){
        count++;
    }

    public void doCount(){
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i=0; i<10000; i++){
                    count++;
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i=0; i<10000; i++){
                    count++;
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
        Application1 application = new Application1();
        application.doCount();
        application.yaz();
    }
}
