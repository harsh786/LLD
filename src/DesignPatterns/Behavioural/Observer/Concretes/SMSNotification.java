package DesignPatterns.Behavioural.Observer.Concretes;

import DesignPatterns.Behavioural.Observer.Interfaces.INotificationService;
import DesignPatterns.Structural.Decorater.Interfaces.INotification;

public class SMSNotification implements INotificationService {

    @Override
    public void Send(User user) {
        System.out.println("SMS is sent to user:"+user.getUsername());
    }
}
