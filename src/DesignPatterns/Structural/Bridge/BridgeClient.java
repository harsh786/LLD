package DesignPatterns.Structural.Bridge;

import DesignPatterns.Structural.Bridge.Concretes.CircleShape;
import DesignPatterns.Structural.Bridge.Concretes.RedColor;
import DesignPatterns.Structural.Bridge.Interfaces.IColor;
import DesignPatterns.Structural.Bridge.Interfaces.IShape;

public class BridgeClient {
    public static void main(String[] args) {
        IColor color=new RedColor();
        IShape shape=new CircleShape(color);
        shape.showShapeName();
    }
}
