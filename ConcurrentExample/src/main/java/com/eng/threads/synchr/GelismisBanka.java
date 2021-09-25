package com.eng.threads.synchr;

/**
 * Created by servicium on 23.12.2016.
 */

class GelismisHesap{
    private double miktar = 50;
    public double paraYatir(double m){
        this.miktar += m;
        System.out.println("para yatiriliyor " +m);
        return miktar;
    }

    public void paraCek(double m){
        if (this.miktar < 0){
            System.out.println("Bakiye Yetersiz " + this.miktar);
            return;
        }
        System.out.println("para cekiliyor " +m);
        this.miktar -= m;
    }

    public double miktariOgren(){
        return miktar;
    }
}

class GelismisBankaCalisanBir extends Thread{

    GelismisHesap hesap;
    public GelismisBankaCalisanBir(String isim, GelismisHesap hesap){
        super(isim);
        this.hesap = hesap;
    }

    @Override
    public void run() {
        try {
            synchronized (hesap) {
                double miktar = hesap.miktariOgren();
                double ilkMiktar = miktar;
                hesap.paraYatir(100);
                sleep(1);
                hesap.paraYatir(100);
                sleep(1);
                hesap.paraCek(150);
                miktar = hesap.miktariOgren();
                //islem sonucu elde edilmesi gereken
                System.out.println(currentThread().getName() + "---> " + ilkMiktar + " 100 + 100 - 150 = " + miktar);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class GelismisBankaCalisanIki extends Thread{

    GelismisHesap hesap;
    public GelismisBankaCalisanIki(String isim, GelismisHesap hesap){
        super(isim);
        this.hesap = hesap;
    }

    @Override
    public void run() {
        try {
            synchronized (hesap) {
                double miktar = hesap.miktariOgren();
                double ilkMiktar = miktar;
                hesap.paraYatir(200);
                sleep(1);
                hesap.paraCek(50);
                sleep(1);
                hesap.paraYatir(100);
                miktar = hesap.miktariOgren();
                //islem sonucu elde edilmesi gereken
                System.out.println(currentThread().getName() + "---> " + ilkMiktar + " 200 - 50 - 100 = " + miktar);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class GelismisBanka {
    public static void main(String[] args) {
        GelismisHesap hesap = new GelismisHesap();
        GelismisBankaCalisanBir calisanBir = new GelismisBankaCalisanBir("CalisanBir",hesap);
        GelismisBankaCalisanIki calisanIki = new GelismisBankaCalisanIki("CalisanIki",hesap);

        calisanBir.start();
        calisanIki.start();
    }
}
