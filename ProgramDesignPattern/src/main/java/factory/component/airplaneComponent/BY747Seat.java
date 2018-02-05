package factory.component.airplaneComponent;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class BY747Seat implements Seat{
    private String brand = new String();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
