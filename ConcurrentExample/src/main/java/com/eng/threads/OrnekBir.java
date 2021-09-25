package com.eng.threads;

/**
 * Created by servicium on 30.05.2016.
 */
public class OrnekBir {
    public static void main(String[] args) {
        Isci isci1 = new Isci();
        Isci isci2 = new Isci();

        isci1.start();
        isci2.start();

    }
}

class Isci extends Thread {
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println(this.getName() +"--> "+ i);
            try {
                sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
