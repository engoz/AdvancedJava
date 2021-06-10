package editor;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

/**
 * Created by servicium on 20.07.2016.
 */
public class SearchHTML {
    public static void main(String args[]) throws Exception {
        URL url = SearchHTML.class.getResource("/index.html");
        URLConnection connection = url.openConnection();
        InputStream is = connection.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        HTMLEditorKit htmlKit = new HTMLEditorKit();
        HTMLDocument htmlDoc = (HTMLDocument) htmlKit.createDefaultDocument();
        HTMLEditorKit.Parser parser = new ParserDelegator();
        HTMLEditorKit.ParserCallback callback = htmlDoc.getReader(0);
        parser.parse(br, callback, true);

        for (HTMLDocument.Iterator iterator = htmlDoc.getIterator(HTML.Tag.HTML); iterator.isValid(); iterator
                .next()) {
            AttributeSet attributes = iterator.getAttributes();
            String srcString = (String) attributes.getAttribute(HTML.Tag.P);
            System.out.print(srcString);
            int startOffset = iterator.getStartOffset();
            int endOffset = iterator.getEndOffset();
            int length = endOffset - startOffset;
            String text = htmlDoc.getText(startOffset, length);
            System.out.println(" Test " + text);
        }
    }
}
