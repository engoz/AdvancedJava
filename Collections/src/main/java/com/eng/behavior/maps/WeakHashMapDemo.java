package com.eng.behavior.maps;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String args[])throws Exception
    {
        WeakHashMap m = new WeakHashMap();
        DemoGC d = new DemoGC();

        // puts an entry into WeakHashMap
        m.put(d," Hi ");
        System.out.println(m);

        d = null;

        // garbage collector is called
        System.gc();

        // thread sleeps for 4 sec
        Thread.sleep(4000);

        System.out.println(m);
    }
}
