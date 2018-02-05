package monitor.component;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class CustomMonitor implements Monitor{

    @Override
    public <T> void doAfterUpdate(T t) {
        System.out.println("do some thing about object: " + t);
    }
}
