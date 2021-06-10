package worker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

/**
 * Created by enginoz on 04/03/17.
 */
public class Saat extends JFrame {

    private JTextField saatAlani;

    public Saat() {
        setPreferredSize(new Dimension(400, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        saatAlani = new JTextField();
        saatAlani.setEditable(false);
        saatAlani.setSize(100, 20);
        saatAlani.setMinimumSize(new Dimension(100, 20));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(saatAlani);

        this.setContentPane(panel);
        this.pack();
        this.setLocationRelativeTo(null);


        Timer t = new Timer(1000, new SaatListener());
        t.start();

    }

    class SaatListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar simdikiZaman = Calendar.getInstance();
            int saat = simdikiZaman.get(Calendar.HOUR_OF_DAY);
            int dakika = simdikiZaman.get(Calendar.MINUTE);
            int saniye = simdikiZaman.get(Calendar.SECOND);

            saatAlani.setText(" " + saat + " " + " " + dakika + " " + saniye);
        }
    }

    public static void main(String[] args) {
        new Saat().setVisible(true);
    }
}
