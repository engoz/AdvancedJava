package font;

import java.awt.*;
import java.io.File;

/**
 * Created by servicium on 22.11.2016.
 */
public class AllFont {
    public static void main(String[] a) {
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts = e.getAllFonts(); // Get the fonts
        for (Font f : fonts) {
            System.out.println(f.getFontName());
        }
    }
}
