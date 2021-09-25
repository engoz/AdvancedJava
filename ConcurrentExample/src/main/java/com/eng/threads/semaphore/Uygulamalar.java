package com.eng.threads.semaphore;

/**
 * Created by servicium on 23.12.2016.
 */
public class Uygulamalar extends Thread{
    private Semaphore s;
    private VeriTabani v;

    public Uygulamalar(Semaphore s, VeriTabani v){
        this.s = s;
        this.v = v;
    }

    @Override
    public void run() {
        s.eleGecir(); //dikkat
        v.baglantiVer(); //kritik alan

        //gerekli calismayi yap
        try {
            sleep(((int) Math.random())*100);
        } catch (InterruptedException e) {
            //bosver
            //e.printStackTrace();
        }
        v.baglantiKopart();
        s.birak();
    }
}
