package DesignPatterns.Structural.Proxy.Concretes;

import DesignPatterns.Structural.Proxy.Interfaces.IResponse;

public class Response implements IResponse {
    @Override
    public void sendData() {
        System.out.println("Send response from response class");
    }
}
