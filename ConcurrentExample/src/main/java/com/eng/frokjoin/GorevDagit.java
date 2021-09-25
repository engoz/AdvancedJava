package com.eng.frokjoin;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by servicium on 19.10.2016.
 */
public class GorevDagit {
    public static void main(String[] args) {
        ForkJoinPool threadPool = new ForkJoinPool();
        ToplamaGorevi gorev = new ToplamaGorevi(200_000);
        long baslamaZamani = System.currentTimeMillis();
        long toplam = threadPool.invoke(gorev);
        long bitisZamani = System.currentTimeMillis();
        System.out.println("Uretilen Sayilar Toplam : " +toplam );
        System.out.println((bitisZamani-baslamaZamani) + " ms de tamamlandi ");
    }
}
