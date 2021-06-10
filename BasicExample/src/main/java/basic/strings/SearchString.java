package basic.strings;

/**
 * Created by servicium on 20.07.2016.
 */
public class SearchString {
    public static void main(String[] args) {
        String text = "irek";
        String pat = "Direk İşlem Penceresi";
        System.out.println(search(pat, text));

    }

    public static int search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++)
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;
            if (j == M) return i; // found
        }
        return N; // not found
    }
}
