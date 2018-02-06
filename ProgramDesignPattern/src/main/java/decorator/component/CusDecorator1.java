package decorator.component;

/**
 * @author verne on 18-2-6.
 * @version 1.0
 */

public class CusDecorator1 implements Job {

    private Job decorator;

    public CusDecorator1(Job decorator) {
        this.decorator = decorator;
    }

    @Override
    public void doJob() {
        System.out.println("start decorator1");
        decorator.doJob();
        System.out.println("end decorator1");
    }
}
