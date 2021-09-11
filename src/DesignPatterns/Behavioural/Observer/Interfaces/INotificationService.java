package DesignPatterns.Behavioural.Observer.Interfaces;

import DesignPatterns.Behavioural.Observer.Concretes.User;

public interface INotificationService {
    public void Send(User user);
}
