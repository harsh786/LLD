package DesignPatterns.Behavioural.Iterater.Concretes;

import DesignPatterns.Behavioural.Iterater.Interfaces.IteratableCollection;
import DesignPatterns.Behavioural.Iterater.Interfaces.Iterator;

public class UserCollection implements IteratableCollection {

    @Override
    public Iterator getIterator() {
        return new UserIterator(this);
    }
}
