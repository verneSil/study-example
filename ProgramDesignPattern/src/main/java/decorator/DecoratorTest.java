package decorator;

import decorator.component.*;

/**
 * @author verne on 18-2-6.
 * @version 1.0
 */

public class DecoratorTest {
    public static void main(String[] args) {
        CleanFloor cleanFloor = new CleanFloor();
        Job cusJob = new CusDecorator1(new CusDecorator2(new CusDecorator3(cleanFloor)));
        cusJob.doJob();
    }
}
