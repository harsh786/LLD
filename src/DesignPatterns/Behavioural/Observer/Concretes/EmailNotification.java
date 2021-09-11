package DesignPatterns.Behavioural.Observer.Concretes;

import DesignPatterns.Behavioural.Observer.Interfaces.INotificationService;

public class EmailNotification implements INotificationService {

    @Override
    public void Send(User user) {
        System.out.println("Email is sent to user:"+user.getUsername());
    }
}
