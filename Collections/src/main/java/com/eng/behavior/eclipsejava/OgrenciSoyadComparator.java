package com.eng.behavior.eclipsejava;

import java.util.Comparator;

/**
 * Created by servicium on 17.06.2015.
 */
public class OgrenciSoyadComparator implements Comparator<Ogrenci> {
    public int compare(Ogrenci o1, Ogrenci o2) {
        if (o1.getSoyad().compareTo(o2.getSoyad()) > 0)
            return o1.getSoyad().compareTo(o2.getSoyad());
        else
            return o1.getAd().compareTo(o2.getAd());

    }
}
