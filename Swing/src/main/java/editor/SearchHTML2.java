package editor;

/**
 * Created by servicium on 20.07.2016.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.text.*;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;


public class SearchHTML2 {
    public static void main(String[] args) throws IOException, BadLocationException {
        URL url = SearchHTML2.class.getResource("/index.html");
        URLConnection connection = url.openConnection();
        InputStream is = connection.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        HTMLEditorKit htmlKit = new HTMLEditorKit();
        HTMLDocument htmlDoc = (HTMLDocument) htmlKit.createDefaultDocument();
        HTMLEditorKit.Parser parser = new ParserDelegator();
        HTMLEditorKit.ParserCallback callback = htmlDoc.getReader(0);
        parser.parse(br, callback, true);

        Element element;
        ElementIterator iterator = new ElementIterator(htmlDoc);
        while ((element = iterator.next()) != null) {
            AttributeSet attributes = element.getAttributes();
            Object name = attributes.getAttribute(StyleConstants.NameAttribute);

            if ((name == HTML.Tag.P)) {
                int count = element.getElementCount();
                for (int i = 0; i < count; i++) {
                    Element child = element.getElement(i);
                    AttributeSet childAttributes = child.getAttributes();
                    if (childAttributes.getAttribute(StyleConstants.NameAttribute) == HTML.Tag.CONTENT) {
                        int startOffset = child.getStartOffset();
                        int endOffset = child.getEndOffset();
                        int length = endOffset - startOffset;
                        System.out.println(htmlDoc.getText(startOffset, length));
                    }
                }
            }
        }
    }
}
