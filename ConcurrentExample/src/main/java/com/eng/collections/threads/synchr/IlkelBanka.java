package com.eng.collections.threads.synchr;

/**
 * Created by servicium on 23.12.2016.
 */


class IlkelHesap{
    private double miktar = 50;
    public double paraYatir(double m){
        this.miktar += m;
        return miktar;
    }

    public void paraCek(double m){
        if (this.miktar < 0){
            System.out.println("Bakiye Yetersiz " + this.miktar);
            return;
        }
        this.miktar -= m;
    }

    public double miktariOgren(){
        return miktar;
    }
}

class IlkelBankaCalisanBir extends Thread{

    IlkelHesap hesap;
    public IlkelBankaCalisanBir(String isim, IlkelHesap hesap){
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
            System.out.println(currentThread().getName() + "---> " + ilkMiktar +" 100 + 100 - 150 = " + miktar );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class IlkelBankaCalisanIki extends Thread{

    IlkelHesap hesap;
    public IlkelBankaCalisanIki(String isim, IlkelHesap hesap){
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
            System.out.println(currentThread().getName() + "---> " + ilkMiktar +" 200 - 50 - 100 = " + miktar );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class IlkelBanka {
    public static void main(String[] args) {
        IlkelHesap hesap = new IlkelHesap();
        IlkelBankaCalisanBir calisanBir = new IlkelBankaCalisanBir("CalisanBir",hesap);
        IlkelBankaCalisanIki calisanIki = new IlkelBankaCalisanIki("CalisanIki",hesap);

        calisanBir.start();
        calisanIki.start();
    }
}
