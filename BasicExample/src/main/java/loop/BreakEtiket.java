package loop;

/**
 * Created by servicium on 22.11.2016.
 */
public class BreakEtiket {
    public static void main(String args[]){
        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println("Break oncesi.");
                    if(t) break second; //second blogunun disina git.
                    System.out.println("Burasi calismayacak.");
                }
                System.out.println("Burasida calismayacak.");
            }
            System.out.println("Burasi calisacak. Cunku second blogunun disi.");
        }
    }
}
