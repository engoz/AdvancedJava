package com.eng.behavior.hashtables;

/**
 * Created by servicium on 10.06.2015.
 */

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo2 {

    public static void main(String args[]) throws Exception {
// sığayı 10 ile baslat; dolunca artır
        Hashtable hash = new Hashtable(10, 10);
        for (int i = 0; i <= 100; i++) {
            Integer integer = new Integer(i);
            hash.put(integer, "Sayı : " + i);
        }
        System.out.println(hash);
// değere erisim
        System.out.println(hash.get(new Integer(5)));
// değere erisim
        System.out.println(hash.get(new Integer(21)));
        System.in.read();
// bütün değerler
        for (Enumeration e = hash.keys(); e.hasMoreElements(); ) {
            System.out.println(hash.get(e.nextElement()));
        }

    }
}
