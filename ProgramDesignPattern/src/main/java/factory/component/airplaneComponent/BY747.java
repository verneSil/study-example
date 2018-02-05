package factory.component.airplaneComponent;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class BY747 {
    private Seat seat;
    private Stewardess stewardess;

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Stewardess getStewardess() {
        return stewardess;
    }

    public void setStewardess(Stewardess stewardess) {
        this.stewardess = stewardess;
    }
}
