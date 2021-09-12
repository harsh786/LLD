package LLDProblems.BillSharingApp.Interfaces;

import LLDProblems.BillSharingApp.Entity.UserEntity;
import LLDProblems.BillSharingApp.Exceptions.BillSharingException;

public interface IBillSharingUserService {
    public UserEntity getUser(String userName) throws BillSharingException;
    public void addUser(UserEntity userEntity) throws BillSharingException;
    public void addUserInFriendList(String from, String to) throws BillSharingException;
    public void showUserBillInfo();
}
