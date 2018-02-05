package factory.component.airplaneComponent;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class BY747ComponentFactory implements AirPlaneComponentFactory{


    @Override
    public Seat createSeat() {
        return new BY747Seat();
    }

    @Override
    public Stewardess createStewardess() {
        return new BY747Stewardess();
    }
}
