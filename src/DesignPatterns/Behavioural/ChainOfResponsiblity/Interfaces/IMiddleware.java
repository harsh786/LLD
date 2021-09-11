package DesignPatterns.Behavioural.ChainOfResponsiblity.Interfaces;

import DesignPatterns.Behavioural.ChainOfResponsiblity.UserData;
import DesignPatterns.Behavioural.ChainOfResponsiblity.UserValidationException;

public interface IMiddleware {

    public IMiddleware setNext(IMiddleware middleware);
    public void doOperation(UserData userData) throws UserValidationException;


}
