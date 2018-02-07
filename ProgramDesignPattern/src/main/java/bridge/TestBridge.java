package bridge;

import bridge.component.AppleTV;
import bridge.component.Controller;
import bridge.component.CustomerController;
import bridge.component.TV;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class TestBridge {
    public static void main(String[] args) {
        TV tv= new AppleTV();
        Controller controller = new CustomerController(tv);

        controller.openTv();
        controller.changeTV();
        controller.closeTv();
    }
}
