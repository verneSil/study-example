package singletom.component;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public enum  Singleton6 {
    Test(11, "123");

    private int age;
    private String name;

    Singleton6(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void whatEverMethod() {

    }
}
