package basic.recursive;

public class TalorSeries {
    static float fakt(float k){
        if (k<=1){
            return 1;
        }else {
            return (k * (k-1));
        }

    }

    public static void main(String[] args) {
        int n = 15;
        for (int i=0; i<=90; i+=5){
            double y,z,x,t=0;
            x = i * (Math.PI /180);
            for (int j=0; j<n-1; j++) {
                float us = 2 * j + 1;
                y = Math.pow((-1),j);
                z = Math.pow(x, us);
                t = t+y*z/fakt(us);
            }
            System.out.println(i +"=\t"+t);
        }
    }
}
