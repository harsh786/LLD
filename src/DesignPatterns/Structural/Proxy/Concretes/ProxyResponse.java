package DesignPatterns.Structural.Proxy.Concretes;

import DesignPatterns.Structural.Proxy.Interfaces.IProxyResponse;
import DesignPatterns.Structural.Proxy.Interfaces.IResponse;

public class ProxyResponse implements IProxyResponse {
    IResponse response=null;
    public ProxyResponse(){
        response=new Response();
    }

    @Override
    public void sendData() {
        response.sendData();
        System.out.println("Cache the response class data response");
    }
}
