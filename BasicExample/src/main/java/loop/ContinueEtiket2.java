package loop;

/**
 * Created by servicium on 22.11.2016.
 */
public class ContinueEtiket2 {
    public static void main (String[] args){
        for(int x=0;x<10;x++){
            if(x==4)
                continue;
            System.out.println("x="+x);
        }

        dongudenDevam:
        for(int y=0;y<3;y++){
            for(int z=0;z<8;z++){
                if(z==5)
                    continue dongudenDevam; //Bundan sonraki adimlara bakma. Etiketin dongusune git.
                System.out.println("z="+z); //Etiketin dongusune gidildiginden aynı z degerleri 3 kere yazilacak.
            }
            System.out.println("bu dongu hep es gecildiginden ekrana bu ifade yazilmaz");
        }
    }
}
