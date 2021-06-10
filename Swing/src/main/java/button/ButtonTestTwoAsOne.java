package button;

/**
 * Created by servicium on 29.01.2016.
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonTestTwoAsOne
        extends JFrame
        implements MouseListener {
    JButton b = new JButton("Press me twice");
    static long oldctm = System.currentTimeMillis();
    final int maxDoubleTime = 1000;

    ActionListener waitOneClickCount = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            System.out.println(String.valueOf(System.currentTimeMillis() - oldctm) +
                    " oneShot timeout - single click action here");
        }
    };
    Timer oneShot = new Timer(maxDoubleTime, waitOneClickCount);


    ButtonTestTwoAsOne() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(b);
        b.addMouseListener(this);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void mousePressed(MouseEvent me) {
        long ctm = System.currentTimeMillis();
        long dif_ctm = ctm - oldctm;
        int clickCount = me.getClickCount();
        String ps = me.paramString();
        System.out.println("ctm=" + ctm + ", dif=" + dif_ctm +
                ", clickCount=" + clickCount);
        if ((dif_ctm < maxDoubleTime) || (clickCount > 1)) {
            System.out.println("Double click detected");
            oneShot.stop();
        } else {
            System.out.println("Single click detected - oneShot started");
            oneShot.setRepeats(false);
            oneShot.start();
        }
        oldctm = ctm;
    }

    public void mouseExited(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
    }

    public void mouseClicked(MouseEvent me) {
    }

    public void mouseReleased(MouseEvent me) {
    }


    public static void main(String[] args) {
        new ButtonTestTwoAsOne();
    }
}