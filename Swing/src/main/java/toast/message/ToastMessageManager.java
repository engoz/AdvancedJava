package toast.message;


import javax.swing.*;
import java.awt.*;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by enginoz on 28/02/17.
 */
public class ToastMessageManager {

    private static final List<ToastMessageDialog> toastMessageQueue = new CopyOnWriteArrayList<>();
    private final int DISTANCE_FROM_PARENT_BOTTOM = 100;
    private final int DISTANCE_FROM_PARENT_RIGHT = 50;
    private Point parentPoint;
    private Dimension parentSize;
    private final static Dimension toastDialogSize = new Dimension(352, 68);


    public ToastMessageManager(JFrame owner) {
        parentSize = owner.getSize();
        setPoint(owner.getLocation());
    }


    public void creatToastMessage() throws InterruptedException {
        int i = toastMessageQueue.size();
        addToastMessage(new SuccessToastMessageDialog("Succes", "Succes Message " + i));
        //     addToastMessage(new ErrorToastMessageDialog("Error","Error Test 1"));
        //     addToastMessage(new WarningToastMessageDialog("Warning","Warning 1"));
        //     addToastMessage(new SuccessToastMessageDialog("Succes","Succes 2"));
        //     addToastMessage(new ErrorToastMessageDialog("Error","Error Test 2"));
        //     addToastMessage(new WarningToastMessageDialog("Warning","Warning 2"));
        //     addToastMessage(new SuccessToastMessageDialog("Succes","Succes 3"));
        //     addToastMessage(new ErrorToastMessageDialog("Error","Error Test 3"));
        //     addToastMessage(new WarningToastMessageDialog("Warning","Warning 3"));

    }

    private void addToastMessage(ToastMessageDialog dialog) {

        if (toastMessageQueue.size() >= 1) {
            showToastMessage();
        }
        try {
            showDialog(dialog);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addQueue(dialog);

    }


    private void addQueue(ToastMessageDialog dialog) {
        toastMessageQueue.add(dialog);

    }


    private void showDialog(ToastMessageDialog dialog) throws InterruptedException {
        Thread.sleep(1000);
        dialog.setLocation(parentPoint);
        dialog.setVisible(true);
        dialog.moveUp(new Point(parentPoint.x, parentPoint.y - 70));
    }


    private void showToastMessage() {
        //List copyList = new ArrayList<>(toastMessageQueue);
        //Collections.reverse(copyList);

        SwingWorker worker = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                int x = parentPoint.x;
                for (Object object : toastMessageQueue) {
                    ToastMessageDialog dialog = (ToastMessageDialog) object;
                    int y = dialog.getLocation().y;
                    y = y - 70;
                    dialog.moveUp(new Point(x, y));

                }
                return null;
            }
        };
        worker.execute();
    }

    protected void setPoint(Point p) {
        int x = (int) (p.getX() + (parentSize.width - toastDialogSize.width - DISTANCE_FROM_PARENT_RIGHT));
        int y = (int) (p.getY() + parentSize.height - 70);
        parentPoint = new Point(x, y);
    }

    public static List<ToastMessageDialog> getToastMessageQueue() {
        return toastMessageQueue;
    }

}
