package DesignPatterns.Behavioural.Visitor;

import DesignPatterns.Behavioural.Visitor.Concretes.Book;
import DesignPatterns.Behavioural.Visitor.Concretes.Fruit;
import DesignPatterns.Behavioural.Visitor.Concretes.ShoppingCartVisitor;
import DesignPatterns.Behavioural.Visitor.Interfaces.IElement;
import DesignPatterns.Behavioural.Visitor.Interfaces.IShoppingCartVisitor;

public class VisitorClient {
    public static void main(String[] args)
    {
        IElement[] items = new IElement[]{new Book(20, "1234"),
                new Book(100, "5678"), new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(IElement[] items)
    {
        IShoppingCartVisitor visitor = new ShoppingCartVisitor();
        int sum=0;
        for(IElement item : items)
        {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
