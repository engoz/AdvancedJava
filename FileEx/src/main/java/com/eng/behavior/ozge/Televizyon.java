package com.eng.behavior.ozge;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Televizyon {
    public int EkranEbati;
    public String GoruntuTeknolojisi;
    public int HDMIGirisleri;
    public int UretimYili;

    public Televizyon(int ekranEbati, String goruntuTeknolojisi, int HDMIGirisleri, int uretimYili) {
        EkranEbati = ekranEbati;
        GoruntuTeknolojisi = goruntuTeknolojisi;
        this.HDMIGirisleri = HDMIGirisleri;
        UretimYili = uretimYili;
    }

    public int getEkranEbati() {
        return EkranEbati;
    }

    public void setEkranEbati(int ekranEbati) {
        EkranEbati = ekranEbati;
    }

    public String getGoruntuTeknolojisi() {
        return GoruntuTeknolojisi;
    }

    public void setGoruntuTeknolojisi(String goruntuTeknolojisi) {
        GoruntuTeknolojisi = goruntuTeknolojisi;
    }

    public int getHDMIGirisleri() {
        return HDMIGirisleri;
    }

    public void setHDMIGirisleri(int HDMIGirisleri) {
        this.HDMIGirisleri = HDMIGirisleri;
    }

    public int getUretimYili() {
        return UretimYili;
    }

    public void setUretimYili(int uretimYili) {
        UretimYili = uretimYili;
    }
}
