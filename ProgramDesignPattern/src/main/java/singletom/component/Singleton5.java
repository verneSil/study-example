package singletom.component;


/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 instance = new Singleton5();
    }

    private Singleton5() {

    }

    public static final Singleton5 getInstance() {
        return SingletonHolder.instance;
    }
}
