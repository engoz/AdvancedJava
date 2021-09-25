package com.eng.daemon;

/**
 * Created by servicium on 15.06.2016.
 */
public class DaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
