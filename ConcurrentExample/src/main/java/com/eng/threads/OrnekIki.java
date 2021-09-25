package com.eng.threads;

/**
 * Created by servicium on 31.05.2016.
 */

class Robot extends Thread {
    public Robot(String isim){
        super(isim);
    }

    @Override
    public void run() {
        try{
            for (int i=0; i<5; i++){
                System.out.println("Oncelik "+ this.getPriority() +" - "+ this.getName());
            }

        }catch (Exception ex){
            System.out.println("Hata Olustu" + ex);
        }
    }
}


public class OrnekIki {
    public static void main(String[] args) {
        Robot r1 =  new Robot("A");
        Robot r2 =  new Robot("B");
        Robot r3 =  new Robot("C");
        Robot r4 =  new Robot("D");
        r1.setPriority(Thread.MIN_PRIORITY);
        r2.setPriority(Thread.NORM_PRIORITY);
        r3.setPriority(Thread.MAX_PRIORITY);
        r4.setPriority(Thread.MAX_PRIORITY-2);

        r1.start();
        r2.start();
        r3.start();
        r4.start();
    }

}
