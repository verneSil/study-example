package chainOfResponsibleity;

import chainOfResponsibleity.component.CustomeHandler;
import chainOfResponsibleity.component.Handler;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class ChainTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException {
        CustomeHandler customeHandler1 = new CustomeHandler();
        CustomeHandler customeHandler2 = new CustomeHandler();
        CustomeHandler customeHandler3 = new CustomeHandler();
        CustomeHandler customeHandler4 = new CustomeHandler();
        CustomeHandler customeHandler5 = new CustomeHandler();
        CustomeHandler customeHandler6 = new CustomeHandler();
        customeHandler1.setNextHandler(customeHandler2);
        customeHandler2.setNextHandler(customeHandler3);
        customeHandler3.setNextHandler(customeHandler4);
        customeHandler4.setNextHandler(customeHandler5);
        customeHandler5.setNextHandler(customeHandler6);
        customeHandler1.doHandler();
    }
}
