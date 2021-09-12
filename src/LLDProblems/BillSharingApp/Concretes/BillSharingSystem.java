package LLDProblems.BillSharingApp.Concretes;

import LLDProblems.BillSharingApp.Entity.UserEntity;
import LLDProblems.BillSharingApp.Exceptions.BillSharingException;
import LLDProblems.BillSharingApp.Interfaces.IBillSharingUserService;

import java.util.HashMap;
import java.util.Map;

public class BillSharingSystem {

    private Map<String, UserEntity> userEntityMap;
    private IBillSharingUserService billSharingUserService;
    private static volatile BillSharingSystem instance;
    private BillSharingSystem(){
        userEntityMap=new HashMap<>();
        billSharingUserService =new BillSharingUserService();
    }

    public static BillSharingSystem getInstance(){
        if(instance==null){
            synchronized(BillSharingSystem.class){
                if(instance==null){
                    instance=new BillSharingSystem();
                }
            }
        }
        return instance;
    }

    public Map<String, UserEntity> getUserEntityMap() {
        return userEntityMap;
    }

    public void addUserEntity(UserEntity userEntity) throws BillSharingException {
        billSharingUserService.addUser(userEntity);
    }

    public void addUserInFriendList(String user,String friend) throws BillSharingException {
        billSharingUserService.addUserInFriendList(user,friend);
    }


    public void deleteUserEntity(String userName) throws BillSharingException {
        if(userEntityMap.containsKey(userName)){
            userEntityMap.remove(userName);
        }else{
           throw new BillSharingException("USER NOT EXIST");
        }

    }




}
