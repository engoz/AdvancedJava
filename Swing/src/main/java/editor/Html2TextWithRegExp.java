package editor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by servicium on 21.07.2016.
 */
public class Html2TextWithRegExp {
    private Html2TextWithRegExp() {
    }

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        URL url = SearchHTML.class.getResource("/index.html");
        URLConnection connection = url.openConnection();
        InputStream is = connection.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        //BufferedReader br = new BufferedReader(new FileReader("java-new.html"));
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
            // or
            //  sb.append(line).append(System.getProperty("line.separator"));
        }
        String nohtml = sb.toString().replaceAll("\\<.*?>", "");
        String[] html = nohtml.split("\\s+");
        String test = "D.İşlem";
        String find = unicodeBul(test);
        System.out.println(find);
        byte[] find2 = test.getBytes("ISO8859-9");
        for (String s : html) {
            byte[] unicode = s.getBytes("ISO8859-9");
            if (unicode.equals(find2)) {
                System.out.println(find2.toString());
            }

        }
        //System.out.println(nohtml);
    }

    public static String unicodeBul(String kelime) {

        char[] ac = kelime.toCharArray();
        int iValue;
        String s = null;
        StringBuffer sb = new StringBuffer();

        for (int ndx = 0; ndx < ac.length; ndx++) {
            iValue = ac[ndx];

            if (iValue < 0x10) {
                s = "\\u000";
            } else if (iValue < 0x100) {
                s = "\\u00";
            } else if (iValue < 0x1000) {
                s = "\\u0";
            }

            sb.append(s + Integer.toHexString(iValue));
        } // end for
        return sb.toString();

    }

}
