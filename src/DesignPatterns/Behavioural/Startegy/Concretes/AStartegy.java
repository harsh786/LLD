package DesignPatterns.Behavioural.Startegy.Concretes;

import DesignPatterns.Behavioural.Startegy.Interfaces.IStartegy;

public class AStartegy implements IStartegy {
    @Override
    public void compute() {
        System.out.println("AStartegy");
    }
}
