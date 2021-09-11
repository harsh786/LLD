package DesignPatterns.Structural.Decorater.Interfaces;

public  abstract class AbstractBaseNotificationDecorater implements INotification {

    public INotification notification=null;
    public AbstractBaseNotificationDecorater(INotification notification){
        this.notification=notification;
    }
    abstract public void send();

}
