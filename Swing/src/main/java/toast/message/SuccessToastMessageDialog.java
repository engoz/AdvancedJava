package toast.message;

import util.Util;

/**
 * Created by enginoz on 28/02/17.
 */
public class SuccessToastMessageDialog extends ToastMessageDialog {

    public SuccessToastMessageDialog(String title, String content) {
        super(title, content);
    }

    @Override
    protected void initImage() {
        backImage = Util.getCommonImage(this, "ToastGreat");
        typeIcon = Util.getCommonIcon(this, "ToastGreatIcon.png");
    }

}
