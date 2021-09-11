package DesignPatterns.Behavioural.Visitor.Interfaces;

public interface IElement {
    public int accept(IShoppingCartVisitor visitor);
}
