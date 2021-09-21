package loop;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by servicium on 07.11.2016.
 */
public class SwitchCase2 {
    public static void main(String args[]) throws IOException {
        Scanner giris = new Scanner(System.in);
        int i;

        System.out.println("Portakal Turizm A.S. Sunar");
        System.out.println("(1) Orta Avrupa Turu");
        System.out.println("(2) Amerika Turu");
        System.out.println("(3) Uzak Dogu Turu");
        System.out.println("Seciminiz?");
        i = giris.nextInt();

        switch (i) {
            case 1 :
                System.out.println("Ucak ile Viyana, Budapeste, Prag");
                System.out.println("4 yildizli otellerde sok! 1700$\n");
                break;

            case 2 :
                System.out.println("Ozel ucak ile New York, Boston, Los Angeles");
                System.out.println("5 yildizli otellerde sok! 3700$\n");
                break;

            case 3 :
                System.out.println("Ozel ucak ile Bang Kong, Hong Kong");
                System.out.println("Tokyo, Pekin");
                System.out.println("5 yildizli otellerde sok! 4000$\n");
                break;

            default :
                System.out.println("Hatali secim! 1, 2 veya 3 girilmeli");
                break;
        }
    }
}
