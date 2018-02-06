package decorator.component;

/**
 * @author verne on 18-2-6.
 * @version 1.0
 */

public class CusDecorator2 implements Job {

    private Job decorator;

    public CusDecorator2(Job decorator) {
        this.decorator = decorator;
    }

    @Override
    public void doJob() {
        System.out.println("start decorator2");
        decorator.doJob();
        System.out.println("end decorator2");
    }
}
