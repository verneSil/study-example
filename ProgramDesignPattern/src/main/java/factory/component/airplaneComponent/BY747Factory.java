package factory.component.airplaneComponent;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class BY747Factory {
    private static AirPlaneComponentFactory airPlaneComponentFactory = new BY747ComponentFactory();

    public static BY747 createBY747() {
        BY747 by747 = new BY747();
        by747.setSeat(airPlaneComponentFactory.createSeat());
        by747.setStewardess(airPlaneComponentFactory.createStewardess());
        return by747;
    }
}
