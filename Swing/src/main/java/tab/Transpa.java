package tab;

/**
 * Created by servicium on 16.06.2016.
 */

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Transpa extends JTextPane {
    JTabbedPane jtp;

    public Transpa(JTabbedPane jtp) {
        this.jtp = jtp;
        //this.setOpaque(false);
        this.setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Random r = new Random();
        Color c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
        g.setColor(c);


        //g.fillRect(0,0,getWidth(),getHeight());
        g.fillRect(0, 0, 50, 50);
        g.drawOval(50, 50, 30, 40);
        super.repaint();
    }
}
