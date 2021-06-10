package lists;

import javax.swing.*;

/**
 * Created by servicium on 10.10.2016.
 */
public class ExitableJFrame extends JFrame {
    public ExitableJFrame() {
    }

    public ExitableJFrame(String title) {
        super(title);
    }

    protected void frameInit() {
        super.frameInit();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
