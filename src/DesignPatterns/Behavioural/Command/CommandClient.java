package DesignPatterns.Behavioural.Command;

import DesignPatterns.Behavioural.Command.Concretes.Invoker;

public class CommandClient {
    public static void main(String[] args) {
        Invoker invoker=new Invoker();
        invoker.add(10);
        invoker.subract(5);
        invoker.divide(5);
        invoker.multiply(4);
    }


}
