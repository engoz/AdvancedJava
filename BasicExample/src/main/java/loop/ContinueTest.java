package loop;

/**
 * Created by servicium on 09.07.2016.
 */
public class ContinueTest {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(j==2){
                    continue;
                }
                System.out.println("i ="+i+", j= "+j);
            }
        }
    }
}
