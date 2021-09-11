package DesignPatterns.Structural.Composite;


import DesignPatterns.Structural.Composite.Concretes.CircleShape;
import DesignPatterns.Structural.Composite.Concretes.CompoundShape;
import DesignPatterns.Structural.Composite.Concretes.SquareShape;
import DesignPatterns.Structural.Composite.Interfaces.IShape;

public class CompositeClient {
    public static void main(String[] args) {
        IShape circle=new CircleShape(2.0);
        System.out.println("Calculate total area:"+circle.calculateArea());

        CompoundShape compound=new CompoundShape();
        compound.add(circle);
        compound.add(new SquareShape(2,3));
        System.out.println("Calculate total area:"+compound.calculateArea());

    }
}
