package dialogs;

/**
 * Created by servicium on 09.11.2016.
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A dialog that presents the user with a sequence of steps for completing a
 * task. The dialog contains "Next" and "Previous" buttons, allowing the user to
 * navigate through the task.
 * <p>
 * When the user backs up by one or more steps, the dialog keeps the completed
 * steps so that they can be reused if the user doesn't change anything - this
 * handles the cases where the user backs up a few steps just to review what has
 * been completed.
 * <p>
 * But if the user changes some options in an earlier step, then the dialog may
 * have to discard the later steps and have them repeated.
 * <p>
 * THIS CLASS IS NOT WORKING CORRECTLY YET.
 *
 * @author David Gilbert
 */
public class WizardDialog extends JDialog implements ActionListener {

    /**
     * The end result of the wizard sequence.
     */
    private Object result;

    /**
     * The current step in the wizard process (starting at step zero).
     */
    private int step;

    /**
     * A reference to the current panel.
     */
    private WizardPanel currentPanel;

    /**
     * A list of references to the panels the user has already seen - used for
     * navigating through the steps that have already been completed.
     */
    private java.util.List panels;

    /**
     * A handy reference to the "previous" button.
     */
    private JButton previousButton;

    /**
     * A handy reference to the "next" button.
     */
    private JButton nextButton;

    /**
     * A handy reference to the "finish" button.
     */
    private JButton finishButton;

    /**
     * A handy reference to the "help" button.
     */
    private JButton helpButton;

    /**
     * Standard constructor - builds and returns a new WizardDialog.
     *
     * @param owner      the owner.
     * @param modal      modal?
     * @param title      the title.
     * @param firstPanel the first panel.
     */
    public WizardDialog(final JDialog owner, final boolean modal, final String title,
                        final WizardPanel firstPanel) {

        super(owner, title + " : step 1", modal);
        this.result = null;
        this.currentPanel = firstPanel;
        this.step = 0;
        this.panels = new ArrayList();
        this.panels.add(firstPanel);
        setContentPane(createContent());

    }

    /**
     * Standard constructor - builds a new WizardDialog owned by the specified
     * JFrame.
     *
     * @param owner      the owner.
     * @param modal      modal?
     * @param title      the title.
     * @param firstPanel the first panel.
     */
    public WizardDialog(final JFrame owner, final boolean modal, final String title,
                        final WizardPanel firstPanel) {

        super(owner, title + " : step 1", modal);
        this.result = null;
        this.currentPanel = firstPanel;
        this.step = 0;
        this.panels = new ArrayList();
        this.panels.add(firstPanel);
        setContentPane(createContent());
    }

    /**
     * Returns the result of the wizard sequence.
     *
     * @return the result.
     */
    public Object getResult() {
        return this.result;
    }

    /**
     * Returns the total number of steps in the wizard sequence, if this number is
     * known. Otherwise this method returns zero. Subclasses should override this
     * method unless the number of steps is not known.
     *
     * @return the number of steps.
     */
    public int getStepCount() {
        return 0;
    }

    /**
     * Returns true if it is possible to back up to the previous panel, and false
     * otherwise.
     *
     * @return boolean.
     */
    public boolean canDoPreviousPanel() {
        return (this.step > 0);
    }

    /**
     * Returns true if there is a 'next' panel, and false otherwise.
     *
     * @return boolean.
     */
    public boolean canDoNextPanel() {
        return this.currentPanel.hasNextPanel();
    }

    /**
     * Returns true if it is possible to finish the sequence at this point
     * (possibly with defaults for the remaining entries).
     *
     * @return boolean.
     */
    public boolean canFinish() {
        return this.currentPanel.canFinish();
    }

    /**
     * Returns the panel for the specified step (steps are numbered from zero).
     *
     * @param step the current step.
     * @return the panel.
     */
    public WizardPanel getWizardPanel(final int step) {
        if (step < this.panels.size()) {
            return (WizardPanel) this.panels.get(step);
        } else {
            return null;
        }
    }

    /**
     * Handles events.
     *
     * @param event the event.
     */
    public void actionPerformed(final ActionEvent event) {
        final String command = event.getActionCommand();
        if (command.equals("nextButton")) {
            next();
        } else if (command.equals("previousButton")) {
            previous();
        } else if (command.equals("finishButton")) {
            finish();
        }
    }

    /**
     * Handles a click on the "previous" button, by displaying the previous panel
     * in the sequence.
     */
    public void previous() {
        if (this.step > 0) {
            final WizardPanel previousPanel = getWizardPanel(this.step - 1);
            // tell the panel that we are returning
            previousPanel.returnFromLaterStep();
            final Container content = getContentPane();
            content.remove(this.currentPanel);
            content.add(previousPanel);
            this.step = this.step - 1;
            this.currentPanel = previousPanel;
            setTitle("Step " + (this.step + 1));
            enableButtons();
            pack();
        }
    }

    /**
     * Displays the next step in the wizard sequence.
     */
    public void next() {

        WizardPanel nextPanel = getWizardPanel(this.step + 1);
        if (nextPanel != null) {
            if (!this.currentPanel.canRedisplayNextPanel()) {
                nextPanel = this.currentPanel.getNextPanel();
            }
        } else {
            nextPanel = this.currentPanel.getNextPanel();
        }

        this.step = this.step + 1;
        if (this.step < this.panels.size()) {
            this.panels.set(this.step, nextPanel);
        } else {
            this.panels.add(nextPanel);
        }

        final Container content = getContentPane();
        content.remove(this.currentPanel);
        content.add(nextPanel);

        this.currentPanel = nextPanel;
        setTitle("Step " + (this.step + 1));
        enableButtons();
        pack();

    }

    /**
     * Finishes the wizard.
     */
    public void finish() {
        this.result = this.currentPanel.getResult();
        setVisible(false);
    }

    /**
     * Enables/disables the buttons according to the current step. A good idea
     * would be to ask the panels to return the status...
     */
    private void enableButtons() {
        this.previousButton.setEnabled(this.step > 0);
        this.nextButton.setEnabled(canDoNextPanel());
        this.finishButton.setEnabled(canFinish());
        this.helpButton.setEnabled(false);
    }

    /**
     * Checks, whether the user cancelled the dialog.
     *
     * @return false.
     */
    public boolean isCancelled() {
        return false;
    }

    /**
     * Creates a panel containing the user interface for the dialog.
     *
     * @return the panel.
     */
    public JPanel createContent() {

        final JPanel content = new JPanel(new BorderLayout());
        content.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        content.add((JPanel) this.panels.get(0));
        final L1R3ButtonPanel buttons = new L1R3ButtonPanel("Help", "Previous", "Next", "Finish");

        this.helpButton = buttons.getLeftButton();
        this.helpButton.setEnabled(false);

        this.previousButton = buttons.getRightButton1();
        this.previousButton.setActionCommand("previousButton");
        this.previousButton.addActionListener(this);
        this.previousButton.setEnabled(false);

        this.nextButton = buttons.getRightButton2();
        this.nextButton.setActionCommand("nextButton");
        this.nextButton.addActionListener(this);
        this.nextButton.setEnabled(true);

        this.finishButton = buttons.getRightButton3();
        this.finishButton.setActionCommand("finishButton");
        this.finishButton.addActionListener(this);
        this.finishButton.setEnabled(false);

        buttons.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        content.add(buttons, BorderLayout.SOUTH);

        return content;
    }

}

/*
 * JCommon : a free general purpose class library for the Java(tm) platform
 *
 *
 * (C) Copyright 2000-2005, by Object Refinery Limited and Contributors.
 *
 * Project Info: http://www.jfree.org/jcommon/index.html
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc. in the
 * United States and other countries.]
 *
 * ---------------- WizardPanel.java ---------------- (C) Copyright 2000-2004,
 * by Object Refinery Limited.
 *
 * Original Author: David Gilbert (for Object Refinery Limited); Contributor(s): -;
 *
 * $Id: WizardPanel.java,v 1.5 2007/11/02 17:50:36 taqua Exp $
 *
 * Changes (from 26-Oct-2001) -------------------------- 26-Oct-2001 : Changed
 * package to com.jrefinery.ui.*; 14-Oct-2002 : Fixed errors reported by
 * Checkstyle (DG);
 *
 */

/**
 * A panel that provides the user interface for a single step in a WizardDialog.
 *
 * @author David Gilbert
 */
abstract class WizardPanel extends JPanel {

    /**
     * The owner.
     */
    private WizardDialog owner;

    /**
     * Creates a new panel.
     *
     * @param layout the layout manager.
     */
    protected WizardPanel(final LayoutManager layout) {
        super(layout);
    }

    /**
     * Returns a reference to the dialog that owns the panel.
     *
     * @return the owner.
     */
    public WizardDialog getOwner() {
        return this.owner;
    }

    /**
     * Sets the reference to the dialog that owns the panel (this is called
     * automatically by the dialog when the panel is added to the dialog).
     *
     * @param owner the owner.
     */
    public void setOwner(final WizardDialog owner) {
        this.owner = owner;
    }

    /**
     * Returns the result.
     *
     * @return the result.
     */
    public Object getResult() {
        return null;
    }

    /**
     * This method is called when the dialog redisplays this panel as a result of
     * the user clicking the "Previous" button. Inside this method, subclasses
     * should make a note of their current state, so that they can decide what to
     * do when the user hits "Next".
     */
    public abstract void returnFromLaterStep();

    /**
     * Returns true if it is OK to redisplay the last version of the next panel,
     * or false if a new version is required.
     *
     * @return boolean.
     */
    public abstract boolean canRedisplayNextPanel();

    /**
     * Returns true if there is a next panel.
     *
     * @return boolean.
     */
    public abstract boolean hasNextPanel();

    /**
     * Returns true if it is possible to finish from this panel.
     *
     * @return boolean.
     */
    public abstract boolean canFinish();

    /**
     * Returns the next panel in the sequence, given the current user input.
     * Returns null if this panel is the last one in the sequence.
     *
     * @return the next panel in the sequence.
     */
    public abstract WizardPanel getNextPanel();

}

/*
 * JCommon : a free general purpose class library for the Java(tm) platform
 *
 *
 * (C) Copyright 2000-2005, by Object Refinery Limited and Contributors.
 *
 * Project Info: http://www.jfree.org/jcommon/index.html
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc. in the
 * United States and other countries.]
 *
 * -------------------- L1R3ButtonPanel.java -------------------- (C) Copyright
 * 2000-2004, by Object Refinery Limited.
 *
 * Original Author: David Gilbert (for Object Refinery Limited); Contributor(s): -;
 *
 * $Id: L1R3ButtonPanel.java,v 1.5 2007/11/02 17:50:36 taqua Exp $
 *
 * Changes (from 26-Oct-2001) -------------------------- 26-Oct-2001 : Changed
 * package to com.jrefinery.ui.* (DG); 26-Jun-2002 : Removed unnecessary import
 * (DG); 14-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 *
 */

/**
 * A 'ready-made' panel that has one button on the left and three buttons on the
 * right - nested panels and layout managers take care of resizing.
 *
 * @author David Gilbert
 */
class L1R3ButtonPanel extends JPanel {

    /**
     * The left button.
     */
    private JButton left;

    /**
     * The first button on the right of the panel.
     */
    private JButton right1;

    /**
     * The second button on the right of the panel.
     */
    private JButton right2;

    /**
     * The third button on the right of the panel.
     */
    private JButton right3;

    /**
     * Standard constructor - creates panel with the specified button labels.
     *
     * @param label1 the label for button 1.
     * @param label2 the label for button 2.
     * @param label3 the label for button 3.
     * @param label4 the label for button 4.
     */
    public L1R3ButtonPanel(final String label1, final String label2, final String label3,
                           final String label4) {

        setLayout(new BorderLayout());

        // create the pieces...
        final JPanel panel = new JPanel(new BorderLayout());
        final JPanel panel2 = new JPanel(new BorderLayout());
        this.left = new JButton(label1);
        this.right1 = new JButton(label2);
        this.right2 = new JButton(label3);
        this.right3 = new JButton(label4);

        // ...and put them together
        panel.add(this.left, BorderLayout.WEST);
        panel2.add(this.right1, BorderLayout.EAST);
        panel.add(panel2, BorderLayout.CENTER);
        panel.add(this.right2, BorderLayout.EAST);
        add(panel, BorderLayout.CENTER);
        add(this.right3, BorderLayout.EAST);

    }

    /**
     * Returns a reference to button 1, allowing the caller to set labels,
     * action-listeners etc.
     *
     * @return the left button.
     */
    public JButton getLeftButton() {
        return this.left;
    }

    /**
     * Returns a reference to button 2, allowing the caller to set labels,
     * action-listeners etc.
     *
     * @return the right button 1.
     */
    public JButton getRightButton1() {
        return this.right1;
    }

    /**
     * Returns a reference to button 3, allowing the caller to set labels,
     * action-listeners etc.
     *
     * @return the right button 2.
     */
    public JButton getRightButton2() {
        return this.right2;
    }

    /**
     * Returns a reference to button 4, allowing the caller to set labels,
     * action-listeners etc.
     *
     * @return the right button 3.
     */
    public JButton getRightButton3() {
        return this.right3;
    }

}
