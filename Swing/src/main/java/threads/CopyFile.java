package threads;

/**
 * Created by enginoz on 16/02/17.
 */

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class CopyFile {

    public static void main(String[] args) {
        final JLabel label = new JLabel();
        JFrame frame = new JFrame();
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setSize(200, 80);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                copyFiles(label);
            }
        };
        new Thread(runnable).start();
    }

    private static void copyFiles(final JLabel label) {
        for (int i = 0; i < 10; i++) {
            final String fileName = "Picture" + i + ".jpg";
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    label.setText(String.format("Coppying \"%s\"...", fileName));
                }
            });
            // Copy file here
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                label.setText("Done.");
            }
        });
    }

}
