package DesignPatterns.Structural.Composite.Concretes;

import DesignPatterns.Structural.Composite.Interfaces.IShape;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape  implements IShape {

   protected List<IShape> collections=null;
    public CompoundShape(){
        this.collections=new ArrayList<>();
    }
    @Override
    public double calculateArea() {
        double res=0.0;
       for(IShape shape : collections){
            res=res+shape.calculateArea();
        }
       return res;
    }

    public void add(IShape shape){
        collections.add(shape);
    }

    public void remove(IShape shape){
        collections.remove(shape);
    }
}
