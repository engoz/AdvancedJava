package com.eng.threads;

import java.io.IOException;

/**
 * Created by servicium on 06.06.2016.
 */

class Hesaplamalar extends Thread {
    @Override
    public void run() {
        int sayac = 0;
        for (;;) {
            if ((sayac % 10000000) == 0) {
                System.out.println(this.getName() + "-->" + sayac + "bagimli mi" + this.isDaemon());
            }
            sayac++;
        }
    }
}

public class Bagimlilik1 {
    public static void main(String[] args) throws IOException {
        Hesaplamalar h1 = new Hesaplamalar();
        Hesaplamalar h2 = new Hesaplamalar();
        Hesaplamalar h3 = new Hesaplamalar();
        h1.setDaemon(true);
        h2.setDaemon(true);
        h3.setDaemon(true);

        h1.start();
        h2.start();
        h3.start();

        System.out.println("Bir tuşa basiniz");
        System.in.read();
    }

}
