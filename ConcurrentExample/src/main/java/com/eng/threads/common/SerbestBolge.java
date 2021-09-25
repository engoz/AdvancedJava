package com.eng.threads.common;

/**
 * Created by servicium on 06.06.2016.
 */
public class SerbestBolge extends SerbestBolgeInf{

    private int veri;
    private boolean mevcut = false;
    public synchronized int veriAl(){
        while (!mevcut){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        mevcut = false;
        notifyAll();
        return veri;
    }
    public synchronized void veriKoy(int gelenVeri){
        while (mevcut){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        mevcut = true;
        this.veri = gelenVeri;
        notifyAll();
    }
}
