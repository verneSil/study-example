package adapter.component;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class TwoToThreeAdapter implements ThreeInterface{
    private TwoInterface twoInterface;

    public TwoToThreeAdapter(TwoInterface twoInterface) {
        this.twoInterface = twoInterface;
    }


    @Override
    public void offerPower() {
        twoInterface.offerPower();
    }
}
