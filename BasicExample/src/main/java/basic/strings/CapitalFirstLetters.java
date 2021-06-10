package basic.strings;


/**
 * Created by servicium on 09.12.2016.
 */
public class CapitalFirstLetters {
    public static void main(String[] args) {
        String word = useSplit("it's java, baby!");
        System.out.println(word);
        String word2 = useBuilder("it's java, baby!");
        System.out.println(word2);
        String word3 = useBuffer("it's java, baby!");
        System.out.println(word3);
    }

    public static String useSplit(String word) {
        long baslangic = System.currentTimeMillis();
        String[] wordSplit;
        String wordCapital = "";
        wordSplit = word.split(" ");
        for (int i = 0; i < wordSplit.length; i++) {
            wordCapital += wordSplit[i].substring(0, 1).toUpperCase() + wordSplit[i].substring(1) + " ";
        }
        long bitis = System.currentTimeMillis();
        System.out.println("For : " + (bitis - baslangic));
        return wordCapital;
    }

    public static String useBuffer(String source) {
        long baslangic = System.currentTimeMillis();
        StringBuffer res = new StringBuffer();
        String[] strArr = source.split(" ");
        for (String str : strArr) {
            char[] stringArray = str.trim().toCharArray();
            stringArray[0] = Character.toUpperCase(stringArray[0]);
            str = new String(stringArray);

            res.append(str).append(" ");
        }
        long bitis = System.currentTimeMillis();
        System.out.println("Buffer : " + (bitis - baslangic));
        return res.toString().trim();
    }


    public static String useBuilder(String s) {
        long baslangic = System.currentTimeMillis();
        final StringBuilder result = new StringBuilder(s.length());
        String[] words = s.split("\\s");
        for (int i = 0, l = words.length; i < l; ++i) {
            if (i > 0) result.append(" ");
            result.append(Character.toUpperCase(words[i].charAt(0)))
                    .append(words[i].substring(1));
        }
        long bitis = System.currentTimeMillis();
        System.out.println("Builder : " + (bitis - baslangic));
        return result.toString().trim();

    }


}
