package DesignPatterns.Creational.Factory.Interfaces;

import DesignPatterns.Creational.Factory.Concrete.CircleShape;
import DesignPatterns.Creational.Factory.Concrete.SquareShape;

import java.util.HashMap;
import java.util.Map;

public  class ShapeFactory {
  static Map<String, IShape> map=null;
    static{
        map=new HashMap<String,IShape>();
        map.put("circle",new CircleShape());
        map.put("square",new SquareShape());
    }

    public static IShape createShape(String shapeName)
    {
        IShape shape=null;
        return map.get(shapeName);
    }
}
