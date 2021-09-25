package com.eng.threads;

/**
 * Created by servicium on 06.06.2016.
 */

class Mudur{
    public void calis(){
        System.out.println("Mudur Calisiyor");
    }
}

class GenelMudur extends Mudur implements Runnable{

    public void calis(){
        System.out.println("Ben Genel Mudur");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            for(int i=0; i<5; i++){
                //thread.sleep(100); hata
                //System.out.println(this.getName); hata

                Thread.currentThread().sleep(150);
                System.out.println(Thread.currentThread().getName()+"< >"+i );
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

public class ArayuzTest1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GenelMudur g1 = new GenelMudur();
        GenelMudur g2 = new GenelMudur();

        Thread t1 = new Thread(g1);
        Thread t2 = new Thread(g2);

        t1.start();
        t2.start();

    }

}
