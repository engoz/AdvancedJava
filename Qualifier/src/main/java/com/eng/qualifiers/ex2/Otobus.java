package com.eng.qualifiers.ex2;

import java.util.Random;

/**
 * Created by servicium on 31.12.2015.
 */
@AracSecici(secBirini =  Araclar.Otobus)
public class Otobus implements Arac {
    public int hizSoyle() {
        return new Random().nextInt(120);
    }

    public String calis() {
        return "Otobus " + hizSoyle() + "hizinda calisiyor";

    }
}