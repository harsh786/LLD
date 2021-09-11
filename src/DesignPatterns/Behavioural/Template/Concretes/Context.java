package DesignPatterns.Behavioural.Template.Concretes;


import DesignPatterns.Behavioural.Template.Interfaces.IStartegy;

public class Context {
    IStartegy strategy=null;
    public Context(IStartegy strategy){
        this.strategy=strategy;
    }
    public void compute()
    {
        strategy.compute();
    }
}
