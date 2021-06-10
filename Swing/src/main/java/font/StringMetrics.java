package font;

import java.awt.*;
import java.awt.font.FontRenderContext;

/**
 * Created by servicium on 30.06.2016.
 */
public class StringMetrics {

    public static void main(String[] args) {
        String string = "2";
// Passing or initializing an instance of Font.
        Font font = new Font("Arial", Font.PLAIN, 14);
        int width = (int) font.getStringBounds(string, new FontRenderContext(font.getTransform(), false, false)).getBounds().getWidth();
        int height = (int) font.getStringBounds(string, new FontRenderContext(font.getTransform(), false, false)).getBounds().getHeight();
        System.out.printf("Width : " + width + " Height : " + height);
    }
}
