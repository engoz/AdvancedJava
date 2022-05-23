package com.eng.collections.threads;

/**
 * Created by servicium on 31.05.2016.
 */
public class YasamTesti2 extends Thread {

    public void run(){

        System.out.println(this.getName()+" run() yasiyormusun "+this.isAlive());

        try {
            Thread.sleep(60*10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        YasamTesti2 y1 = new YasamTesti2();
        YasamTesti2 y2 = new YasamTesti2();
        YasamTesti2 y3 = new YasamTesti2();

        System.out.println("y1 yasiyormusun "+ y1.isAlive());
        System.out.println("y2 yasiyormusun "+ y2.isAlive());
        System.out.println("y3 yasiyormusun "+ y3.isAlive());

        y1.start();
        y2.start();
        y3.start();


        System.out.println("y1 yasiyormusun "+ y1.isAlive());
        System.out.println("y2 yasiyormusun "+ y2.isAlive());
        System.out.println("y3 yasiyormusun "+ y3.isAlive());

    }

}

