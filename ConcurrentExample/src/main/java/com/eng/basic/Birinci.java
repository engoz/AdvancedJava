package com.eng.basic;

/**
 * Created by enginoz on 9/6/16.
 */
public class Birinci implements Runnable {

    Islem birinciIslem;

    public Birinci(Islem gelenIslem){
    birinciIslem = gelenIslem;
    }

    public void run() {
        System.out.println(birinciIslem.getSonuc());
    }
}
