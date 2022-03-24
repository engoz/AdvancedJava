package com.eng.bufffer;

public class MemoryUse {
    public static void main(String[] args) {
        System.gc();
        long start = System.currentTimeMillis();
        long startMemory = Runtime.getRuntime().freeMemory();
        StringBuffer sb = new StringBuffer();
        //StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            sb.append(":").append(i);
        }
        long end = System.currentTimeMillis();
        long endMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken:" + (end - start));
        long megabyte = 1024 * 1024;
        System.out.println("Memory used:" + ((startMemory - endMemory) / megabyte));
    }
}
