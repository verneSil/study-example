package adapter.component;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class RealTwo implements TwoInterface{

    @Override
    public void offerPower() {
        System.out.println("offering power");
    }
}
