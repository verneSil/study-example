package decorator.component;

/**
 * @author verne on 18-2-6.
 * @version 1.0
 */

public class CusDecorator3 implements Job {

    private Job decorator;

    public CusDecorator3(Job decorator) {
        this.decorator = decorator;
    }

    @Override
    public void doJob() {
        System.out.println("start decorator3");
        decorator.doJob();
        System.out.println("end decorator3");
    }
}
