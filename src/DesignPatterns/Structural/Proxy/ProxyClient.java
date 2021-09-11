package DesignPatterns.Structural.Proxy;

import DesignPatterns.Structural.Proxy.Concretes.ProxyResponse;
import DesignPatterns.Structural.Proxy.Interfaces.IProxyResponse;

public class ProxyClient {
    public static void main(String[] args) {

        IProxyResponse response=new ProxyResponse();
        response.sendData();

    }
}
