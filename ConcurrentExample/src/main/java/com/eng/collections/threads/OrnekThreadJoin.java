package com.eng.collections.threads;

/**
 * Created by servicium on 30.05.2016.
 */
public class OrnekThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Isci2 isci1 = new Isci2();
        Isci2 isci2 = new Isci2();

        isci1.start();
        isci2.start();

        isci1.join();
        isci2.join();

    }
}

class Isci2 extends Thread {
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println(this.getName() +"--> "+ i);
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
