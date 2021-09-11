package DesignPatterns.Behavioural.Observer.Interfaces;

import DesignPatterns.Behavioural.Observer.Concretes.User;

public interface INotificationManager {
    public void unSubscribe(String eventName);
    public void subscribe(String eventName);
    public void Notify(User user);


}
