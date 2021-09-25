package com.eng.threads.common;

/**
 * Created by servicium on 06.06.2016.
 */
public class Tuketici extends Thread {
    private SerbestBolgeInf serbestBolge;
    public Tuketici(SerbestBolgeInf sb){
        this.serbestBolge=sb;
    }

    @Override
    public void run() {
        int deger=0;
        for (int i=0; i<10; i++){
            deger = serbestBolge.veriAl();
            System.out.println("Tuketici Alinan Veri" + deger);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
