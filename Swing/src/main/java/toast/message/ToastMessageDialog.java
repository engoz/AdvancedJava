package toast.message;

/**
 * Created by enginoz on 28/02/17.
 */

import button.ImageButton;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.List;
import java.util.concurrent.*;


/**
 * Created by enginoz on 17/02/17.
 */
public abstract class ToastMessageDialog extends JDialog {

    //private static final int DURATION_SECONDS = UIManager.getInt("Toast.DisplayTime");
    private static final int DURATION_SECONDS = 5;
    private final float MAX_OPACITY = 0.8f;
    private final float OPACITY_INCREMENT = 0.05f;
    private final int FADE_REFRESH_RATE = 20;


    protected String title, content;
    protected ImageIcon typeIcon;
    protected Image backImage;
    protected JLayeredPane contentPane;
    private final static Dimension dialogSize = new Dimension(352, 68);
    private static final Font FONT = new Font("Arial", Font.PLAIN, 13);
    private static final Color FONT_COLOR = Color.decode("#FFFFFF");
    private int duration;
    private boolean move = false;
    private Point moveUpPoint;
    private List<ToastMessageDialog> queue;


    protected ToastMessageDialog(String title, String content) {
        this.title = title;
        this.content = content;
        queue = ToastMessageManager.getToastMessageQueue();
        duration = DURATION_SECONDS * 1000;
        initImage();
        setPreferredSize(dialogSize);
        setSize(dialogSize);
        setMaximumSize(dialogSize);
        setMinimumSize(dialogSize);
        setAlwaysOnTop(true);
        setUndecorated(true);
        Shape shape = new RoundRectangle2D.Double(0, 0, dialogSize.width, dialogSize.height, 3, 3);
        setShape(shape);
        setLayout(null);
        initContnets();

    }


    protected abstract void initImage();

    private void initContnets() {
        contentPane = new JLayeredPane() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backImage, 0, 0, null);
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
            private float opacity = MAX_OPACITY;


            @Override
            public void actionPerformed(ActionEvent e) {
                opacity -= OPACITY_INCREMENT;
                setOpacity(Math.max(opacity, 0));
                if (opacity <= 0) {
                    timer.stop();
                    setVisible(false);
                    dispose();
                }
            }
        });

        setOpacity(MAX_OPACITY);
        timer.start();
    }

    @Override
    public void dispose() {
        super.dispose();
        queue.remove(this);
    }


    protected void fadeAction() {
        final Timer timer = new Timer(1, null);
        timer.addActionListener(new ActionListener() {
            private int wait = 0;

            @Override
            public void actionPerformed(ActionEvent e) {

                if (wait < duration) {
                    wait++;
                } else {
                    timer.stop();
                    fadeOut();
                }
            }
        });

        timer.start();
    }


    protected void moveWorker(Point moveUpPoint) {
        final CountDownLatch latch = new CountDownLatch(1);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                Point oldPoint = getLocation();
                final Timer timer = new Timer(1000 / 60, null);
                timer.addActionListener(new ActionListener() {
                    private int y = oldPoint.y;
                    private int nY = moveUpPoint.y;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (y < nY) {
                            timer.stop();
                            fadeAction();
                            latch.countDown();
                            queue.add(getToastMessage());
                        } else {
                            y = y - 5;
                            setLocation(moveUpPoint.x, y);
                        }
                    }
                });
                timer.start();
            }
        });

        t.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    protected void moveUp(Point point) {
        Point oldPoint = getLocation();
        final Timer timer = new Timer(1000 / 60, null);
        timer.addActionListener(new ActionListener() {
            private int y = oldPoint.y;
            private int nY = point.y;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (y < nY) {
                    timer.stop();
                    fadeAction();
                    move = true;
                } else {
                    y = y - 5;
                    setLocation(point.x, y);
                }
            }
        });
        timer.start();
    }

    private ToastMessageDialog getToastMessage() {
        return this;
    }

}
