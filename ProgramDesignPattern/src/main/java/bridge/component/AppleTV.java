package bridge.component;

/**
 * @author verne on 18-2-7.
 * @version 1.0
 */

public class AppleTV implements TV {

    @Override
    public void on() {
        System.out.println("open tv");
    }

    @Override
    public void off() {
        System.out.println("close tv");
    }

    @Override
    public void change() {
        System.out.println("change tv");
    }
}
