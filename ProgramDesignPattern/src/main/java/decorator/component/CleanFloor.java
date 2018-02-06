package decorator.component;

/**
 * @author verne on 18-2-6.
 * @version 1.0
 */

public class CleanFloor implements Job{
    @Override
    public void doJob() {
        System.out.println("do my job");
    }
}
