package LLDProblems.BillSharingApp.Concretes;

import LLDProblems.BillSharingApp.Entity.UserEntity;
import LLDProblems.BillSharingApp.Exceptions.BillSharingException;
import LLDProblems.BillSharingApp.Interfaces.IBillSharingUserService;

import java.util.Map;

public class BillSharingUserService implements IBillSharingUserService {

    public BillSharingUserService(){

    }

    public UserEntity getUser(String userName) throws BillSharingException {
       Map<String,UserEntity>userEntityMap= BillSharingSystem.getInstance().getUserEntityMap();
        if(userEntityMap.containsKey(userName)){
            return userEntityMap.get(userName);
        }else{
            throw  new BillSharingException("USER NOT EXIST");
        }
    }

    public void addUser(UserEntity userEntity) throws BillSharingException {
        Map<String,UserEntity>userEntityMap= BillSharingSystem.getInstance().getUserEntityMap();
        if(userEntityMap.containsKey(userEntity.getName())){
            throw  new BillSharingException("USER ALREADY EXIST");
        }else{
            userEntityMap.put(userEntity.getName(),userEntity);
        }
    }

    public void addUserInFriendList(String from, String to) throws BillSharingException {
        Map<String,UserEntity>userEntityMap= BillSharingSystem.getInstance().getUserEntityMap();
        if(!userEntityMap.containsKey(from) || !userEntityMap.containsKey(from) ){
            throw  new BillSharingException("USER NOT EXIST");
        }

        UserEntity fromUserEntity=userEntityMap.get(from);
        UserEntity toUserEntity=userEntityMap.get(to);
        if(fromUserEntity.getMappedUserEntityList().containsKey(toUserEntity)){
            throw  new BillSharingException("USER ALREADY ADDED IN FRIEND LIST");
        }
        fromUserEntity.addUserInfFriendList(toUserEntity);
        toUserEntity.addUserInfFriendList(fromUserEntity);

    }

    public void showUserBillInfo() {
        System.out.println("-----------showUserBillInfo----------");
        Map<String,UserEntity>userEntityMap= BillSharingSystem.getInstance().getUserEntityMap();
        for(Map.Entry<String,UserEntity>kv :userEntityMap.entrySet()){
            System.out.println("");
            System.out.println("For user:"+kv.getKey());
            for(Map.Entry<UserEntity,Double> mappedUserKV: kv.getValue().getMappedUserEntityList().entrySet()){
                //double diff=mappedUserKV.getValue()- .;
                double diff=amountPaid(kv.getKey(),mappedUserKV.getKey().getName())-
                        amountPaid(mappedUserKV.getKey().getName(),kv.getKey());
                if(diff!=0.0){
                    if(diff>0){
                        System.out.println(mappedUserKV.getKey().getName() +" owes you Rs "+ Math.abs(diff));
                    }else{
                        System.out.println("You owe Rs "+Math.abs(diff)+" from "+mappedUserKV.getKey().getName());
                    }
                }else{
                    System.out.println("You settled with "+mappedUserKV.getKey().getName());
                }

            }
        }

    }

    private double amountPaid(String from ,String to){
       UserEntity fromEntity= BillSharingSystem.getInstance().getUserEntityMap().get(from);
       UserEntity toEntity= BillSharingSystem.getInstance().getUserEntityMap().get(to);
       double fromAmount= fromEntity.getMappedUserEntityList().get(toEntity);
       return fromAmount;
    }
}
