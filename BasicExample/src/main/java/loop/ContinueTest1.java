package loop;

/**
 * Created by servicium on 22.11.2016.
 */
public class ContinueTest1 {
    public static void main(String args[]){
        for(int i=0; i<10; i++){
            if(i%2==0)
                /*
                * % operatörü kullanılarak, i’nin çift sayı olup olmadığı kontrol edilir. Eğer i çift sayıysa döngü yeni bir satır yazmadan devam eder.
                * */
                continue;
            else
                System.out.println(i + " ");
        }
    }
}
