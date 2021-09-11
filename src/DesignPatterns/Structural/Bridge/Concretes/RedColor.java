package DesignPatterns.Structural.Bridge.Concretes;

import DesignPatterns.Structural.Bridge.EnumColor;
import DesignPatterns.Structural.Bridge.Interfaces.AbstractBaseColor;
import DesignPatterns.Structural.Bridge.Interfaces.IColor;

public class RedColor extends AbstractBaseColor {
    public RedColor(){
        super(EnumColor.RED);
    }
    @Override
    public String showColorName() {
        return super.color.toString();
    }
}
