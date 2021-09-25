package com.eng.frokjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.RecursiveTask;

/**
 * Created by servicium on 19.10.2016.
 */
public class ToplamaGorevi extends RecursiveTask<Long> {

    private long gorevSayisi;
    private static Random sayiUretici = new Random();
    static long toplam = 0;
    static int sayac = 0;
    static int altSayac = 0;

    public ToplamaGorevi(long gorevSayisi){
        this.gorevSayisi = gorevSayisi;
    }

    @Override
    protected Long compute() {

        if (gorevSayisi <= 10){
            long araToplam = 0;
            for (int i=0; i<gorevSayisi; i++){
                araToplam =+ this.sayiUret();
            }
            System.out.println((++altSayac) +" ->> Ara toplam : " +araToplam);
            return araToplam;
        }

        List<RecursiveTask<Long>> tumAltGorevler = new ArrayList<RecursiveTask<Long>>();

        for (int i=0; i<this.gorevSayisi; i++){
            ToplamaGorevi altToplmaGorevi = new ToplamaGorevi(10);
            altToplmaGorevi.fork();
            tumAltGorevler.add(altToplmaGorevi);
        }

        for(RecursiveTask<Long> toplananGorevler : tumAltGorevler ){
            toplam = toplam + toplananGorevler.join();
        }

        return toplam;
    }

    private long sayiUret() {
        long uretilenSayi = (long) sayiUretici.nextInt(10)+1;
        System.out.println((++sayac) + " Uretilen sayi " + uretilenSayi );
        return uretilenSayi;
    }
}
