package dialogs;

/**
 * Created by servicium on 09.11.2016.
 */

import java.awt.Frame;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

class EscapeDialog extends JDialog {
    public EscapeDialog() {
        super((Frame) null, false);
    }

    protected JRootPane createRootPane() {
        JRootPane rootPane = new JRootPane();
        KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
        Action actionListener = new AbstractAction() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("about to disappear");
                setVisible(false);
            }
        };
        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(stroke, "ESCAPE");
        rootPane.getActionMap().put("ESCAPE", actionListener);

        return rootPane;
    }

}

public class EscapeDialogTest {
    public static void main(String[] a) {
        EscapeDialog dlg = new EscapeDialog();
        dlg.add(new JButton("asdf"));
        dlg.setSize(300, 100);
        dlg.setVisible(true);
    }
}

