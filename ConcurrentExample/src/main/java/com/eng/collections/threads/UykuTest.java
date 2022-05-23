package com.eng.collections.threads;

/**
 * Created by servicium on 31.05.2016.
 */
public class UykuTest  extends Thread {

    public void run(){
        try{
            for(;;){
                System.out.println("Thread uyuyor");
                Thread.sleep(60*10); //uyyuyor
            }
        }catch(InterruptedException iEx){
            //bosver
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        UykuTest uyku = new UykuTest();
        uyku.start();
    }

}