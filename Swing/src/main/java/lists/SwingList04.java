package lists;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
//import com.sun.java.swing.*; //JDK1.1/Swing1.0.3 version
//import com.sun.java.swing.tree.*;
//import com.sun.java.swing.event.*;
import javax.swing.*; //JDK1.2 version
import javax.swing.tree.*;
import javax.swing.event.*;

//=======================================================//
public class SwingList04 extends JFrame {
    JList listA;
    JList listB;
    JScrollPane scrollPaneA;
    JScrollPane scrollPaneB;
    MyListSelectionListener listSelectionListenerA;
    MyListSelectionListener listSelectionListenerB;
    JPanel panelA = new JPanel();
    JPanel panelB = new JPanel();
    JButton buttonA;
    JButton buttonB;
    JTextField fieldA;
    JTextField fieldB;

    Dimension prefSize;

    //The following is a reference to the top-level JFrame
    // which contains everything else.
    SwingList04 thisObj;

    //-----------------------------------------------------//

    public static void main(String args[]) {
        //Instantiate the top-level JFrame object.
        new SwingList04();
    }//end main
    //-----------------------------------------------------//

    public SwingList04() {//constructor

        //Instantiate and link to a Programmable Look & Feel
        // control panel.
        new PlafPanel02(this);

        getContentPane().setLayout(new FlowLayout());

        //Create a Vector object containing data for
        // populating two JList objects.
        Vector theFileNames = new Vector();
        String dir = "c:/";
        String[] fileList = new File(dir).list();//dir listing

        //Loop and process each file in the directory
        for (int fileCnt = 0; fileCnt < fileList.length; fileCnt++) {
            if (new File(
                    dir + "/" + fileList[fileCnt]).isDirectory()) {
                theFileNames.addElement("dir: " +
                        fileList[fileCnt]);
            } else {
                theFileNames.addElement("file: " +
                        fileList[fileCnt]);
            }//end else
        }//end for loop

        if (theFileNames != null) {
            //Create and populate two JList objects
            listA = new JList(new DefaultListModel());
            //Put a custom cell renderer on this list.
            listA.setCellRenderer(new CustomCellRenderer());
            //Put a custom selection model on this list.
            listA.setSelectionModel(new CustomSelectionModel());

            listB = new JList(new DefaultListModel());

            //Give them names to be used in event handler
            listA.setName("MyNameIsListA");
            listB.setName("MyNameIsListB");

            //Populate the list
            Enumeration theEnum = theFileNames.elements();
            while (theEnum.hasMoreElements()) {
                Object theObject = theEnum.nextElement();
                ((DefaultListModel) listA.getModel()).
                        addElement(theObject);
                ((DefaultListModel) listB.getModel()).
                        addElement(theObject);

            }//end while loop

            //Display listA, its button, and its textField
            scrollPaneA = new JScrollPane(listA);
            panelA.add(scrollPaneA);
            listSelectionListenerA =
                    new MyListSelectionListener();
            listA.addListSelectionListener(
                    listSelectionListenerA);
            listA.setVisibleRowCount(6);
            //Allow selection of one element index at a time.
            listA.setSelectionMode(
                    ListSelectionModel.SINGLE_SELECTION);
            //Get size of list and adjust JPanel accordingly
            prefSize =
                    listA.getPreferredScrollableViewportSize();
            panelA.setBounds(0, 0, prefSize.width, prefSize.height);
            getContentPane().add(panelA);

            buttonA = new JButton("A");
            getContentPane().add(buttonA);
            fieldA = new JTextField("Field A");
            getContentPane().add(fieldA);

            //Listener to remove elements from listA
            buttonA.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int theElement =
                            Integer.parseInt(fieldA.getText());
                    ((DefaultListModel) listA.getModel()).
                            removeElementAt(theElement);
                }
            });


            //Display listB
            scrollPaneB = new JScrollPane(listB);
            panelB.add(scrollPaneB);
            listSelectionListenerB =
                    new MyListSelectionListener();
            listB.addListSelectionListener(
                    listSelectionListenerB);
            listB.setVisibleRowCount(6);
            //Allow selection of one element index at a time.
            listB.setSelectionMode(ListSelectionModel.
                    SINGLE_SELECTION);
            //Get size of list and adjust JPanel accordingly
            prefSize =
                    listB.getPreferredScrollableViewportSize();
            panelB.setBounds(0, 0, prefSize.width, prefSize.height);
            getContentPane().add(panelB);

            buttonB = new JButton("B");
            getContentPane().add(buttonB);
            fieldB = new JTextField("Field B");
            getContentPane().add(fieldB);

            //Listener to remove elements from listA
            buttonB.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int theElement =
                            Integer.parseInt(fieldB.getText());
                    ((DefaultListModel) listB.getModel()).
                            removeElementAt(theElement);
                }
            });

        }//end if(theFileNames != null)

        //Save a reference to the top-level JFrame object
        // in an instance variable for later use.
        thisObj = this;
        setTitle("Copyright 1998, R.G.Baldwin");
        setSize(400, 350);
        setVisible(true);

        //An anonymous inner class to terminate the program
        // when the
        // user clicks the close button on the frame.
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }//end constructor

    //=====================================================//

    //Inner class to monitor for selection events on the
    // JList object and store the index of the selected
    // element in the JTextField associated with the JList.
    class MyListSelectionListener
            implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            int selectedIndex =
                    ((JList) e.getSource()).getSelectedIndex();
            //Don't allow the list to exist without a selected
            // element giving a selected index of -1.  This will
            // throw an exception if the user attempts to remove
            // an element from an empty list, but a negative
            // index will also throw an exception if the user
            // attempts to remove an element with a negative
            // index.
            if (((Component) e.getSource()).getName().
                    compareTo("MyNameIsListA") == 0) {
                if (selectedIndex < 0) listA.setSelectedIndex(0);
                else fieldA.setText("" + selectedIndex);
            } else {
                if (selectedIndex < 0) listB.setSelectedIndex(0);
                else fieldB.setText("" + selectedIndex);
            }//end if
        }//end valueChanged()
    }//end class MyListSelectionListener
    //=====================================================//

    //Inner class to implement a custom cell renderer
    class CustomCellRenderer extends JLabel
            implements ListCellRenderer {
        ImageIcon selected = new ImageIcon("red-ball.gif");
        ImageIcon unSelected = new ImageIcon("blue-ball.gif");

        //This method is declared by the ListCellRenderer
        // interface.  Once it is defined as the cell renderer
        // for a list, it is called each time it is necessary
        // to redraw the cell.  With this definition, the
        // cell is rendered using a JLabel object containing
        // an icon and some text.  The text is the original
        // text.  The icon toggles between a red ball when
        // the element is selected and a blue ball when the
        // element is not selected.

        public Component getListCellRendererComponent(
                JList list,          // the list being redrawn
                Object value,        // value to display
                int index,           // cell index
                boolean isSelected,  // is the cell selected
                boolean cellHasFocus)// the list and the cell have
        //  the focus
        {//begin getListCellRendererComponent() body
            String theLabel = value.toString();
            setText(theLabel);
            if (isSelected) {//set the red ball
                setIcon(selected);
            } else {//set the blue ball for not selected
                setIcon(unSelected);
            }//end else
            return this;//return component used to render
        }//end getListCellRendererComponent()
    }//end class CustomCellRenderer
    //=====================================================//

    //Inner class to implement a custom selection model.
    // This custom selection model modifies the selection
    // rules defined by the DefaultListSelectionModel by
    // extending that class and overriding one of the
    // methods of that class.  Unless the index values
    // defining a selection interval are equal to zero, they
    // are reduced by a value of 1 and then passed to the
    // same method in the superclass.  If the index value is
    // zero, it is not modified.
    class CustomSelectionModel
            extends DefaultListSelectionModel {

        public void setSelectionInterval(
                int index0, int index1) {
            if (index0 != 0) index0--;
            if (index1 != 0) index1--;
            super.setSelectionInterval(index0, index1);
        }//end setSelectionInterval()
    }//end class CustomSelectionModel

    //=====================================================//

}