package main.gof.behaviour.chainOfResponsibility.handlers;

import main.gof.behaviour.chainOfResponsibility.EmailsEnum;

public class EmailComplains extends EmailHandler {

    public void handleRequest(EmailsEnum request) {
        if (request == EmailsEnum.COMPLAIN) {
            System.out.println("Complain email will be handling");
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
