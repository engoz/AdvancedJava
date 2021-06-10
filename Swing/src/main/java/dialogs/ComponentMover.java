package dialogs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 * Created by enginoz on 20/02/17.
 */
public class ComponentMover {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JDialog dialog = new JDialog(frame, false);
        dialog.setSize(200, 50);
        frame.addComponentListener(new ComponentAdapter() {
            Point lastLocation;

            @Override
            public void componentMoved(ComponentEvent e) {
                if (lastLocation == null && frame.isVisible()) {
                    lastLocation = frame.getLocation();
                } else {
                    Point newLocation = frame.getLocation();
                    int dx = newLocation.x - lastLocation.x;
                    int dy = newLocation.y - lastLocation.y;
                    dialog.setLocation(dialog.getX() + dx, dialog.getY() + dy);
                    lastLocation = newLocation;
                }
            }
        });
        frame.setSize(400, 200);
        frame.setVisible(true);
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);
    }
}
