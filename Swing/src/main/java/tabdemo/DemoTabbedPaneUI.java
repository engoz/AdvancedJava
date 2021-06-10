package tabdemo;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;

/**
 * Created by servicium on 30.06.2016.
 */
public class DemoTabbedPaneUI extends BasicTabbedPaneUI {

    private static JTabbedPane pane;

    public static ComponentUI createUI(JComponent c) {
        pane = (JTabbedPane) c;
        return new DemoTabbedPaneUI();
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

}

