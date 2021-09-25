package com.eng.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by servicium on 30.05.2016.
 */
public class CollectionsSyncronizedList {
    public static void main(String a[]){
        List<String> syncal =
                Collections.synchronizedList(new ArrayList<String>());

        //Adding elements to synchronized ArrayList
        syncal.add("Pen");
        syncal.add("NoteBook");
        syncal.add("Ink");

        System.out.println("Iterating synchronized ArrayList:");

        Iterator<String> iterator = syncal.iterator();
        while (iterator.hasNext()) {
            //Exception Fırlatır.
            syncal.add("Engin");
            System.out.println(iterator.next());
        }
      /*
        synchronized(syncal) {
            Iterator<String> iterator = syncal.iterator();
            while (iterator.hasNext())
                System.out.println(iterator.next());
        }
      */
    }
}
