package main.gof.behaviour.chainOfResponsibility;

import main.gof.behaviour.chainOfResponsibility.handlers.EmailComplains;
import main.gof.behaviour.chainOfResponsibility.handlers.EmailHandler;
import main.gof.behaviour.chainOfResponsibility.handlers.EmailOrder;
import main.gof.behaviour.chainOfResponsibility.handlers.EmailSpam;

/**
 * Created by zmax.
 */
public class ChainResponsibility {

    /**
     * Method provide to set up chain of responsibility
     *
     * @return chain of responsibility
     */
    public static EmailHandler setUpChainOfResponsibility() {
        EmailHandler requestHandler = new EmailOrder();
        EmailHandler spamHandler = new EmailSpam();
        EmailHandler complainsHandler = new EmailComplains();

        //make chain of responsibility
        requestHandler.setHandler(spamHandler);
        spamHandler.setHandler(complainsHandler);

        return requestHandler;
    }

}