package com.eng.realyimp;

/**
 * @author engin.oz
 */
public class Worker implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            doWork();
        }
    }

    private void doWork() {
        System.out.println("Merhaba");
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        new Thread(worker).start();
    }
}
