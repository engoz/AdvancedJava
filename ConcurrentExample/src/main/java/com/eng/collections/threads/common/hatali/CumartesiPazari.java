package com.eng.collections.threads.common.hatali;

/**
 * Created by enginoz on 17/02/17.
 */

class Uretici1 extends Thread {
    private SerbestBolge1 sb;
    public Uretici1(SerbestBolge1 sb){
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            sb.veriKoy(i);
            System.out.println("Uretici - koyulan veri " + i);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Tuketici1 extends Thread{
    private SerbestBolge1 sb;
    public Tuketici1(SerbestBolge1 sb){
        this.sb = sb;
    }

    @Override
    public void run() {
        int deger = 0;
        for (int i=0; i<10; i++){
            deger = sb.verial();
            System.out.println("Tuketici - alinan veri " + deger);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class CumartesiPazari {



    public static void main(String[] args) {
        SerbestBolge1 serbestBolge1 = new SerbestBolge1();
        Uretici1 u = new Uretici1(serbestBolge1);
        Tuketici1 t = new Tuketici1(serbestBolge1);
        u.start();
        t.start();
    }
}
