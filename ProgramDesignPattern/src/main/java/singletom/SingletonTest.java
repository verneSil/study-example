package singletom;

import singletom.component.Singleton5;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class SingletonTest {
    public static void main(String[] args) {
        Singleton5 instance = Singleton5.getInstance();
        System.out.println(instance);
    }
}
