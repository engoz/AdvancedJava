package editor;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.ArrayList;

import javax.swing.text.html.parser.ParserDelegator;
import javax.swing.text.html.HTMLEditorKit.ParserCallback;
import javax.swing.text.html.HTML.Tag;
import javax.swing.text.MutableAttributeSet;

/**
 * Created by servicium on 21.07.2016.
 */
public class HTMLUtils {
    private HTMLUtils() {
    }

    public static List<String> extractText(Reader reader) throws IOException {
        final ArrayList<String> list = new ArrayList<String>();

        ParserDelegator parserDelegator = new ParserDelegator();
        ParserCallback parserCallback = new ParserCallback() {
            public void handleText(final char[] data, final int pos) {
                list.add(new String(data));
            }

            public void handleStartTag(Tag tag, MutableAttributeSet attribute, int pos) {
            }

            public void handleEndTag(Tag t, final int pos) {
            }

            public void handleSimpleTag(Tag t, MutableAttributeSet a, final int pos) {
            }

            public void handleComment(final char[] data, final int pos) {
            }

            public void handleError(final String errMsg, final int pos) {
            }
        };
        parserDelegator.parse(reader, parserCallback, true);
        return list;
    }

    public final static void main(String[] args) throws Exception {
        URL url = SearchHTML.class.getResource("/index.html");
        URLConnection connection = url.openConnection();
        InputStream is = connection.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        List<String> lines = HTMLUtils.extractText(isr);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
