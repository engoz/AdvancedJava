package com.eng.behavior.queues.arrayblockingqueues2;

import java.util.concurrent.BlockingQueue;

/**
 * Created by enginoz on 18/02/17.
 */

public class Producer implements Runnable {
    private BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        //offer metodunu kullanarak koleksiyona eleman ekleme operasyonunun
        //basarili olup olmadigini kontrol ediyoruz.
        for (int i = 0; i < 8; i++) {
            System.out.println("Koleksiyona eklenen : String " + i + " ve sonuc " + queue.offer("String " + i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
