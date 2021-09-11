package DesignPatterns.Structural.Decorater.Concretes;

import DesignPatterns.Structural.Decorater.Interfaces.INotification;

public class SMS implements INotification {

    @Override
    public void send() {
       System.out.println("SMS is sent");
    }
}
