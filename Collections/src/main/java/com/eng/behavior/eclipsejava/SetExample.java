package com.eng.behavior.eclipsejava;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by servicium on 17.06.2015.
 */
public class SetExample {
    public static void main(String[] args) {
        HashSet<Double> sayilar = new HashSet<Double>();
        sayilar.add(10.6);
        sayilar.add(100.0);
        sayilar.add(-12.8);
        sayilar.add(3.7);
        sayilar.add(100.0);
        sayilar.add(null);

        System.out.println("HashSet Sayilar");
        for (Double sayi : sayilar) {
            System.out.println(sayi);
        }

        TreeSet<Double> siraliSayilar = new TreeSet<Double>();
        siraliSayilar.add(10.6);
        siraliSayilar.add(100.0);
        siraliSayilar.add(-12.8);
        siraliSayilar.add(3.7);
        siraliSayilar.add(100.0);
        //derleme aninda null hatasi verir
        //siraliSayilar.add(null);
        System.out.println("TreeSet Sayilar");
        for (Double sayi : siraliSayilar) {
            System.out.println(sayi);
        }

        TreeSet temelSayilar = new TreeSet();
        temelSayilar.add(10);
        temelSayilar.add(100);
        temelSayilar.add(-12);
        temelSayilar.add(3);
        temelSayilar.add(100);
        //derleme aninda null hatasi verir
        //siraliSayilar.add(null);

        System.out.println("Temel Sayilar");
        for (Object sayi : temelSayilar) {
            System.out.println(sayi);
        }
    }
}
