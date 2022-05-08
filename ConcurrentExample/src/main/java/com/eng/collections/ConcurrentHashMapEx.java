package com.eng.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

    public static void main(String[] s) {
        Map<String, Boolean> whoLetDogsOut = new ConcurrentHashMap<>();
        whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));
        whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));

        //Key map2te varsa onu yoksa 12’yi getirir.
        System.out.println(whoLetDogsOut.getOrDefault("key",false));

    }
    static boolean f(String s) {
        System.out.println("creating a value for \""+s+'"');
        return s.isEmpty();
    }

    /*

    computeIfPresent():Örnek: map.computeIfPresent(word, (String key, Integer value) -> ++value); word key olarak varsa value’yı 1 artırır.

            compute(): Örnek: map.compute(word, (String key, Integer value) -> ++value); word ün olupolmamasınıkontroletmedenvalue’yıartırmaya çalışır

    putIfAbsent: Key yoksa yeni değeri koyar ve return null döner. varsa return eder. Güncelleme yapmaz.Örnek: map.putIfAbsent(“key1”, 4.5);

    computeIfAbsent: Key yoksa yeni değeri hesaplar, koyar ve return eder. varsa return eder. Güncelleme yapmaz.Örnek: map.computeIfAbsent(“key1”, var1+var2);

    map.computeIfAbsent(n,(key) -> fibo(n – 1).add(fibo(n – 2)));
    */
}
