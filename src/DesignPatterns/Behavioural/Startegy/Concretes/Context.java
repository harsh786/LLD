package DesignPatterns.Behavioural.Startegy.Concretes;

import DesignPatterns.Behavioural.Startegy.Interfaces.IStartegy;

public class Context {
    IStartegy startegy=null;
    public Context(IStartegy startegy){
        this.startegy=startegy;
    }
    public void compute()
    {
        startegy.compute();
    }
}
