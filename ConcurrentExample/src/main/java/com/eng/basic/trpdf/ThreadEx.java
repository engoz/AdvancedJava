package com.eng.basic.trpdf;

public class ThreadEx {
    public static void main(String[] args) {
        process(new DataContainer());
        doUnrelatedOperations();
    }

    private static void doUnrelatedOperations() {
        System.out.println("UnrelatedOperations");
    }

    private static void process(DataContainer dataContainer) {
        new Thread(()->{
            dataContainer.doLongOperation();
        }).start();
        dataContainer.doAnotherLongOperation();
    }
}
