package toast.message2;

import util.Util;

/**
 * Created by enginoz on 28/02/17.
 */
public class WarningToastMessageDialog extends ToastMessageDialog {

    public WarningToastMessageDialog(String title, String content) {
        super(title, content);
    }

    @Override
    protected void initImage() {
        backImage = Util.getCommonImage(this, "ToastWarning");
        typeIcon = Util.getCommonIcon(this, "ToastWarningIcon.png");
    }

}
