package com.eng.basic;

/**
 * Created by servicium on 12.10.2016.
 */
public class Processor extends Thread {

    private volatile boolean running = true;

    //not use
    // private  boolean running = true;

    public void shutdown(){
        this.running = false;
        System.out.println("ShutDown calisti ");
    }

    @Override
    public void run() {
        while (running){
            System.out.println("Thread Calisiyor");
        }
    }

    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        processor.shutdown();
    }
}
