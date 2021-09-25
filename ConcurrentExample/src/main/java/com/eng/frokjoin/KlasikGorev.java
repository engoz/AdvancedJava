package com.eng.frokjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by servicium on 19.10.2016.
 */
public class KlasikGorev implements Runnable {

    static long toplam = 0;
    static int sayac = 0;
    static List<Thread> gorevler;

    public void run() {
        int uretilenSayi = new Random().nextInt(10) + 1;
        System.out.println(++sayac +" Uretilen Sayi " +uretilenSayi);
        toplam = toplam + (uretilenSayi);
    }

    public static void main(String[] args) throws InterruptedException {
        int kacGorev = 200_000;
        long baslamaZamani = System.currentTimeMillis();

        gorevler = new ArrayList<Thread>();
        Thread thr;

        for (int i=0; i<kacGorev; i++){
            thr = new Thread(new KlasikGorev());
            thr.setName("Is Parcacigi " + (i+1));
            thr.start();
            gorevler.add(thr);
            thr.join();
        }

        long bitisZamani = System.currentTimeMillis();

        System.out.println("Uretilen Sayilarin Toplami " +toplam);
        System.out.println((bitisZamani-baslamaZamani)  + " ms de tamamlandi " );
    }
}
