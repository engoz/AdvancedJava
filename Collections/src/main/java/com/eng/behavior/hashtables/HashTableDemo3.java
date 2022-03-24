package com.eng.behavior.hashtables;

/**
 * Created by servicium on 10.06.2015.
 */

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTableDemo3 {
    public static void main(String[] args) {
// Hashtable nesnesi yarat
        Hashtable ht = new Hashtable();
// Hashtable nesnesine öğe ekle
        ht.put("1", "Medrese");
        ht.put("2", "Darulfünun");
        ht.put("3", "Üniversite");
        ht.put("3", "Üniv");
        Collection c = ht.values();
        System.out.println("Hashtable'in öğeleri :");
// koleksiyon üzerinde Iterator
        Iterator itr = c.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
// koleksiyondan sil
        c.remove("Medrese");
// Hashtable öğeleri
        System.out.println("Hashtable geri kalan öğeleri :");
        Enumeration e = ht.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
