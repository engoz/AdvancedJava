package com.eng.daemon;

/**
 * Created by servicium on 15.06.2016.
 */
public class Example1 {
    public static void main(String[] args) {
        Thread daemon = new DaemonThread();
        Thread normal = new NormalThread();

        daemon.start();
        normal.start();
    }
}
