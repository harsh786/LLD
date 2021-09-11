package DesignPatterns.Structural.Bridge.Interfaces;

import DesignPatterns.Structural.Bridge.EnumColor;

public abstract class AbstractBaseColor implements  IColor{
    protected EnumColor color;
    public AbstractBaseColor(EnumColor color){
        this.color=color;
    }
}
