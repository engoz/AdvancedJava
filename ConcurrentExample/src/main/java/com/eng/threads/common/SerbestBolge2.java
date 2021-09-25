package com.eng.threads.common;

/**
 * Created by servicium on 20.12.2016.
 */
public class SerbestBolge2 extends SerbestBolgeInf{

    private int veri;
    public synchronized int veriAl(){
        return veri;
    }
    public synchronized void veriKoy(int gelenVeri){
        this.veri = gelenVeri;
    }
}
