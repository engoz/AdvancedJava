package com.eng.collections.threads;

/**
 * Created by servicium on 31.05.2016.
 */

class YarisArabasiBir extends Thread{

    public void run(){
        for(int i=0; i<10; i++){
            try{
                boolean interrupted = this.isInterrupted();
                if(interrupted){
                    System.out.println("yaris arabasi bir uyku bolundu - "+ Thread.interrupted() + " - " + this.isInterrupted());
                }
                    System.out.println("yaris arabasi bir uyuyor");

                    Thread.sleep(60*10);
            }catch(InterruptedException ex){
            //    System.out.println("Bir Exception Fırlattı ");
            }
        }
    }
}

class YarisArabasiIki extends Thread{

    public void run(){
        for(int i=0; i<10; i++){
            try{
                boolean interrupted = this.isInterrupted();
                if(interrupted){
                    System.out.println("Yarisarabasi iki uyku bolundu -"+ this.isInterrupted());
                }
                    System.out.println("yaris arabasi iki uyuyor");

                    Thread.sleep(60*10);
            }catch(InterruptedException ex){
            //    System.out.println("iki Exception Fırlattı ");
            }
        }
    }
}

public class UykuTest2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        YarisArabasiBir y1 = new YarisArabasiBir();
        YarisArabasiIki y2 = new YarisArabasiIki();

        y1.start();
        y2.start();

        y1.interrupt();
        y2.interrupt();
    }

}
