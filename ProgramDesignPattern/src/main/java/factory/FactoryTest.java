package factory;

import factory.component.airplaneComponent.BY747;
import factory.component.airplaneComponent.BY747Factory;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class FactoryTest {
    public static void main(String[] args) {
        BY747 by747 =
                BY747Factory.createBY747();
        System.out.println(by747);

    }
}
