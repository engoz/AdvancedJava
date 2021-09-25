package com.eng.basic;

/**
 * Created by enginoz on 9/6/16.
 */
public class Ikinci implements Runnable {

    Islem birIslem;

    public Ikinci(Islem gelenIslem){
        birIslem = gelenIslem;
    }

    public void run() {
        while (birIslem.isTamamlandi()){

        }
    }
}
