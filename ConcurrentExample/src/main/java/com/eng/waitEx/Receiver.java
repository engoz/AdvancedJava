package com.eng.waitEx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable {
    private Data load;
    Logger log = LoggerFactory.getLogger(Receiver.class);
    // standard constructors


    public Receiver(Data load) {
        this.load = load;
    }

    public void run() {
        for(String receivedMessage = load.receive();
            !"End".equals(receivedMessage);
            receivedMessage = load.receive()) {

            System.out.println(receivedMessage);

            // ...
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                log.error("Thread interrupted", e);
            }
        }
    }
}
