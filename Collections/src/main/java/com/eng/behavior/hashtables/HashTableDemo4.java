package com.eng.behavior.hashtables;

/**
 * Created by servicium on 10.06.2015.
 */

import java.util.Hashtable;
import java.util.TreeMap;


public class HashTableDemo4 {

    public static void main(String[] args) {
// Bir TreeMap nesnesi yarat:
        TreeMap tm = new TreeMap();
// Bir Hashtable nesnesi yarat
        Hashtable ht = new Hashtable();
// TreeMap tm deposuna veri gir
        tm.put("1", "Ankara");
        tm.put("2", "Paris");
// tm map'inin bütün öğelerini ht mapi'ne kopyala
        ht.putAll(tm);
// ht map'ini yazdır;
        System.out.println(ht);
// tm
        System.out.println(tm);
// Her iki map'in ikinci öğelerini yazdır:
        System.out.println("tm içindeki #2 öğe : " + tm.get("2"));
        System.out.println("th içindeki #2 öğe : " + ht.get("2"));
    }

}
