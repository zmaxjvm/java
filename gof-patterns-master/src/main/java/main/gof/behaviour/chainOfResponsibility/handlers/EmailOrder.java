package main.gof.behaviour.chainOfResponsibility.handlers;

import main.gof.behaviour.chainOfResponsibility.EmailsEnum;

public class EmailOrder extends EmailHandler {

    public void handleRequest(EmailsEnum request) {
        if (request == EmailsEnum.ORDER) {
            System.out.println("Order email will be handling");
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
