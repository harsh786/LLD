package DesignPatterns.Behavioural.ChainOfResponsiblity.Interfaces;

import DesignPatterns.Behavioural.ChainOfResponsiblity.UserData;
import DesignPatterns.Behavioural.ChainOfResponsiblity.UserValidationException;

public abstract class AbstractMiddleware implements IMiddleware {
    public IMiddleware next;
    @Override
    public IMiddleware setNext(IMiddleware middleware) {
        this.next=middleware;
        return next;
    }

    public void callNext(UserData userData) throws UserValidationException {
        if(next==null){
            return;
        }else{
            next.doOperation(userData);
        }
    }

    public abstract void doOperation(UserData userData) throws UserValidationException;

}
