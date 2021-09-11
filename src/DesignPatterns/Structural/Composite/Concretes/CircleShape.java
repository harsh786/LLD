package DesignPatterns.Structural.Composite.Concretes;


import DesignPatterns.Structural.Composite.Interfaces.IShape;

public class CircleShape implements IShape {

    protected double radius;
    public CircleShape(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea() {
        return 3.14*radius*radius;
    }
}
