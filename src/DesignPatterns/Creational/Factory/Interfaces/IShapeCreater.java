package DesignPatterns.Creational.Factory.Interfaces;

import DesignPatterns.Creational.Factory.Interfaces.IShape;

public interface IShapeCreater {

     IShape createShape();

     IShape createShapeThroughStaticFactoryMethod();

     void displayShape();

     void displayShapeThroughStaticFactoryMethod();
}
