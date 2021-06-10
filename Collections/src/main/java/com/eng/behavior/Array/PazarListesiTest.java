package com.eng.behavior.Array;

/**
 * Created by enginoz on 10/9/16.
 */
public class PazarListesiTest {
    public static void main(String[] args) {
        PazarListesi pazarListesi = new PazarListesi(5);
        pazarListesi.listeyeEkle("Muz");
        pazarListesi.listeyeEkle("Kivi");
        pazarListesi.listeyeEkle("Elma");
        pazarListesi.ekle("Armut", 7);
        pazarListesi.yaz();
    }
}
