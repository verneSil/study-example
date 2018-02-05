package adapter;

import adapter.component.RealTwo;
import adapter.component.ThreeInterface;
import adapter.component.TwoInterface;
import adapter.component.TwoToThreeAdapter;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class AdapterTest {
    public static void main(String[] args) {
        RealTwo realTwo = new RealTwo();

        ThreeInterface three = new TwoToThreeAdapter(realTwo);

        three.offerPower();
    }
}
