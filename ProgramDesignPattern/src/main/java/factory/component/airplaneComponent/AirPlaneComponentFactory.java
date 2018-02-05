package factory.component.airplaneComponent;

import factory.component.airplaneComponent.Seat;
import factory.component.airplaneComponent.Stewardess;

public interface AirPlaneComponentFactory {

    Seat createSeat();

    Stewardess createStewardess();
}
