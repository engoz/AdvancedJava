package com.eng.threads;

/**
 * Created by servicium on 31.05.2016.
 */
public class YieldOrnek  extends Thread{

    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(this.getName()+"<->"+i);
            //yield diğer çalışmasına fırsat verir.
            Thread.yield(); //yieldsiz dene gor
            //this.yield();   iki gosterimde dogru
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        YieldOrnek y1 = new YieldOrnek();
        YieldOrnek y2 = new YieldOrnek();
        YieldOrnek y3 = new YieldOrnek();

        y1.start();
        y2.start();
        y3.start();
    }

}
