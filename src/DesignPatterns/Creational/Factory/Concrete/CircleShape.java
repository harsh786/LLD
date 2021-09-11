package DesignPatterns.Creational.Factory.Concrete;

import DesignPatterns.Creational.Factory.Interfaces.IShape;

public class CircleShape implements IShape {
    @Override
    public void display() {
       System.out.println("This is circle");
    }
}
