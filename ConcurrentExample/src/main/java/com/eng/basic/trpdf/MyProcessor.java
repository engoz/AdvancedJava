package com.eng.basic.trpdf;

public class MyProcessor implements Runnable{

    private int id;

    MyProcessor(int  id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Basliyor " + id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tamamlandi " +id);
    }
}
