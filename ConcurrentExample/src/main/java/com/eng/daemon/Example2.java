package com.eng.daemon;

/**
 * Created by servicium on 15.06.2016.
 */
public class Example2 {
    public static void main(String[] args) {
        Thread daemon = new DaemonThread();
        daemon.setDaemon(true);
        Thread normal = new NormalThread();

        daemon.start();
        normal.start();
    }
}
