package com.eng.behavior.eclipsejava;

import java.util.TreeSet;

/**
 * Created by servicium on 17.06.2015.
 */
public class TreeSetOgrenci {

    public static void main(String[] args) {
        TreeSet<Ogrenci> ogrenciler = new TreeSet<Ogrenci>();
        ogrenciler.add(new Ogrenci(100, "engin", "oz", "5"));
        ogrenciler.add(new Ogrenci(110, "can", "oz", "3"));
        ogrenciler.add(new Ogrenci(10, "ozlem", "oz", "5"));
        ogrenciler.add(new Ogrenci(90, "ada", "oz", "1"));

        for (Ogrenci ogrenci : ogrenciler) {
            System.out.println(ogrenci.getOkulNo() + " " + ogrenci.getAd() + " " + ogrenci.getSoyad() + " " + ogrenci.getSinif());
        }

    }
}
