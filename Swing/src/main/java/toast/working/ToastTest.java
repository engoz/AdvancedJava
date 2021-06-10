package toast.working;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


/**
 * Created by enginoz on 19/02/17.
 */
public class ToastTest extends JFrame {

    private final int QUEUE_CAPACITY = 5;
    private BlockingQueue<Toast> toasts = new ArrayBlockingQueue<Toast>(QUEUE_CAPACITY);

    public ToastTest() {
        super("loud Tester");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton toastButton = new JButton("show toast");
        jPanel.add(toastButton);

        toastButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeToast(getContainer(), "a toast!");
            }
        });


        add(jPanel);
        setSize(800, 600);
        setVisible(true);
    }

    private JFrame getContainer() {
        return this;
    }


    private void makeToast(final JFrame owner, final String toastText) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        addToast(owner, toastText, i);
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    showToast();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }).start();


    }


    private void addToast(final JFrame owner, final String toastText, int i) throws InterruptedException {
        toasts.put(new Toast(owner, toastText + " -" + i));

    }

    private void showToast() throws InterruptedException {
        while (toasts.size() > 0) {
            Toast toast = toasts.take();
            toast.showToast();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToastTest();
            }
        });
    }
}
