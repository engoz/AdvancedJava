package button;

/**
 * Created by enginoz on 22.12.2017.
 */

import java.awt.Graphics;

import javax.swing.JCheckBox;
import javax.swing.JToggleButton;

public class KJCheckBox extends JCheckBox {

    private boolean clickable;
    private boolean enabled2;


    /**
     *
     */
    public KJCheckBox() {
        super();
        init();
    }

    /**
     * @param text
     */
    public KJCheckBox(String text) {
        super(text);
        init();
    }


    private void init() {
        setModel(new MyButtonModel());
        this.clickable = true;
        this.enabled2 = true;
    }

    public void paint(Graphics g) {
        // store existing state
        boolean e = ((MyButtonModel) getModel()).isEnabled();

        // if !enabled - set not enabled
        // otherwise - set enabled
        ((MyButtonModel) getModel()).setEnabledNoFire(this.enabled2);

        super.paint(g);

        // restore previous state
        ((MyButtonModel) getModel()).setEnabledNoFire(e);
    }

    public void setClickable(boolean clickable) {
        this.clickable = clickable;
        super.setEnabled(clickable && this.enabled2);
    }

    public boolean isClickable() {
        return this.clickable;
    }

    public void setEnabled(boolean enabled) {
        this.enabled2 = enabled;
        super.setEnabled(enabled && this.clickable);
    }

    public boolean isEnabled() {
        return this.enabled2;
    }

    private class MyButtonModel extends ToggleButtonModel {

        public void setEnabledNoFire(boolean b) {
            if (b) {
                stateMask |= ENABLED;
            } else {
                stateMask &= ~ENABLED;
            }
        }
    }
}
