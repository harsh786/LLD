package DesignPatterns.Structural.Adapter.Concretes;

import DesignPatterns.Structural.Adapter.Interfaces.IAdaptee;

public class Adaptee implements IAdaptee {
    @Override
    public void request() {
        System.out.println("adaptee is called");
    }
}
