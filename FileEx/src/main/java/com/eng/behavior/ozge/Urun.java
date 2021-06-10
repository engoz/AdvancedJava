package com.eng.behavior.ozge;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Urun {
    public String barkodNo;
    public String urunId;
    public Float alisFiyati;
    public int karOrani;
    public int kdvOrani;
    public Float satisFiyati;
    public Boolean otvDurumu;
    public int otvOrani;
    public Float kar;

    public Urun() {
        String barkodId = "";
        String urunId = "";
        Float alisFiyati = (float) 7.500;
        int karOrani = 10;
        int kdvOrani = 0;
        boolean otvDurumu;
        int otvOrani = 20;
    }

    public Urun(String barkodNo, String urunId, Float alisFiyati, int karOrani, int kdvOrani, Float satisFiyati, Boolean otvDurumu, int otvOrani, Float kar) {
        this.barkodNo = barkodNo;
        this.urunId = urunId;
        this.alisFiyati = alisFiyati;
        this.karOrani = karOrani;
        this.kdvOrani = kdvOrani;
        this.satisFiyati = satisFiyati;
        this.otvDurumu = otvDurumu;
        this.otvOrani = otvOrani;
        this.kar = kar;
    }

    public Float kar() {
        System.out.println("kar:" + (alisFiyati * (karOrani / 100.0)));
        return kar;
    }

    public Boolean otvDurumu() {
        if (otvDurumu) {
            System.out.println("a=" + (alisFiyati + kar + (alisFiyati * (kdvOrani))));
        } else if (otvDurumu) {
            Float a = (Float) alisFiyati + kar + (alisFiyati * (kdvOrani));
            System.out.println("satisFiyati=" + (a + (a * otvOrani / 100.0)));
        } else {
            System.out.println("satisFiyati=" + (alisFiyati + kar + alisFiyati * (kdvOrani)));
        }
        return otvDurumu;
    }

    public String getBarkodNo() {
        return barkodNo;
    }

    public void setBarkodNo(String barkodNo) {
        this.barkodNo = barkodNo;
    }

    public String getUrunId() {
        return urunId;
    }

    public void setUrunId(String urunId) {
        this.urunId = urunId;
    }

    public Float getAlisFiyati() {
        return alisFiyati;
    }

    public void setAlisFiyati(Float alisFiyati) {
        this.alisFiyati = alisFiyati;
    }

    public int getKarOrani() {
        return karOrani;
    }

    public void setKarOrani(int karOrani) {
        this.karOrani = karOrani;
    }

    public int getKdvOrani() {
        return kdvOrani;
    }

    public void setKdvOrani(int kdvOrani) {
        this.kdvOrani = kdvOrani;
    }

    public Float getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(Float satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    public Boolean getOtvDurumu() {
        return otvDurumu;
    }

    public void setOtvDurumu(Boolean otvDurumu) {
        this.otvDurumu = otvDurumu;
    }

    public int getOtvOrani() {
        return otvOrani;
    }

    public void setOtvOrani(int otvOrani) {
        this.otvOrani = otvOrani;
    }

    public Float getKar() {
        return kar;
    }

    public void setKar(Float kar) {
        this.kar = kar;
    }
}
