package DesignPatterns.Structural.Bridge.Concretes;

import DesignPatterns.Structural.Bridge.Interfaces.IColor;
import DesignPatterns.Structural.Bridge.Interfaces.IShape;

public class CircleShape implements IShape {

    protected IColor color;
    public CircleShape(IColor color){
        this.color=color;
    }

    @Override
    public void showShapeName() {
        System.out.println("Circle shape is of:"+color.showColorName()+" color");
    }
}
