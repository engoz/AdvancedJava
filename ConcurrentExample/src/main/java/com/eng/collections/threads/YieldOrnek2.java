package com.eng.collections.threads;

/**
 * Created by servicium on 31.05.2016.
 */
public class YieldOrnek2 extends Thread{

    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(this.getName()+"<->"+i);
            Thread.yield(); //yieldsiz dene gor
            //this.yield();   iki gosterimde dogru
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        YieldOrnek2 y1 = new YieldOrnek2();
        YieldOrnek2 y2 = new YieldOrnek2();
        YieldOrnek2 y3 = new YieldOrnek2();

        y1.setPriority(MAX_PRIORITY);
        y2.setPriority(MAX_PRIORITY-2);
        y3.setPriority(MAX_PRIORITY-4);

        y1.start();
        y2.start();
        y3.start();
    }

}

