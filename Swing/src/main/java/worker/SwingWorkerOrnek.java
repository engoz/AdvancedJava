package worker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;

/**
 * Created by enginoz on 04/03/17.
 */
public class SwingWorkerOrnek extends JFrame {
    JButton button = new JButton("Buraya Devamlı tıkla");

    public SwingWorkerOrnek() {
        super("Ornek");
        setSize(400, 400);
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Saat().execute();
            }
        };
        button.addActionListener(actionListener);
        pack();
    }

    class Saat extends SwingWorker<Long, Object> {

        @Override
        protected Long doInBackground() throws Exception {
            long start = System.nanoTime();
            Thread.sleep(200);
            long end = System.nanoTime();
            return (end - start) / (1000 * 1000);
        }

        @Override
        protected void done() {
            try {
                button.setText("" + get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new SwingWorkerOrnek().setVisible(true);
    }
}
