package DesignPatterns.Behavioural.Observer.Concretes;

import DesignPatterns.Behavioural.Observer.Interfaces.INotificationManager;
import DesignPatterns.Behavioural.Observer.Interfaces.INotificationService;

import java.util.HashMap;
import java.util.*;

public class NotificationManager implements INotificationManager {
    private static Map<String, INotificationService> mapEvents=new HashMap<>();
    private  Map<String, INotificationService> notificationMangerEvents=new HashMap<>();
    static{
        mapEvents.put("SMS",new SMSNotification());
        mapEvents.put("EMAIL",new EmailNotification());
    }

    public NotificationManager(List<String>eventsName){
        for(String eventName:eventsName){
            notificationMangerEvents.put(eventName,mapEvents.get(eventName));
        }

    }
    @Override
    public void subscribe(String eventName) {
        notificationMangerEvents.put(eventName,mapEvents.get(eventName));
    }
    @Override
    public void unSubscribe(String eventName) {
        notificationMangerEvents.remove(eventName);
    }

    @Override
    public void Notify(User user) {

        for(Object service:notificationMangerEvents.values().toArray()){
            INotificationService notification=  (INotificationService)service;
            notification.Send(user);
        }
    }
}
