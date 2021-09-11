package DesignPatterns.Structural.Adapter;

import DesignPatterns.Structural.Adapter.Concretes.Adaptee;
import DesignPatterns.Structural.Adapter.Concretes.Adapter;
import DesignPatterns.Structural.Adapter.Interfaces.IAdapter;

public class AdapterClient {
    public static void main(String[] args) {
          IAdapter adapter=new Adapter(new Adaptee());
          adapter.request();

    }
}
