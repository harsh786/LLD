package DesignPatterns.Creational.Factory.Interfaces;

import DesignPatterns.Creational.Factory.Interfaces.IShape;
import DesignPatterns.Creational.Factory.Interfaces.IShapeCreater;

public abstract class AbstractBaseShapeCreater implements IShapeCreater {

    protected IShape shape;
   public abstract IShape createShape();
   public abstract IShape createShapeThroughStaticFactoryMethod();

    @Override
    public void displayShape() {
        shape=createShape();
        shape.display();
    }

    @Override
    public void displayShapeThroughStaticFactoryMethod() {
        shape=createShapeThroughStaticFactoryMethod();
        shape.display();
    }


}
