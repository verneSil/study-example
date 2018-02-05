package singletom.component;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class Singleton3 {

    private static Singleton3 singleton3 = new Singleton3();

    private Singleton3() {

    }

    public static Singleton3 getSingleton3() {
        return singleton3;
    }
}
