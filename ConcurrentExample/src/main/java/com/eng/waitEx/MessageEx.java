package com.eng.waitEx;

import java.util.Scanner;

public class MessageEx {
    public static void main(String[] args) {
        // write your code here

        Mesaj mesaj=new Mesaj();
        Thread threadOku=new Thread(new OkumaYap(mesaj));
        Thread threadYaz=new Thread(new YazmaYap(mesaj));

        threadOku.start();
        threadYaz.start();

    }
}


class  Mesaj{


    String mesaj="";
    Scanner scanner=new Scanner(System.in);

    public synchronized   void oku(){

        if(!this.mesaj.isEmpty()) {

            System.out.println("Yazılan Mesaj : "+this.mesaj);
            this.mesaj="";
        }
        else
        {
            try {
                System.out.println("Okunması için Bir Mesaj Yazılması Bekleniyor ");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void yaz(String mesaj){



        if(this.mesaj.isEmpty()){
            System.out.println("Ekrana Yazma Yapılabilmesi için Bir Mesaj Yazın");
            this.mesaj=scanner.nextLine();
            System.out.println("Mesaj nesnesine yeni bir değer atandı : => "+ this.mesaj);
            notifyAll();}
        else
        {
            try {
                System.out.println("bir mesaj Yazıldı Okunması Bekleniyor");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}


class  OkumaYap implements Runnable{

    Mesaj mesaj;


    public OkumaYap(Mesaj mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public  void run() {
        while (true){

            mesaj.oku();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class  YazmaYap implements  Runnable{

    Mesaj mesaj;



    public YazmaYap(Mesaj mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void run() {

        while (true){

            mesaj.yaz(mesaj.mesaj);
        }
    }
}
