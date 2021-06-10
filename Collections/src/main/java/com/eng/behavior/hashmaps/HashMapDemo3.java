package com.eng.behavior.hashmaps;

/**
 * Created by servicium on 10.06.2015.
 */

import java.util.HashMap;
import java.util.Iterator;


public class HashMapDemo3 {
    public static void main(String args[]) {
        // Öntanımlı sıgası (16) ile bos bir HashMap yaratıyor
        HashMap hashMap = new HashMap();
        // HashMap'e öğe ekleme
        hashMap.put("Elma", new Integer(1));
        hashMap.put("Armut", new Integer(2));
        hashMap.put("Portakal", new Integer(3));
        System.out.println(hashMap.entrySet());
        if (hashMap.containsValue(new Integer(1))) {
            System.out.println("HashMap 1 değerini içeriyor");
        } else {
            System.out.println("HashMap 1 değerini içermiyor");
        }
        if (hashMap.containsKey("Elma")) {
            System.out.println("HashMap 'Elma' anahtarını içeriyor");
        } else {
            System.out.println("HashMap 'Elma' anahtarını içermiyor");
        }
        Integer n = (Integer) hashMap.get("Portakal");
        System.out.println("Portakal anahtarına eslenen değer:" + n);
        System.out.println("HashMap'in anahtarları :");

        Iterator iterator = hashMap.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("HashMap'in bütün değerleri");
        iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(hashMap.remove("Armut")
                + " öğesi HashMap'ten silindi.");
    }
}
