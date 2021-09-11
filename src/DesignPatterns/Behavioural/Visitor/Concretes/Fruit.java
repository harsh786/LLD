package DesignPatterns.Behavioural.Visitor.Concretes;

import DesignPatterns.Behavioural.Visitor.Interfaces.IShoppingCartVisitor;
import DesignPatterns.Behavioural.Visitor.Interfaces.IElement;

public class Fruit implements IElement
{
    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int priceKg, int wt, String nm)
    {
        this.pricePerKg=priceKg;
        this.weight=wt;
        this.name = nm;
    }

    public int getPricePerKg()
    {
        return pricePerKg;
    }

    public int getWeight()
    {
        return weight;
    }

    public String getName()
    {
        return this.name;
    }

    @Override
    public int accept(IShoppingCartVisitor visitor)
    {
        return visitor.visit(this);
    }

}
