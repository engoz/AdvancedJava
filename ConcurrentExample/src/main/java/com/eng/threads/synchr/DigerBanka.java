package com.eng.threads.synchr;

/**
 * Created by servicium on 23.12.2016.
 */

class DigerHesap{
    private double miktar = 50;
    public synchronized double paraYatir(double m){
        this.miktar += m;
        System.out.println("para yatiriliyor " +m);
        return miktar;
    }

    public synchronized void paraCek(double m){
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

class DigerBankaCalisanBir extends Thread{

    DigerHesap hesap;
    public DigerBankaCalisanBir(String isim, DigerHesap hesap){
        super(isim);
        this.hesap = hesap;
    }

    @Override
    public void run() {
        try {

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

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DigerBankaCalisanIki extends Thread{

    DigerHesap hesap;
    public DigerBankaCalisanIki(String isim, DigerHesap hesap){
        super(isim);
        this.hesap = hesap;
    }

    @Override
    public void run() {
        try {
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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class DigerBanka {

    public static void main(String[] args) {
        DigerHesap hesap = new DigerHesap();
        DigerBankaCalisanBir calisanBir = new DigerBankaCalisanBir("CalisanBir",hesap);
        DigerBankaCalisanIki calisanIki = new DigerBankaCalisanIki("CalisanIki",hesap);

        calisanBir.start();
        calisanIki.start();
    }
}
