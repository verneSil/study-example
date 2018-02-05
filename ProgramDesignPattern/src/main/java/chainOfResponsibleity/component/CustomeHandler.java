package chainOfResponsibleity.component;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class CustomeHandler extends Handler {
    @Override
    public void doHandler() {
        if (false) {

        } else {
            System.out.println("do handler ing" + this.getClass().getSimpleName());
            if (this.getNextHandler() != null) {
                this.getNextHandler().doHandler();
            } else {
                System.out.println(" no thing to do");
            }
        }
    }
}
