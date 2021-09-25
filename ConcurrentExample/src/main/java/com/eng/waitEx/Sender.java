package com.eng.waitEx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {

    Logger log = LoggerFactory.getLogger(Sender.class);

    private Data data;

    // standard constructors


    public Sender(Data data) {
        this.data = data;
    }

    public void run() {
        String packets[] = {
                "First packet",
                "Second packet",
                "Third packet",
                "Fourth packet",
                "End"
        };

        for (String packet : packets) {
            data.send(packet);

            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
                log.error("Thread interrupted", e);
            }
        }
    }
}
