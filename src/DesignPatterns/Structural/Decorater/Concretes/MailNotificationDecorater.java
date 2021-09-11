package DesignPatterns.Structural.Decorater.Concretes;

import DesignPatterns.Structural.Decorater.Interfaces.AbstractBaseNotificationDecorater;
import DesignPatterns.Structural.Decorater.Interfaces.INotification;

public class MailNotificationDecorater extends AbstractBaseNotificationDecorater {

    public MailNotificationDecorater(INotification notification){
        super(notification);
    }
    @Override
    public void send() {
        super.notification.send();
        System.out.println("Mail is sent");
    }
}
