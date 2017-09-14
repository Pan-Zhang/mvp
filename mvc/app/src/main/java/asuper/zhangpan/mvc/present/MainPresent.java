package asuper.zhangpan.mvc.present;

import asuper.zhangpan.mvc.base.BasePresent;
import asuper.zhangpan.mvc.view.MainInterface;

/**
 * Created by zhangpan on 17/9/14.
 */

public class MainPresent extends BasePresent<MainInterface> {


    public MainPresent(MainInterface mainInterface) {
        super(mainInterface);
    }

    public void test() {
        try {
            getView().showLoadding();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
