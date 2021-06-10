package toast.message2;

import util.Util;

/**
 * Created by enginoz on 28/02/17.
 */
public class ErrorToastMessageDialog extends ToastMessageDialog {

    public ErrorToastMessageDialog(String title, String content) {
        super(title, content);
    }

    @Override
    protected void initImage() {
        backImage = Util.getCommonImage(this, "ToastError");
        typeIcon = Util.getCommonIcon(this, "ToastErrorIcon.png");
    }


}
