package com.eng.threads;

/**
 * Created by servicium on 31.05.2016.
 */
public class UyanmaVakti extends Thread {

    public void run(){
        try{
            while(true){
                System.out.println("Thread uyuyor");
                Thread.sleep(60*10); //uyyuyor
            }

        }catch(InterruptedException iEx){
            //bosver
            System.out.println("Interrupt edildi");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        UyanmaVakti uyku = new UyanmaVakti();
        uyku.start();
        uyku.interrupt();
    }

}
