package util;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by servicium on 16.06.2016.
 */
public class Util {

    public static ImageIcon getCommonIcon(Container container, String name) {
        String path = "/images/Common/" + name;

        URL url = container.getClass().getResource(path);
        if (url == null) {
            System.err.println("Unable load image" + path);
        }
        ImageIcon imageIcon = new ImageIcon(url);
        return imageIcon;
    }

    public static Image getCommonImage(Container container, String name) {

        String path = "/images/Common/" + name + ".png";
        URL url = container.getClass().getResource(path);
        if (url == null) {
            System.err.println("Unable load image" + path);
        }
        ImageIcon imageIcon = new ImageIcon(url);
        return imageIcon.getImage();
    }

    public static ImageIcon getTabIcon(Container container, String name) {
        String path = "/images/Tab/" + name;

        URL url = container.getClass().getResource(path);
        if (url == null) {
            System.err.println("Unable load image" + path);
        }
        ImageIcon imageIcon = new ImageIcon(url);
        return imageIcon;
    }

    public static final class Images {
        public static ImageIcon getImageIcon(String name) {
            return getImageIcon(name, ImageType.NORMAL);
        }


        public static ImageIcon getImageIcon(String name, ImageType type) {
            ImageIcon icon = null;
            try {
                icon = new ImageIcon(Images.class.getResource("/images/" + name + type.getPostfix() + ".png"));
            } catch (Exception ignore) {
            }
            return icon;
        }


        public enum ImageType {
            NORMAL(""),
            HOVER("-H"),
            CLICKED("-C"),
            DISABLED("-D"),
            SELECTED("-S"),
            ACTIVE(".Active"),
            PASSIVE(".Passive");

            private final String postfix;

            ImageType(String postfix) {
                this.postfix = postfix;
            }

            private String getPostfix() {
                return postfix;
            }

        }
    }

}
