package main.gof.behaviour.chainOfResponsibility.handlers;

import main.gof.behaviour.chainOfResponsibility.EmailsEnum;

public abstract class EmailHandler {
    EmailHandler successor;

    public void setHandler(EmailHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(EmailsEnum request);
}
