package factory;

import factory.component.airplaneComponent.BY747;
import factory.component.airplaneComponent.BY747Factory;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class FactoryTest {
    public static void main(String[] args) {
        //all interface could transfer from interface to abstract class
        BY747Factory by747Factory = new BY747Factory();
        BY747 by747 =
                by747Factory.createAriPlane();
        System.out.println(by747);

    }
}
