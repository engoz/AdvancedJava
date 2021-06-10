package worker;

/**
 * Created by servicium on 29.01.2016.
 */

import javax.swing.SwingUtilities;


public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new MainFrame("SwingWorker Demo");
            }
        });
    }

}
