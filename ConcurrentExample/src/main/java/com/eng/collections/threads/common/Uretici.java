package com.eng.collections.threads.common;

/**
 * Created by servicium on 06.06.2016.
 */
public class Uretici extends Thread{
    private SerbestBolgeInf serbestBolge;
    public Uretici(SerbestBolgeInf sb){
        this.serbestBolge=sb;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            serbestBolge.veriKoy(i);
            System.out.println("Üretici Koyulan Veri -> " + i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
