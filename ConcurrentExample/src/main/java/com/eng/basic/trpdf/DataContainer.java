package com.eng.basic.trpdf;

public class DataContainer {

    public void doLongOperation(){
        System.out.println(" Operation Start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void doAnotherLongOperation(){
        System.out.println(" Another Operation Start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
