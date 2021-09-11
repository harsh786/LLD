package DesignPatterns.Structural.Decorater;

import DesignPatterns.Structural.Decorater.Concretes.MailNotificationDecorater;
import DesignPatterns.Structural.Decorater.Concretes.SMS;
import DesignPatterns.Structural.Decorater.Interfaces.INotification;

public class DecoraterClient {
    public static void main(String[] args) {

        INotification notification=new SMS();
        notification.send();

        INotification notificationDecorater= new MailNotificationDecorater(notification);
        notificationDecorater.send();
    }
}
