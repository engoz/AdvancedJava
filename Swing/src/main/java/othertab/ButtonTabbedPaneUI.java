package othertab;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;

/**
 * Created by enginoz on 6/30/16.
 */
public class ButtonTabbedPaneUI extends BasicTabbedPaneUI {

    private static Image backImage;
    private static Image selectImage;

    public static ComponentUI createUI(JComponent c, Image back, Image select) {
        if (c instanceof JTabbedPane) {
            backImage = back;
            selectImage = select;
        }
        return new ButtonTabbedPaneUI();
    }


    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(g, c);
    }

    @Override
    protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
        return backImage.getHeight(tabPane);
    }

    @Override
    protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
        return backImage.getWidth(tabPane);
    }

    @Override
    protected Insets getContentBorderInsets(final int tabPlacement) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    protected Insets getSelectedTabPadInsets(int tabPlacement) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    protected Insets getTabInsets(int tabPlacement, int tabIndex) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
        Color tp = tabPane.getBackgroundAt(tabIndex);
        switch (tabPlacement) {
            case TOP:
                if (isSelected)
                    g.drawImage(selectImage, x + 1, y + 1, (w - 3) + (x + 1), (y + 1) + (h - 1),
                            0, 0, w, h, tp, tabPane);
                else
                    g.drawImage(backImage, x + 1, y + 1, (w - 3) + (x + 1), (y + 1) + (h - 1),
                            0, 0, w, h, tp, tabPane);
        }
    }
}
