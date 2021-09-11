package DesignPatterns.Structural.Composite.Concretes;

import DesignPatterns.Structural.Composite.Interfaces.IShape;

public class SquareShape implements IShape {

    protected double length;
    protected double breadth;
    public SquareShape(double length,double breadth){
       this.length=length;
       this.breadth=breadth;
    }
    @Override
    public double calculateArea() {
        return length*breadth;
    }
}
