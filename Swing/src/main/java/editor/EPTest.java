package editor;

/**
 * Created by servicium on 19.07.2016.
 * <p>
 * Created by servicium on 19.07.2016.
 */

/**
 * Created by servicium on 19.07.2016.
 */

import java.awt.*;
import java.io.*;
import java.nio.charset.*;
import java.util.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.html.*;

public class EPTest {
    JEditorPane pane;
    HTMLEditorKit kit;

    public EPTest() {
        kit = new HTMLEditorKit();
        pane = new JEditorPane();
        pane.setEditorKit(kit);
        loadWithSetPage();
//        loadWithReader();
    }

    /**
     * works okay with the meta tag in the html file
     * only if the trailing/closing slash is absent
     * ie, this '...>' instead of this '... />'  // edit
     */
    private void loadWithSetPage() {
        try {
            pane.setPage(getClass().getResource("/Help/Arbitrage/index001.html"));
        } catch (IOException ioe) {
            System.err.println("setPage read: " + ioe.getMessage());
        }
    }

    private void loadWithReader() {
        // if the html file does not contain a meta content type statement
        // both of these attempts to read the file work okay
        // 1
        //Charset cs = Charset.forName("ISO-8859-1");  // this works
        //read(cs);                                    // okay

        // 2
        Object o = read();         // okay without meta statement

        if (o instanceof Charset)   // we get here if file has a meta statement
        {
            String name = ((Charset) o).name();
            //System.out.println(o + " is supported = " + Charset.isSupported(name));
            //showAvailableCharsets();
            read((Charset) o);      // cannot get this to work
        } else
            System.out.println("o = " + o.toString());
    }

    private Object read() {
        Reader fin = null;
        try {
            fin = //new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("eptest.html"));
        } catch (FileNotFoundException fnfe) {
            System.err.println("file not found: " + fnfe.getMessage());
            return Boolean.FALSE;
        }
        try {
            System.out.println(((InputStreamReader) fin).getEncoding());
            HTMLDocument doc = (HTMLDocument) pane.getDocument();
            kit.read(fin, doc, 0);
            return Boolean.TRUE;
        } catch (ChangedCharSetException ccse) {
            String s = ccse.getCharSetSpec();
            System.out.println("changed charSet " + s);
            Charset cs = Charset.forName(s.substring(s.indexOf("charset=") + 8));
            System.out.println("cs = " + cs.toString());
            return cs;
        } catch (BadLocationException ble) {
            System.err.println("location: " + ble.getMessage());
            return Boolean.FALSE;
        } catch (IOException ioe) {
            System.err.println("read: " + ioe.getMessage());
            return Boolean.FALSE;
        } finally {
            try {
                fin.close();
            } catch (IOException ioe) {
                System.err.println("close: " + ioe.getMessage());
                return Boolean.FALSE;
            }
        }
    }

    /**
     * all three InputStreamReader constructor forms fail
     * if html file contains a meta statement for content/charset
     * otherwise they seem to work okay
     */
    private void read(Charset cs) {
        Reader fin = null;
        try {
            fin = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("eptest.html"), cs));
        } catch (FileNotFoundException fnfe) {
            System.err.println("file not found: " + fnfe.getMessage());
        }

        try {
            HTMLDocument doc = (HTMLDocument) pane.getDocument();
            kit.read(fin, doc, 0);
        } catch (BadLocationException ble) {
            System.err.println("location: " + ble.getMessage());
        } catch (IOException ioe) {
            System.err.println("read: " + ioe.getMessage());
        } finally {
            try {
                fin.close();
            } catch (IOException ioe) {
                System.err.println("close: " + ioe.getMessage());
            }
        }
    }

    private void showAvailableCharsets() {
        SortedMap<String, Charset> map = Charset.availableCharsets();
        Set<String> keys = map.keySet();
        Iterator it = keys.iterator();
        while (it.hasNext())
            System.out.println((Charset) map.get((String) it.next()));
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new EPTest().pane);
        f.setSize(400, 400);
        f.setLocation(200, 200);
        f.setVisible(true);
    }
}