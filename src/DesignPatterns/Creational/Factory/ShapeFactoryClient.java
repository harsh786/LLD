package DesignPatterns.Creational.Factory;

import DesignPatterns.Creational.Factory.Concrete.CircleShapeCreater;
import DesignPatterns.Creational.Factory.Concrete.SquareShapeCreater;

public class ShapeFactoryClient {

    public static void main(String[] args) {
        CircleShapeCreater circleShapeCreater=new CircleShapeCreater();
        circleShapeCreater.displayShape();

        SquareShapeCreater squareShapeCreater=new SquareShapeCreater();
        squareShapeCreater.displayShapeThroughStaticFactoryMethod();
    }
}
