package com.eng.basic;

/**
 * Created by enginoz on 9/6/16.
 */
public class Islem {

    private int sonuc;
    private boolean tamamlandi;

    public Islem() {
        sonuc = 0;
        tamamlandi = false;
    }

    public int getSonuc() {
        return sonuc;
    }

    public void setSonuc(int sonuc) {
        this.sonuc = sonuc;
    }

    public boolean isTamamlandi() {
        return tamamlandi;
    }

    public void setTamamlandi(boolean tamamlandi) {
        this.tamamlandi = tamamlandi;
    }
}
