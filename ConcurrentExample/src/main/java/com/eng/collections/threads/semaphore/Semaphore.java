package com.eng.collections.threads.semaphore;

/**
 * Created by servicium on 23.12.2016.
 */
public class Semaphore {

    private int sayi;
    public Semaphore(int sayi){
        this.sayi = sayi;
    }

    public synchronized void eleGecir(){
        while (sayi == 0) {
            System.out.println("---> " + Thread.currentThread().getName() + " beklemede");
            try {
                wait();
            } catch (InterruptedException e) {
                //e.printStackTrace();
                //denemeye devam et
            }
        }
        System.out.println("---> " + Thread.currentThread().getName() + " baglantiyi aldi");
        sayi--;
    }

    public synchronized void birak(){
        System.out.println("---> "+Thread.currentThread().getName() +" birakti .....");
        sayi ++;
        notify();
    }

}
