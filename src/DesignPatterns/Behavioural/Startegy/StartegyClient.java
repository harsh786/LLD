package DesignPatterns.Behavioural.Startegy;

import DesignPatterns.Behavioural.Startegy.Concretes.AStartegy;
import DesignPatterns.Behavioural.Startegy.Concretes.Context;

public class StartegyClient {

    public static void main(String[] args) {
        Context ob=new Context(new AStartegy());
        ob.compute();
    }
}
