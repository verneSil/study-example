package singletom.component;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class Singleton7 {

    private static Singleton7 singleton7 = null;

    static {
        singleton7 = new Singleton7();
    }

    private Singleton7() {
    }

    public static Singleton7 getInstance() {
        return singleton7;
    }
}
