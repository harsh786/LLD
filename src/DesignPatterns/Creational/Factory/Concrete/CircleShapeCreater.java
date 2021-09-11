package DesignPatterns.Creational.Factory.Concrete;

import DesignPatterns.Creational.Factory.Interfaces.AbstractBaseShapeCreater;
import DesignPatterns.Creational.Factory.Interfaces.IShape;
import DesignPatterns.Creational.Factory.Interfaces.ShapeFactory;

public class CircleShapeCreater extends AbstractBaseShapeCreater {
    @Override
    public IShape createShape() {
      return new CircleShape();
    }

    @Override
    public IShape createShapeThroughStaticFactoryMethod() {
        return ShapeFactory.createShape("circle");
    }
}
