package com.eng.threads;

/**
 * Created by servicium on 31.05.2016.
 */

class Robotum extends Thread {
    public Robotum(String isim) {
        super(isim);
    }

    public void run() {
        try {
            String isim = this.getName();
            for (int i = 0; i < 5; i++) {
                if (isim.equals("Robot1") && (i == 3)) {
                    System.out.println(isim + " ---> uyutuluyo");
                    Thread.sleep(100);
                } else if (isim.equals("Robot2") && (i == 2)) {
                    System.out.println(isim + " ---> uyutuluyo");
                    Thread.sleep(150);
                } else if (isim.equals("Robot3") && (i == 4)) {
                    System.out.println(isim + " ---> uyutuluyo");
                    Thread.sleep(250);
                }
                System.out.println(isim + "--->"+i);
            }

        } catch (InterruptedException ex) {

        }
    }
}

public class UyurGezer {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Robotum r1 = new Robotum("Robot1");
        Robotum r2 = new Robotum("Robot2");
        Robotum r3 = new Robotum("Robot3");

        r1.start();
        r2.start();
        r3.start();
    }
}
