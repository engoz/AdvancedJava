package com.eng.qualifiers.ex2;

import java.util.Random;

/**
 * Created by servicium on 31.12.2015.
 */
@AracSecici(secBirini =  Araclar.Traktor)
public class Traktor implements Arac {

    public int hizSoyle() {
        return new Random().nextInt(50);
    }

    public String calis() {
        return "Traktor " + hizSoyle() + "hizinda calisiyor";

    }
}