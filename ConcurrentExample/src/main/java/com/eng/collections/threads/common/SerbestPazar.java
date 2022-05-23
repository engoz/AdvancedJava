package com.eng.collections.threads.common;

/**
 * Created by servicium on 06.06.2016.
 */
public class SerbestPazar {
    public static void main(String[] args) {
        SerbestBolge2 sb = new SerbestBolge2();
        Uretici u = new Uretici(sb);
        Tuketici t = new Tuketici(sb);
        u.start();
        t.start();
    }
}
