package com.eng.behavior.queues.arrayblockingqueues2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by enginoz on 18/02/17.
 */
public class ArrayBlockingQueueOrnegi {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(5);

        // Bu koleksiyonun blokladığını görebilmek için iki farklı
        // Thread'den ayni anda bu koleksiyona erismeye calisiyoruz
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();
    }

}
