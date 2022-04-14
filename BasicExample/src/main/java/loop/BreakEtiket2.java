package loop;

/**
 * Created by servicium on 22.11.2016.
 */
public class BreakEtiket2 {
    public static void main (String[] args){

        etiket:
        for(int x=0;x<8;x++){
            for(int y=0;y<=10;y++){
                if(y==8)
                    break etiket; //Eğer y değeri 8 olursa etiket ifadesinin altındaki döngüyü bırak git.
                System.out.println("y :" + y); //y değeri 8 olduğu anda döngü bırakıldığı için bu koda program akışı gelmedi.
            }
            System.out.println("Donguden cikildi");
            System.out.println("x : " + x);
        }
    }
}
