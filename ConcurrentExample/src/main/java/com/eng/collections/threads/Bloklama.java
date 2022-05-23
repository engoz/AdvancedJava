package com.eng.collections.threads;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by servicium on 06.06.2016.
 */
class Robot776 implements Runnable{

    @Override
    public void run() {
        try{
            int sayac =0;
            while(true){
                if((sayac % 10000000) == 0){
                    System.out.println(Thread.currentThread().getName()+"-- > "+sayac);
                }
                sayac++;
            }
        }catch(Exception ex){
            System.out.println("Hata olustu");
        }
    }

}

class Robot778 extends Thread{

    public Robot778(String isim){
        super(isim);
    }
    @Override
    public void run() {
        try{
            int sayac =0;
            while(true){
                if((sayac % 10000000) == 0){
                    System.out.println(this.getName()+"-- > "+sayac);
                }

                if(sayac == 50000000){
                    System.out.println("******Lutfen Sayi Giriniz*********");

                    BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("--->"+a.readLine());
                }

                sayac++;
            }
        }catch(Exception ex){
            System.out.println("Hata olustu");
        }
    }

}

public class Bloklama {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Robot776 r776 = new Robot776();
        Robot778 r778 = new Robot778("Robot778");
        Thread t = new Thread(r776,"Robot776" );
        r778.setPriority(8);
        t.setPriority(6);
        r778.start();
        t.start();
    }
}
