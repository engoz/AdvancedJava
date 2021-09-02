package mathss;

public class AsalSayi {

    public static void main(String[] args) {
        int sayi = 2047;
        int i,sayac=0;
        for(i=2;i<sayi;i++)
        {
            if(sayi%i==0)
            {
                sayac++;
            }
        }
        if(sayac==0 && sayi>1)
            System.out.println("Sayı asaldır");
        else
            System.out.println("Sayı asal değildir");
    }

}
