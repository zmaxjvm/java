package main.gof.behaviour.chainOfResponsibility;

import main.gof.behaviour.chainOfResponsibility.handlers.EmailHandler;
import org.junit.Test;

public class ChainResponsibilityTest {

    @Test
    public void chainResponsibilityTest() {
        EmailHandler chainMails = ChainResponsibility.setUpChainOfResponsibility();

        chainMails.handleRequest(EmailsEnum.COMPLAIN);
        chainMails.handleRequest(EmailsEnum.SPAM);
        chainMails.handleRequest(EmailsEnum.ORDER);
        chainMails.handleRequest(EmailsEnum.SPAM);

    }

}
