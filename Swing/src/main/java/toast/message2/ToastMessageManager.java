package toast.message2;

import toast.message.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by enginoz on 02/03/17.
 * Singleton Manager
 */
public class ToastMessageManager {


    private static final List<ToastMessageDialog> queue = new LinkedList<>();
    private static final Queue<ToastMessageDialog> headQueue = new ArrayBlockingQueue<>(1);
    private static final JLayeredPane layeredPane = ToastMessageTest.getContainer();

    private ToastMessageManager() {

    }

    private static final ToastMessageManager instance = new ToastMessageManager();

    public static ToastMessageManager getInstance() {
        return instance;
    }


    public synchronized void addQueue(ToastMessageDialog dialog) {

        if (queue.size() >= 1) {
            showToastMessage();
        }

        while (!headQueue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
        headQueue.add(dialog);
        dialog.showMessage();
        layeredPane.setLayout(null);
        layeredPane.add(dialog);
        layeredPane.repaint();

    }

    public synchronized void removeHeadQueue(ToastMessageDialog dialog) {
        while (headQueue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        headQueue.remove(dialog);
        queue.add(dialog);
        notifyAll();
    }


    public void removeQueue(ToastMessageDialog dialog) {
        layeredPane.remove(dialog);
        queue.remove(dialog);
        layeredPane.repaint();
    }


    private void showToastMessage() {
        //List copyList = new ArrayList<>(toastMessageQueue);
        //Collections.reverse(copyList);

        SwingWorker worker = new SwingWorker() {
            private int i = 0;

            @Override
            protected Object doInBackground() throws Exception {
                for (Component component : layeredPane.getComponents()) {
                    if (component instanceof ToastMessageDialog) {
                        ToastMessageDialog dialog = (ToastMessageDialog) component;
                        int x = dialog.getLocationOnScreen().x;
                        int y = dialog.getLocationOnScreen().y - 70;
                        dialog.moveUp(new Point(x, y));
                    }
                }
                return null;
            }

        };
        worker.execute();
    }

    public void creatToastMessage() {
        addQueue(new SuccessToastMessageDialog("Succes", "Succes Message " + queue.size()));
    }
}
