package com.eng.statics;

public class StaticEx1 {
    public static int x ; public int y ;
    public static void ekranaBas(StaticEx1 sd ) {
        System.out.println("StaticEx1.x = " + sd.x + " StaticEx1.y = " + sd.y );
    }
    public static void main(String[] args) {
        StaticEx1 sd1 = new StaticEx1();
        StaticEx1 sd2 = new StaticEx1();
        x = 10 ;
         sd1.x = 10 ; // x = 10 ile ayni etkiyi yapar
        // sd2.x = 10 ; // x = 10 ile ayni etkiyi yapar
        //sd1.y = 2 ; sd2.y = 8;
        ekranaBas(sd1); ekranaBas(sd2);
    }
}
