package DesignPatterns.Behavioural.ChainOfResponsiblity.Concretes;

import DesignPatterns.Behavioural.ChainOfResponsiblity.Interfaces.AbstractMiddleware;
import DesignPatterns.Behavioural.ChainOfResponsiblity.UserData;
import DesignPatterns.Behavioural.ChainOfResponsiblity.UserValidationException;

import java.util.*;


public class AuthorizationMiddleware extends AbstractMiddleware {
    static Map<String, List<String>> mapUserRoles = new HashMap<String, List<String>>();
    static{
        mapUserRoles.put("harsh", Arrays.asList("Read","Write"));
        mapUserRoles.put("Gaurav", Arrays.asList("Read"));
    }

    @Override
    public void doOperation(UserData userData) throws UserValidationException {

            if(checkUserHaveValidRole(userData)){
                callNext(userData);
            }else{
                throw new UserValidationException("Authorization failed");
            }
        }

    private boolean checkUserHaveValidRole(UserData userData) {
        if(mapUserRoles.containsKey(userData.getUsername())){
            return mapUserRoles.get(userData.getUsername()).contains("Write");
        }
        return false;
    }
}
