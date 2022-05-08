package com.eng.qualifiers.ex2;

import javax.inject.Inject;

/**
 * Created by servicium on 31.12.2015.
 */
public class Galeri {
    @Inject
    @AracSecici(secBirini = Araclar.Otobus)
    private Arac arac;

    public static void main(String[] args) {
        /*
        Weld weld = new Weld();
        WeldContainer konteyner = weld.initialize();
        Galeri galeri = konteyner.instance().select(Galeri.class).get();

        String mesaj=galeri.arac.calis();
        System.out.println("> "+mesaj);
         */
    }
}
