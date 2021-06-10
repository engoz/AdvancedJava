package dialogs;

/**
 * Created by servicium on 09.11.2016.
 */
/*
 * Enhydra Java Application Server Project
 *
 * The contents of this file are subject to the Enhydra Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License on
 * the Enhydra web site ( http://www.enhydra.org/ ).
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific terms governing rights and limitations
 * under the License.
 *
 * The Initial Developer of the Enhydra Application Server is Lutris
 * Technologies, Inc. The Enhydra Application Server and portions created
 * by Lutris Technologies, Inc. are Copyright Lutris Technologies, Inc.
 * All Rights Reserved.
 *
 * Contributor(s):
 *
 */

// Standard imports

import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

//
public class DialogPanel extends JPanel {
    public final static int CANCEL_OPTION = JOptionPane.CANCEL_OPTION;
    public final static int OK_OPTION = JOptionPane.OK_OPTION;

    //
    private int option = DialogPanel.CANCEL_OPTION;
    private LocalDialog dialog = null;
    private Window owner = null;
    private boolean windowClose = false;
    private boolean standalone = false;
    private boolean modal = true;
    private String title = new String();

    public Window getOwner() {
        return owner;
    }

    public void setOwner(Window w) {
        owner = w;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public boolean isModal() {
        return modal;
    }

    public void setModal(boolean b) {
        modal = b;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int o) {
        option = o;
    }

    public LocalDialog getDialog() {
        return dialog;
    }

    public void startDialogThread() {
        Thread dialogThread = new Thread() {
            public void run() {
                showDialog();
            }

        };

        dialogThread.start();
    }

    public int showDialog() {
        BorderLayout layout = null;
        Point cp = null;

        if (dialog == null) {
            if (getOwner() == null) {
                dialog = new LocalDialog();
            } else if (getOwner() instanceof Frame) {
                dialog = new LocalDialog((Frame) getOwner());
            } else if (getOwner() instanceof Dialog) {
                dialog = new LocalDialog((Dialog) getOwner());
            } else {
                dialog = new LocalDialog();
            }
        }
        dialog.setModal(isModal());
        dialog.setTitle(getTitle());
        layout = new BorderLayout();
        dialog.getRootPane().setLayout(layout);
        dialog.getRootPane().add(this, BorderLayout.CENTER);
        dialog.pack();


        dialog.show();
        return option;
    }

    //
    // PROTECTED
    //
    protected void hideDialog() {
        if (dialog != null) {
            dialog.setVisible(false);
        }
    }

    protected void clearDialog() {
        if (dialog != null) {
            dialog.setVisible(false);
            dialog.getRootPane().removeAll();
            dialog.removeAll();
            dialog.dispose();
        }
        if (isStandalone()) {
            System.exit(0);
        }
    }

    protected boolean isWindowClose() {
        return windowClose;
    }

    protected void setWindowClose(boolean b) {
        windowClose = b;
    }

    protected boolean isStandalone() {
        return standalone;
    }

    protected void setStandalone(boolean b) {
        standalone = b;
    }

    private class LocalDialog extends JDialog {
        public LocalDialog() {
            super();
        }

        public LocalDialog(Dialog owner) {
            super(owner);
        }

        public LocalDialog(Frame owner) {
            super(owner);
        }

        protected void processWindowEvent(WindowEvent e) {
            if (isWindowClose()) {
                if (e.getID() == WindowEvent.WINDOW_CLOSING) {
                    clearDialog();
                }
                super.processWindowEvent(e);
            }
        }

    }
}