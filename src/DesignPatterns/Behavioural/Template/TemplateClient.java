package DesignPatterns.Behavioural.Template;


import DesignPatterns.Behavioural.Template.Concretes.AStartegy;
import DesignPatterns.Behavioural.Template.Concretes.BStartegy;
import DesignPatterns.Behavioural.Template.Concretes.Context;

public class TemplateClient {

    public static void main(String[] args) {
        Context ob=new Context(new BStartegy());
        ob.compute();
    }
}
