package com.timur.bolum5.vectors;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by enginoz on 10/15/15.
 */
public class Demo3 {

    public static void main(String[] args) {
        Enumeration gunler;
        Vector gunAdi = new Vector();
        gunAdi.add("Pazartesi");
        gunAdi.add("Sali");
        gunAdi.add("Carsamba");
        gunAdi.add("Persembe");
        gunAdi.add("Cumar");
        gunAdi.add("Cumartesi");
        gunAdi.add("Pazar");
        gunler = gunAdi.elements();
        while (gunler.hasMoreElements())
            System.out.println(gunler.nextElement());
    }
}
