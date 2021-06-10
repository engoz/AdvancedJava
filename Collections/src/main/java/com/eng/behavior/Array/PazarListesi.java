package com.eng.behavior.Array;

/**
 * Created by enginoz on 10/9/16.
 */
public class PazarListesi {

    final String[] liste;
    int elemanSayisi;
    int sinir;

    public PazarListesi(int sinir) {
        liste = new String[sinir];
        elemanSayisi = 0;
        this.sinir = sinir;
    }

    public void listeyeEkle(String eklenecekOlan) {
        if (elemanSayisi < sinir) {
            liste[elemanSayisi] = eklenecekOlan;
            elemanSayisi++;
        } else {
            System.out.println("Bos Yer Kalmadi");
        }
    }

    public void sondanSil() {
        if (elemanSayisi > 0) {
            elemanSayisi--;
            liste[elemanSayisi] = "";
        } else {
            System.out.println("liste boş");
        }
    }

    public void bastanSil() {
        for (int i = 0; i < elemanSayisi - 1; i++) {
            liste[i] = liste[i + 1];
        }
        elemanSayisi--;
    }

    public void yaz() {
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(liste[i]);
        }
    }

    public void sil(int index) {
        for (int i = index; i < elemanSayisi - 1; i++) {
            liste[i] = liste[i + 1];
        }
        elemanSayisi--;
    }

    public void ekle(String eklenecekEleman, int index) {
        for (int i = elemanSayisi - 1; i > index; i--) {
            liste[i + 1] = liste[i];
        }
        elemanSayisi--;
    }
}
