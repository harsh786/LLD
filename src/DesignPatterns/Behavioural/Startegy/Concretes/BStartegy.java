package DesignPatterns.Behavioural.Startegy.Concretes;

import DesignPatterns.Behavioural.Startegy.Interfaces.IStartegy;

public class BStartegy implements IStartegy {
    @Override
    public void compute() {
        System.out.println("BStartegy");
    }

}
