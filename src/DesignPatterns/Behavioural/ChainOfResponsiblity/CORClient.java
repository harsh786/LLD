package DesignPatterns.Behavioural.ChainOfResponsiblity;

import DesignPatterns.Behavioural.ChainOfResponsiblity.Concretes.AuthenticationMiddleware;
import DesignPatterns.Behavioural.ChainOfResponsiblity.Concretes.AuthorizationMiddleware;
import DesignPatterns.Behavioural.ChainOfResponsiblity.Interfaces.IMiddleware;

public class CORClient {

    public static void main(String[] args) {

        IMiddleware authenticationMiddleware=new AuthenticationMiddleware();
        IMiddleware authorizationMiddleware=new AuthorizationMiddleware();


        IMiddleware start=authenticationMiddleware;
        start.setNext(authorizationMiddleware);


        try{
            UserData userData=new UserData();
            userData.setUsername("harsh");
            userData.setPassword("786");
            start.doOperation(userData);
            System.out.println("User is valid");
        }catch(UserValidationException ex){
           System.out.println(ex.toString());
        }

    }



}
