package com.eng.basic;

/**
 * Created by enginoz on 9/6/16.
 */
public class DenemeThread {

    public DenemeThread(){

    }

    public static void main(String[] args) {
        Islem mevcutIslem = new Islem();

        Thread t1 = new Thread(new Birinci(mevcutIslem));
        t1.start();

    }

}
