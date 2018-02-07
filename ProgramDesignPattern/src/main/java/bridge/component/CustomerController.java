package bridge.component;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class CustomerController extends Controller{


    public CustomerController(TV tv) {
        super(tv);
    }

    @Override
    public void openTv() {
        this.getTv().on();
    }

    @Override
    public void closeTv() {
        this.getTv().off();
    }

    @Override
    public void changeTV() {
        this.getTv().change();
    }
}
