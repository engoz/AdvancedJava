package tab;

import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;

/**
 * Created by servicium on 16.06.2016.
 */
public class PSTabbedPaneUI extends BasicTabbedPaneUI {
    protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
        g.setColor(Color.BLUE);
        g.drawLine(x, y, x, y + h);
        g.drawLine(x, y, x + w - (h / 2), y);
        g.drawLine(x + w - (h / 2), y, x + w + (h / 2), y + h);

        if (isSelected) {
            g.setColor(Color.RED);
            g.drawLine(x + 1, y + 1, x + 1, y + h);
            g.drawLine(x + 1, y + 1, x + w - (h / 2), y + 1);

            g.setColor(shadow);
            g.drawLine(x + w - (h / 2), y + 1, x + w + (h / 2) - 1, y + h);
        }
    }

    protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
        Polygon shape = new Polygon();

        shape.addPoint(x, y + h);
        shape.addPoint(x, y);
        shape.addPoint(x + w - (h / 2), y);

        if (isSelected || (tabIndex == (rects.length - 1))) {
            shape.addPoint(x + w + (h / 2), y + h);
        } else {
            shape.addPoint(x + w, y + (h / 2));
            shape.addPoint(x + w, y + h);
        }

        g.setColor(tabPane.getBackground());
        g.fillPolygon(shape);
    }


    private Font boldFont;
    private FontMetrics boldFontMetrics;
    private Color fillColor;

    protected void installDefaults() {
        super.installDefaults();
        tabAreaInsets.left = 4;
        selectedTabPadInsets = new Insets(0, 0, 0, 0);
        tabInsets = selectedTabPadInsets;


        Color background = tabPane.getBackground();
        fillColor = background.darker();

        boldFont = tabPane.getFont().deriveFont(Font.BOLD);
        boldFontMetrics = tabPane.getFontMetrics(boldFont);
    }

    protected void paintTabArea(Graphics g, int tabPlacement, int selectedIndex) {
        int tw = tabPane.getBounds().width;

        g.setColor(fillColor);
        g.fillRect(0, 0, tw, rects[0].height + 3);

        super.paintTabArea(g, tabPlacement, selectedIndex);
    }

    protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
        int vHeight = fontHeight;
        if (vHeight % 2 > 0) {
            vHeight += 1;
        }
        return vHeight;
    }

    protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
        return super.calculateTabWidth(tabPlacement, tabIndex, metrics) + metrics.getHeight();
    }

    protected int getTabLabelShiftY(int tabPlacement, int tabIndex, boolean isSelected) {
        return 0;
    }

    protected void paintText(Graphics g, int tabPlacement, Font font, FontMetrics metrics, int tabIndex, String title, Rectangle textRect, boolean isSelected) {
        if (isSelected) {
            int vDifference = (int) (boldFontMetrics.getStringBounds(title, g).getWidth()) - textRect.width;
            textRect.x -= (vDifference / 2);
            super.paintText(g, tabPlacement, boldFont, boldFontMetrics, tabIndex, title, textRect, isSelected);
        } else {
            super.paintText(g, tabPlacement, font, metrics, tabIndex, title, textRect, isSelected);
        }
    }

    protected void paintContentBorderTopEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {
        // Do nothing
    }

    protected void paintContentBorderRightEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {
// Do nothing
    }

    protected void paintContentBorderLeftEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {
// Do nothing
    }

    protected void paintContentBorderBottomEdge(Graphics g, int tabPlacement, int selectedIndex, int x, int y, int w, int h) {
// Do nothing
    }

    protected Insets getContentBorderInsets(int tabPlacement) {
        return new Insets(2, 0, 0, 0);
    }
}
