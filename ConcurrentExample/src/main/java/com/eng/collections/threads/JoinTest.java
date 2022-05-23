package com.eng.collections.threads;

/**
 * Created by servicium on 31.05.2016.
 */

class Robot777 extends Thread {
    private Robot337 robot337;

    public Robot777(String isim, Robot337 robot337){
        super(isim);
        this.robot337 = robot337;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.getName() +" beklemeye basliyor");
            robot337.join(); //Robot337 bitene kadar bekle
           // robot337.join(150); //Robot337 yi 150 ms bekle
           // robot337.join(150, 90); //Robot337 yi 150 ms, 90 ns bekle
            for (int i=0; i<5; i++){
                System.out.println(this.getName() + "<->" + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Robot337 extends Thread {
        public Robot337(String isim){
            super(isim);
        }

    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println(this.getName() + "<->" + i);
        }
    }
}

public class JoinTest {

    public static void main(String[] args) {
        Robot337 r337 = new Robot337("Robot 337");
        Robot777 r777 = new Robot777("Robot 775",r337);
        r337.start();
        r777.start();
    }

}
