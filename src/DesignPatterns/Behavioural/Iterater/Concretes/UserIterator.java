package DesignPatterns.Behavioural.Iterater.Concretes;

import DesignPatterns.Behavioural.Iterater.Interfaces.Iterator;
import DesignPatterns.Behavioural.Iterater.User;

public class UserIterator implements Iterator {
    UserCollection userCollection=null;

    public UserIterator(UserCollection userCollection){
        userCollection=userCollection;
    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public User getNext() {
        return null;
    }
}
