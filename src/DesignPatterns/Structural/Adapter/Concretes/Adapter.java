package DesignPatterns.Structural.Adapter.Concretes;

import DesignPatterns.Structural.Adapter.Interfaces.IAdaptee;
import DesignPatterns.Structural.Adapter.Interfaces.IAdapter;

public class Adapter implements IAdapter {
    IAdaptee adaptee=null;
    public Adapter(IAdaptee adaptee)
    {
        this.adaptee=adaptee;
    }
     @Override
    public void request(){
        System.out.println("adapter request is called");
        adaptee.request();
    }

}
