package DesignPatterns.Behavioural.ChainOfResponsiblity.Concretes;

import DesignPatterns.Behavioural.ChainOfResponsiblity.Interfaces.AbstractMiddleware;
import DesignPatterns.Behavioural.ChainOfResponsiblity.Interfaces.IMiddleware;
import DesignPatterns.Behavioural.ChainOfResponsiblity.UserData;
import DesignPatterns.Behavioural.ChainOfResponsiblity.UserValidationException;

public class AuthenticationMiddleware extends AbstractMiddleware  {

    @Override
    public void doOperation(UserData userData)  throws UserValidationException {
        if(checkUsernamePasswordIsValid(userData)){
            callNext(userData);
        }else{
             throw new UserValidationException("Authentication failed");
        }
    }

    private boolean checkUsernamePasswordIsValid(UserData userData){
        if(userData.getUsername().equalsIgnoreCase("harsh") &&
                userData.getPassword().equalsIgnoreCase("786")){
         return true;
        }
        return false;
    }
}
