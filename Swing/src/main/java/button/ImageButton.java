package button;

import util.Util;

import javax.swing.*;
import java.awt.*;

/**
 * Created by enginoz on 28/02/17.
 */
public class ImageButton extends JButton {

    private static final long serialVersionUID = 7080301328826829192L;
    private final Point textStartPoint;
    private String text;

    public ImageButton() {
        this(null, null, null);
    }

    public ImageButton(String icon) {
        this(icon, null, null);
    }

    public ImageButton(String icon, String text) {
        this(icon, text, null);
    }

    public ImageButton(String icon, String text, Point textStartPoint) {
        this.text = text;
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        this.textStartPoint = textStartPoint;
        if (icon != null) {
            changeIcon(icon);
        }
        setFocusPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public void changeIcon(String icon) {
        ImageIcon imageIcon = Util.Images.getImageIcon(icon);
        if (imageIcon != null) {
            setIcon(imageIcon);
            imageIcon = Util.Images.getImageIcon(icon, Util.Images.ImageType.HOVER);
            if (imageIcon != null) {
                setRolloverEnabled(true);
                setRolloverIcon(imageIcon);
            }
            imageIcon = Util.Images.getImageIcon(icon, Util.Images.ImageType.CLICKED);
            if (imageIcon != null) {
                setPressedIcon(imageIcon);
            }
            imageIcon = Util.Images.getImageIcon(icon, Util.Images.ImageType.DISABLED);
            if (imageIcon != null) {
                setDisabledIcon(imageIcon);
            }
        }
    }

    public void changeIcon(String icon, String text) {
        this.text = text;
        ImageIcon imageIcon = Util.Images.getImageIcon(icon);
        if (imageIcon != null) {
            setIcon(imageIcon);
            imageIcon = Util.Images.getImageIcon(icon, Util.Images.ImageType.HOVER);
            if (imageIcon != null) {
                setRolloverEnabled(true);
                setRolloverIcon(imageIcon);
            }
            imageIcon = Util.Images.getImageIcon(icon, Util.Images.ImageType.CLICKED);
            if (imageIcon != null) {
                setPressedIcon(imageIcon);
            }
            imageIcon = Util.Images.getImageIcon(icon, Util.Images.ImageType.DISABLED);
            if (imageIcon != null) {
                setDisabledIcon(imageIcon);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (text != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(getForeground());
            g2d.setFont(getFont());
            int x, y;
            if (textStartPoint != null) {
                x = textStartPoint.x;
                y = textStartPoint.y;
            } else {
                FontMetrics fontMetrics = g2d.getFontMetrics();
                int height = fontMetrics.getAscent();
                int i = fontMetrics.stringWidth(text);
                x = (getWidth() - i) / 2;
                y = (getHeight() - height) / 2 + height;
            }
            g2d.drawString(text, x, y);
            g2d.dispose();
        }
    }
}

