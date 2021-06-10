package lists;

/**
 * Created by servicium on 10.10.2016.
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SelectingJListSample {
    public static void main(String args[]) {
        String labels[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        JFrame frame = new JFrame("Selecting JList");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();

        JList jlist = new JList(labels);
        JScrollPane scrollPane1 = new JScrollPane(jlist);
        contentPane.add(scrollPane1, BorderLayout.WEST);

        ListSelectionListener listSelectionListener = new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                System.out.print("First index: " + listSelectionEvent.getFirstIndex());
                System.out.print(", Last index: " + listSelectionEvent.getLastIndex());
                boolean adjust = listSelectionEvent.getValueIsAdjusting();
                System.out.println(", Adjusting? " + adjust);
                if (!adjust) {
                    JList list = (JList) listSelectionEvent.getSource();
                    int selections[] = list.getSelectedIndices();
                    Object selectionValues[] = list.getSelectedValues();
                    for (int i = 0, n = selections.length; i < n; i++) {
                        if (i == 0) {
                            System.out.print("  Selections: ");
                        }
                        System.out.print(selections[i] + "/" + selectionValues[i] + " ");
                    }
                    System.out.println();
                }
            }
        };
        jlist.addListSelectionListener(listSelectionListener);

        MouseListener mouseListener = new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {
                JList theList = (JList) mouseEvent.getSource();
                if (mouseEvent.getClickCount() == 2) {
                    int index = theList.locationToIndex(mouseEvent.getPoint());
                    if (index >= 0) {
                        Object o = theList.getModel().getElementAt(index);
                        System.out.println("Double-clicked on: " + o.toString());
                    }
                }
            }
        };
        jlist.addMouseListener(mouseListener);

        frame.setSize(350, 200);
        frame.setVisible(true);
    }
}
