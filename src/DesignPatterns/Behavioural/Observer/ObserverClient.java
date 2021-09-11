package DesignPatterns.Behavioural.Observer;

import DesignPatterns.Behavioural.Observer.Concretes.NotificationManager;
import DesignPatterns.Behavioural.Observer.Concretes.User;
import DesignPatterns.Behavioural.Observer.Interfaces.INotificationManager;

import java.util.Arrays;

public class ObserverClient {

    public static void main(String[] args) {
      User user=new User();
      user.setUsername("harsh");
        INotificationManager notificationManger=new NotificationManager(Arrays.asList("SMS","EMAIL"));
        notificationManger.Notify(user);
        notificationManger.unSubscribe("SMS");
        notificationManger.Notify(user);
    }
}
