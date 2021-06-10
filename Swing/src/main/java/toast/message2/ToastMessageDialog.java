package toast.message2;


import button.ImageButton;

import javax.swing.*;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by enginoz on 17/02/17.
 */
public abstract class ToastMessageDialog extends JInternalFrame {

    //private static final int DURATION_SECONDS = UIManager.getInt("Toast.DisplayTime");
    private static final int DURATION_SECONDS = 30;
    private final float MAX_OPACITY = 0.8f;
    private final float OPACITY_INCREMENT = 0.05f;
    private final int FADE_REFRESH_RATE = 20;


    protected String title, content;
    protected ImageIcon typeIcon;
    protected Image backImage;
    protected JLayeredPane contentPane;
    private ToastMessageManager manager = ToastMessageManager.getInstance();
    private final static Dimension dialogSize = new Dimension(352, 68);
    private final int DISTANCE_FROM_PARENT_RIGHT = 120;
    private Point point;
    private static final Font FONT = new Font("Arial", Font.PLAIN, 13);
    private static final Color FONT_COLOR = Color.decode("#FFFFFF");
    private int duration = 0;
    private float alpha = 1f;

    protected ToastMessageDialog(String title, String content) {
        this.title = title;
        this.content = content;
        Point parentPoint = ToastMessageTest.getContainer().getLocationOnScreen();
        Dimension parentSize = ToastMessageTest.getContainer().getSize();
        duration = DURATION_SECONDS * 1000;
        initImage();
        setPreferredSize(dialogSize);
        setSize(dialogSize);
        setMaximumSize(dialogSize);
        setMinimumSize(dialogSize);
        setPoint(parentPoint, parentSize);
        setLayout(null);
        setVisible(false);
        initContnets();
        makeUndecorated();
        addQuee(this);


    }

    private void makeUndecorated() {
        setBorder(null);
        BasicInternalFrameUI ui = (BasicInternalFrameUI) getUI();
        JComponent northPane = ui.getNorthPane();
        if (northPane != null) {
            remove(northPane);
            ui.setNorthPane(null);
        }
    }

    private void addQuee(ToastMessageDialog toastMessageDialog) {
        manager.addQueue(toastMessageDialog);
    }

    protected void setPoint(Point p, Dimension parentSize) {
        int x = (int) (p.getX() + (parentSize.width - this.getSize().width - DISTANCE_FROM_PARENT_RIGHT));
        int y = (int) (p.getY() + parentSize.height - 120);
        point = new Point(x, y);
    }

    protected abstract void initImage();

    private void initContnets() {
        contentPane = new JLayeredPane() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
                g2d.drawImage(backImage, 2, 2, null);
            }
        };
        contentPane.setPreferredSize(dialogSize);
        contentPane.setOpaque(true);
        setContentPane(contentPane);
        //setOpacity(0.4f);

        JButton closeBtn = new ImageButton("Common/ToastClose");
        closeBtn.setBounds(dialogSize.width - 20, 9, 8, 8);
        contentPane.add(closeBtn);

        closeBtn.addActionListener((e) -> {
            fadeOut();
        });

        JLabel typeLbl = new JLabel(typeIcon);
        typeLbl.setSize(28, 32);
        typeLbl.setBounds(18, 22, 28, 32);
        contentPane.add(typeLbl);

        JLabel titleLbl = new JLabel(title);
        titleLbl.setSize(200, 14);
        titleLbl.setFont(FONT);
        titleLbl.setForeground(FONT_COLOR);


        JLabel contentLbl = new JLabel();

        if (content != null && content.contains("\n")) {
            titleLbl.setBounds(77, 12, 200, 14);
            contentLbl.setBounds(77, 26, 270, 14);
            String[] arrayText = content.split("\n");
            contentLbl.setText(arrayText[0]);
            JLabel lbl2 = new JLabel(arrayText[1]);
            lbl2.setFont(FONT);
            lbl2.setForeground(FONT_COLOR);
            lbl2.setBounds(77, 40, 270, 14);
            contentPane.add(lbl2);

        } else {
            titleLbl.setBounds(77, 20, 200, 14);
            contentLbl.setText(content);
            contentLbl.setBounds(77, 36, 270, 14);

        }
        contentPane.add(titleLbl);
        contentLbl.setFont(FONT);
        contentLbl.setForeground(FONT_COLOR);
        contentPane.add(contentLbl);

    }

    protected void fadeOut() {
        final Timer timer = new Timer(FADE_REFRESH_RATE, null);
        timer.setRepeats(true);
        timer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alpha += -0.05f;
                if (alpha <= 0) {
                    alpha = 0;
                    timer.stop();
                    contentPane.repaint();
                    setVisible(false);
                    dispose();
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    public void dispose() {
        super.dispose();
        manager.removeQueue(this);
    }

    public void showMessage() {
        SwingWorker worker = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                setLocation(point);
                setVisible(true);
                startUp();
                fadeAction();
                return null;
            }
        };
        worker.execute();
    }

    protected void startUp() {
        final Timer timer = new Timer(1000 / 60, null);
        timer.setRepeats(true);
        timer.addActionListener(new ActionListener() {
            Point point = getPoint();
            int y = point.y;
            int nY = point.y - 70;

            @Override
            public void actionPerformed(ActionEvent e) {

                if (y < nY) {
                    timer.stop();
                    manager.removeHeadQueue(getInstance());
                } else {
                    y = y - 5;
                    setBounds(new Rectangle(new Point(point.x, y), dialogSize));
                }

            }
        });

        timer.start();
    }

    private ToastMessageDialog getInstance() {
        return this;
    }

    public void moveUp(Point newPoint) {
        SwingWorker worker = new SwingWorker() {
            Point oldPoint = getLocationOnScreen();

            @Override
            protected Object doInBackground() throws Exception {

                final Timer timer = new Timer(1000 / 60, null);
                timer.addActionListener(new ActionListener() {
                    private int y = oldPoint.y;
                    private int nY = newPoint.y;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (y < nY) {
                            timer.stop();

                        } else {
                            y = y - 5;
                            setBounds(new Rectangle(new Point(newPoint.x, y), dialogSize));
                        }
                    }
                });
                timer.start();
                return null;
            }
        };
        worker.execute();
    }


    protected void fadeAction() {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fadeOut();
    }

    public Point getPoint() {
        return point;
    }
}
