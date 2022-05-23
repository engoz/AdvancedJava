package com.eng.behavior.hashtables;

/**
 * Created by servicium on 10.06.2015.
 */

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable<Integer, String> hTable = new Hashtable<Integer,
                String>();
// Hashtable nesnesine öğe ekleme
        hTable.put(new Integer(474), "Kars");
        hTable.put(new Integer(376), "Balıkesir");
        hTable.put(new Integer(322), "Ankara");
        hTable.put(new Integer(232), "Izmir");
        hTable.put(new Integer(284), "Edirne");
        hTable.put(new Integer(285), "");
        hTable.put(new Integer(121), "null");
// Hashtable öğelerini yazdır
        System.out.println(hTable);
// anahtar ve değerlere erismek için Hashtable sıralaması
        Enumeration em = hTable.keys();
        while (em.hasMoreElements()) {
// Hashtable'ın öğelerine erisim
            int key = (Integer) em.nextElement();
// değere erisim
            String value = (String) hTable.get(key);
            System.out.println("Anahtar :" + key + " değer :" + value);
        }
    }
}
