package com.eng.collections.threads.semaphore;

/**
 * Created by servicium on 23.12.2016.
 */
public class SemaphoreTest {

    public SemaphoreTest(int sayi){
        Semaphore semaphore = new Semaphore(sayi);
        VeriTabani veriTabani = new VeriTabani();
        Uygulamalar u1 = new Uygulamalar(semaphore,veriTabani);
        Uygulamalar u2 = new Uygulamalar(semaphore,veriTabani);
        Uygulamalar u3 = new Uygulamalar(semaphore,veriTabani);
        Uygulamalar u4 = new Uygulamalar(semaphore,veriTabani);


        u1.start();
        u2.start();
        u3.start();
        u4.start();

    }

    public static void main(String[] args) {

        SemaphoreTest semaphoreTest = new SemaphoreTest(2);
    }

}
