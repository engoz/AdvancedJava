package com.eng.qualifiers.ex2;

import java.util.Random;

/**
 * Created by servicium on 31.12.2015.
 */
@AracSecici(secBirini = Araclar.Araba)
public class Araba implements Arac {
    public int hizSoyle() {
        return new Random().nextInt(180);
    }

    public String calis() {
        return "Araba "+hizSoyle()+"hizinda calisiyor";
    }
}
