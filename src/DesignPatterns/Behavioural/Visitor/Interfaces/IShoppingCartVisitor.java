package DesignPatterns.Behavioural.Visitor.Interfaces;

import DesignPatterns.Behavioural.Visitor.Concretes.Book;
import DesignPatterns.Behavioural.Visitor.Concretes.Fruit;

public interface IShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
