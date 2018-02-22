package somePackage;

import java.nio.channels.AcceptPendingException;

public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException {
        TestDemo testDemo = new TestDemo();
        System.out.println("class loader: ");

        Class<?> aClass = testDemo.getClass().getClassLoader().loadClass(AnotherClass.class.getName());
        System.out.println(aClass.newInstance());
        System.out.println("for name: ");

        Class.forName(AnotherClass.class.getName());
    }
}
