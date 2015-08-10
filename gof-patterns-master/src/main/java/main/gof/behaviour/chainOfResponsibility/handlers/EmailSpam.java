package main.gof.behaviour.chainOfResponsibility.handlers;

import main.gof.behaviour.chainOfResponsibility.EmailsEnum;

public class EmailSpam extends EmailHandler {

    public void handleRequest(EmailsEnum request) {
        if (request == EmailsEnum.SPAM) {
            System.out.println("Spam email will be handling");
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
