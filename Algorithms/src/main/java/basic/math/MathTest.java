package basic.math;

public class MathTest {

    public static void main(String[] args) {


        /* Matematiksel işlemleri yapacağımız değişkeni oluşturalım */

        double dSayi = -29.45; //aradaki virgül değil nokta

        System.out.println("Sayının ilk değeri    : " + dSayi);

        /* Sayının mutlak değerini alalım */

        System.out.println("Sayının mutlak değeri : " + Math.abs(dSayi));


        /* Sayıyı yukarı yuvarlayalım */

        System.out.println("Sayı yukarı yuvarla   : " + Math.ceil(dSayi));


        /* Sayıyı aşağı  yuvarlayalım */

        System.out.println("Sayı aşağı  yuvarla   : " + Math.floor(dSayi));


        /* 81 sayısının karekökünü alalım */

        System.out.println("100'ün karekök değeri : " + Math.sqrt(81));


        /* 3  sayısının küpünü alalım */

        System.out.println("3'ün küpünün   değeri : " + Math.pow(3, 3));


        /* random() metodunun kullanımı. */

        double dSayi2 = Math.random();

        System.out.println("Rastgele çekilen double sayı  : " + dSayi2);

        int iSayi = (int) (Math.random() * 100);

        System.out.println("Rastgele çekilen int    sayı  : " + iSayi);


        /* rastgele sayılara aralık verme (1 ile 10 arasında) */

        int iSayi2 = (int) (Math.random() * 9 + 1);

        System.out.println("1 ile 10 arsı çekilen int sayı: " + iSayi2);


    }
}
