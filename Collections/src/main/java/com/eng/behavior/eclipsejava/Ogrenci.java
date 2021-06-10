package com.eng.behavior.eclipsejava;

/**
 * Created by servicium on 17.06.2015.
 */
public class Ogrenci implements Comparable<Ogrenci> {

    private int okulNo;
    private String ad;
    private String soyad;
    private String sinif;


    public Ogrenci(int okulNo, String ad, String soyad, String sinif) {
        this.okulNo = okulNo;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ogrenci)) return false;

        Ogrenci ogrenci = (Ogrenci) o;

        if (getOkulNo() != ogrenci.getOkulNo()) return false;
        if (!getAd().equals(ogrenci.getAd())) return false;
        if (!getSoyad().equals(ogrenci.getSoyad())) return false;
        return getSinif().equals(ogrenci.getSinif());

    }

    @Override
    public int hashCode() {
        int result = getOkulNo();
        result = 31 * result + getAd().hashCode();
        result = 31 * result + getSoyad().hashCode();
        result = 31 * result + getSinif().hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "okulNo=" + okulNo +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }

    public int compareTo(Ogrenci o) {
        if (this.getOkulNo() < o.getOkulNo())
            return -1;
        else if (this.getOkulNo() > o.getOkulNo())
            return 1;
        return 0;
    }
}
