package tabUI;

import util.Util;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import javax.swing.plaf.TabbedPaneUI;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class TabbedPaneDemo extends JFrame
        implements ActionListener {
    private ImageIcon m_tabimage;
    private ImageIcon m_utsguy;
    private ImageIcon m_jfcgirl;
    private ImageIcon m_sbeguy;
    private ImageIcon m_tiger;
    private ImageTabbedPane m_tabbedPane;
    private JButton m_topButton;
    private JButton m_bottomButton;
    private JButton m_leftButton;
    private JButton m_rightButton;
    private JButton m_addButton;
    private JButton m_removeButton;
    private JLabel m_status;
    private JLabel m_loading;


    public TabbedPaneDemo() {
        init();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TabbedPaneDemo();
            }
        });
    }

    public void init() {

        m_tabimage = Util.getTabIcon(this, "tabimage.gif");
        m_utsguy = Util.getTabIcon(this, "utsguy.gif");
        m_jfcgirl = Util.getTabIcon(this, "jfcgirl.gif");
        m_sbeguy = Util.getTabIcon(this, "sbeguy.gif");
        m_tiger = Util.getTabIcon(this, "tiger.gif");
        m_tabbedPane = new ImageTabbedPane(
                Util.getTabIcon(this, "bloo.gif"),
                Util.getTabIcon(this, "bubbles.jpg"));
        m_topButton = new JButton("TOP");
        m_bottomButton = new JButton("BOTTOM");
        m_leftButton = new JButton("LEFT");
        m_rightButton = new JButton("RIGHT");
        m_addButton = new JButton("add");
        m_removeButton = new JButton("remove");
        m_status = new JLabel();

        Color buttonColor = new Color(245, 242, 219);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 6));
        JPanel lowerPanel = new JPanel();
        lowerPanel.setLayout(new BorderLayout());

        m_topButton.setBackground(buttonColor);
        m_bottomButton.setBackground(buttonColor);
        m_leftButton.setBackground(buttonColor);
        m_rightButton.setBackground(buttonColor);
        m_addButton.setBackground(buttonColor);
        m_removeButton.setBackground(buttonColor);
        m_topButton.addActionListener(TabbedPaneDemo.this);
        m_bottomButton.addActionListener(TabbedPaneDemo.this);
        m_leftButton.addActionListener(TabbedPaneDemo.this);
        m_rightButton.addActionListener(TabbedPaneDemo.this);
        m_addButton.addActionListener(TabbedPaneDemo.this);
        m_removeButton.addActionListener(TabbedPaneDemo.this);

        buttonPanel.add(m_topButton);
        buttonPanel.add(m_bottomButton);
        buttonPanel.add(m_leftButton);
        buttonPanel.add(m_rightButton);
        buttonPanel.add(m_addButton);
        buttonPanel.add(m_removeButton);
        buttonPanel.setBackground(buttonColor);
        buttonPanel.setOpaque(true);
        buttonPanel.setBorder(new CompoundBorder(
                new EtchedBorder(EtchedBorder.RAISED),
                new EtchedBorder(EtchedBorder.LOWERED)));

        lowerPanel.add("Center", buttonPanel);
        m_status.setHorizontalTextPosition(SwingConstants.LEFT);
        m_status.setOpaque(true);
        m_status.setBackground(buttonColor);
        m_status.setForeground(Color.black);
        lowerPanel.add("South", m_status);

        createTab();
        createTab();
        createTab();
        createTab();

        getContentPane().setLayout(new BorderLayout());
        m_tabbedPane.setBackground(new Color(245, 232, 219));
        m_tabbedPane.setOpaque(true);
        getContentPane().add("South", lowerPanel);
        getContentPane().add("Center", m_tabbedPane);
        m_tabbedPane.addChangeListener(new MyChangeListener());


        getRootPane().revalidate();
        getRootPane().repaint();

    }

    public void createTab() {
        JLabel label = null;
        switch (m_tabbedPane.getTabCount() % 4) {
            case 0:
                label = new JLabel("Tab #" + m_tabbedPane.getTabCount(),
                        m_utsguy, SwingConstants.CENTER);
                break;
            case 1:
                label = new JLabel("Tab #" + m_tabbedPane.getTabCount(),
                        m_jfcgirl, SwingConstants.CENTER);
                break;
            case 2:
                label = new JLabel("Tab #" + m_tabbedPane.getTabCount(),
                        m_sbeguy, SwingConstants.CENTER);
                break;
            case 3:
                label = new JLabel("Tab #" + m_tabbedPane.getTabCount(),
                        m_tiger, SwingConstants.CENTER);
                break;
        }
        label.setVerticalTextPosition(SwingConstants.BOTTOM);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.white);
        m_tabbedPane.addTab("Tab #" + m_tabbedPane.getTabCount(),
                m_tabimage, label);
        m_tabbedPane.setForegroundAt(m_tabbedPane.getTabCount() - 1,
                Color.white);
        m_tabbedPane.setSelectedIndex(m_tabbedPane.getTabCount() - 1);
        setStatus(m_tabbedPane.getSelectedIndex());
    }

    public void killTab() {
        if (m_tabbedPane.getTabCount() > 0) {
            m_tabbedPane.removeTabAt(m_tabbedPane.getTabCount() - 1);
            setStatus(m_tabbedPane.getSelectedIndex());
        } else
            setStatus(-1);
    }

    public void setStatus(int index) {
        if (index > -1)
            m_status.setText(" Selected Tab: " + index);
        else
            m_status.setText(" No Tab Selected");
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == m_topButton) {
            m_tabbedPane.setTabPlacement(SwingConstants.TOP);
        } else if (e.getSource() == m_bottomButton) {
            m_tabbedPane.setTabPlacement(SwingConstants.BOTTOM);
        } else if (e.getSource() == m_leftButton) {
            m_tabbedPane.setTabPlacement(SwingConstants.LEFT);
        } else if (e.getSource() == m_rightButton) {
            m_tabbedPane.setTabPlacement(SwingConstants.RIGHT);
        } else if (e.getSource() == m_addButton)
            createTab();
        else if (e.getSource() == m_removeButton)
            killTab();
        m_tabbedPane.revalidate();
        m_tabbedPane.repaint();
    }


    class MyChangeListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            setStatus(
                    ((JTabbedPane) e.getSource()).getSelectedIndex());
        }
    }
}

class ImageTabbedPane extends JTabbedPane {
    // Display properties
    private Image m_tabBackground;
    private Image m_paneBackground;

    public ImageTabbedPane(ImageIcon tabBackground,
                           ImageIcon paneBackground) {
        m_tabBackground = tabBackground.getImage();
        m_paneBackground = paneBackground.getImage();
        setUI((ImageTabbedPaneUI) ImageTabbedPaneUI.createUI(this));
    }

    public void setTabBackground(Image i) {
        m_tabBackground = i;
    }

    public void setPaneBackground(Image i) {
        m_paneBackground = i;
    }

    public Image getTabBackground() {
        return m_tabBackground;
    }

    public Image getPaneBackground() {
        return m_paneBackground;
    }
}

class ImageTabbedPaneUI extends BasicTabbedPaneUI {
    private Image m_image;

    public static ComponentUI createUI(JComponent c) {
        return new ImageTabbedPaneUI();
    }

    public void update(Graphics g, JComponent c) {
        if (c instanceof ImageTabbedPane) {
            Image paneImage = ((ImageTabbedPane) c).getPaneBackground();
            int w = c.getWidth();
            int h = c.getHeight();
            int iw = paneImage.getWidth(tabPane);
            int ih = paneImage.getHeight(tabPane);
            if (iw > 0 && ih > 0) {
                for (int j = 0; j < h; j += ih) {
                    for (int i = 0; i < w; i += iw) {
                        g.drawImage(paneImage, i, j, tabPane);
                    }
                }
            }
        }
        paint(g, c);
    }

    public void paint(Graphics g, JComponent c) {
        if (c instanceof ImageTabbedPane)
            m_image = ((ImageTabbedPane) c).getTabBackground();
        super.paint(g, c);
    }

    protected void paintTabBackground(Graphics g, int tabPlacement,
                                      int tabIndex, int x, int y, int w, int h, boolean isSelected) {
        Color tp = tabPane.getBackgroundAt(tabIndex);
        switch (tabPlacement) {
            case LEFT:
                g.drawImage(m_image, x + 1, y + 1, (w - 2) + (x + 1), (y + 1) + (h - 3),
                        0, 0, w, h, tp, tabPane);
                break;
            case RIGHT:
                g.drawImage(m_image, x, y + 1, (w - 2) + (x), (y + 1) + (h - 3),
                        0, 0, w, h, tp, tabPane);
                break;
            case BOTTOM:
                g.drawImage(m_image, x + 1, y, (w - 3) + (x + 1), (y) + (h - 1),
                        0, 0, w, h, tp, tabPane);
                break;
            case TOP:
                g.drawImage(m_image, x + 1, y + 1, (w - 3) + (x + 1), (y + 1) + (h - 1),
                        0, 0, w, h, tp, tabPane);
        }
    }
}