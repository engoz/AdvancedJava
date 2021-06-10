package myTab;

import util.ImageButton;
import util.Util;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;

/**
 * Created by servicium on 28.06.2016.
 */
public class TabDemo extends JFrame {

    private ImageIcon tabimage;
    private ImageIcon tabBack;
    private ImageIcon tabBackSelected;
    private MyTabbedPane tabbedPane;


    public TabDemo() {
        init();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(800, 800));
        setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TabDemo();
            }
        });
    }

    private void init() {
        tabimage = Util.getCommonIcon(this, "ArrowTab.png");
        tabBack = Util.getCommonIcon(this, "BottomTab.png");
        tabBackSelected = Util.getCommonIcon(this, "BottomTabSelected2.png");

        tabbedPane = new MyTabbedPane(
                tabBack,
                tabBackSelected);

        createTab();
        createTab();
        createTab();
        createTab();

        getContentPane().add("Center", tabbedPane);
    }

    public void createTab() {
        JLabel label = null;
        switch (tabbedPane.getTabCount() % 4) {
            case 0:
                label = new JLabel("Tab #" + tabbedPane.getTabCount(),
                        SwingConstants.CENTER);
                break;
            case 1:
                label = new JLabel("Tab #" + tabbedPane.getTabCount(),
                        SwingConstants.CENTER);
                break;
            case 2:
                label = new JLabel("Tab #" + tabbedPane.getTabCount(),
                        SwingConstants.CENTER);
                break;
            case 3:
                label = new JLabel("Tab #" + tabbedPane.getTabCount(),
                        SwingConstants.CENTER);
                break;
        }
        label.setVerticalTextPosition(SwingConstants.BOTTOM);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.white);
        tabbedPane.addTab("Tab #" + tabbedPane.getTabCount(),
                tabimage, label);
        tabbedPane.setForegroundAt(tabbedPane.getTabCount() - 1,
                Color.white);
        tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);
        System.out.println(tabbedPane.getSelectedIndex());
    }
}


class MyTabbedPane extends JTabbedPane {

    private Image tabBackgroundImage;
    private Image tabSelectedImage;
    private Icon lastIcon = Util.getCommonIcon(this, "AddTab.png");
    private Image lastSelectedIcon = Util.getCommonIcon(this, "AddTab-H.png").getImage();
    private JLayeredPane pane;

    public MyTabbedPane(ImageIcon backgroud, ImageIcon selected) {
        tabBackgroundImage = backgroud.getImage();
        tabSelectedImage = selected.getImage();
        setLayout(null);
        setBackground(Color.BLUE);
        setUI((MyTabbedPaneUI) MyTabbedPaneUI.createUI(this));
        add(new Label("Test"), lastIcon, getTabCount());
    }

    public Image getTabBackgroundImage() {
        return tabBackgroundImage;
    }

    public void setTabBackgroundImage(Image tabBackgroundImage) {
        this.tabBackgroundImage = tabBackgroundImage;
    }

    public Image getTabSelectedImage() {
        return tabSelectedImage;
    }

    public void setTabSelectedImage(Image tabSelectedImage) {
        this.tabSelectedImage = tabSelectedImage;
    }


    public Image getLastSelectedIcon() {
        return lastSelectedIcon;
    }

    public void setLastSelectedIcon(Image lastSelectedIcon) {
        this.lastSelectedIcon = lastSelectedIcon;
    }

    @Override
    public Dimension getSize() {
        return new Dimension(getTabBackgroundImage().getWidth(this) * getTabCount() + 100, getTabBackgroundImage().getHeight(this));
    }


}

class MyTabbedPaneUI extends BasicTabbedPaneUI {
    private static Image back;
    private static Image select;
    private static Image last;
    private static Image lastSelected;
    private static ImageButton button = new ImageButton("Common/AddTab");


    public static ComponentUI createUI(JComponent c) {
        if (c instanceof MyTabbedPane) {
            back = ((MyTabbedPane) c).getTabBackgroundImage();
            select = ((MyTabbedPane) c).getTabSelectedImage();
        }
        return new MyTabbedPaneUI();
    }

    public MyTabbedPaneUI() {

    }


    @Override
    public Dimension getMaximumSize(JComponent c) {
        return super.getPreferredSize(c);
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        if (c instanceof MyTabbedPane) {
            int tabCount = ((MyTabbedPane) c).getTabCount();
            int width = tabCount * back.getWidth(tabPane);
            int height = tabCount * back.getHeight(tabPane);
            return new Dimension(width + 100, height);
        }
        return super.getPreferredSize(c);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(g, c);
    }


    @Override
    protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
        return back.getHeight(tabPane);
    }

    @Override
    protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
        return back.getWidth(tabPane);
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
                    g.drawImage(select, x + 1, y + 1, (w - 3) + (x + 1), (y + 1) + (h - 1),
                            0, 0, w, h, null, tabPane);
                else
                    g.drawImage(back, x + 1, y + 1, (w - 3) + (x + 1), (y + 1) + (h - 1),
                            0, 0, w, h, null, tabPane);
        }
    }

}
