package com.eng.threads;

/**
 * Created by servicium on 31.05.2016.
 */

class Robot2 extends Thread {
    private int dongusayisi;
    public Robot2(String isim, int dongusayisi){
        super(isim);
        this.dongusayisi = dongusayisi;

    }

    @Override
    public void run() {
        if (dongusayisi == 0){
            return;
        }

        try{
            for (int i=0; i<dongusayisi; i++){
                System.out.println("Oncelik "+ this.dongusayisi +" - "+ this.getName());
            }

        }catch (Exception ex){
            System.out.println("Hata Olustu" + ex);
        }
    }
}

public class OrnekUc {

    public static void main(String[] args) {
        Robot2 r1 =  new Robot2("A",2);
        Robot2 r2 =  new Robot2("B",3);
        Robot2 r3 =  new Robot2("C",0);
        Robot2 r4 =  new Robot2("D",1);

        r1.start();
        r2.start();
        r3.start();
        r4.start();
    }

}
