package LLDProblems.BillSharingApp;

import LLDProblems.BillSharingApp.Concretes.*;
import LLDProblems.BillSharingApp.Entity.UserEntity;
import LLDProblems.BillSharingApp.Exceptions.BillSharingException;
import LLDProblems.BillSharingApp.Interfaces.IBillSharingUserService;

import java.util.Arrays;

public class BillSharingClient {
    /*
      1.Pay:Split user:Amount
      2.Settle:(from: to Amount)
      3.Give-Borrowed
      

     */
    public static void main(String[] args) {

        BillSharingSystem billSharingSystem= BillSharingSystem.getInstance();
        UserEntity user1=new UserEntity();
        user1.setName("Harsh");
        UserEntity user2=new UserEntity();
        user2.setName("Gaurav");
        UserEntity user3=new UserEntity();
        user3.setName("Anu");
        UserEntity user4=new UserEntity();
        user4.setName("Ojasvi");
        try {
            billSharingSystem.addUserEntity(user1);
            billSharingSystem.addUserEntity(user2);
            billSharingSystem.addUserEntity(user3);
            billSharingSystem.addUserEntity(user4);

            billSharingSystem.addUserInFriendList(user1.getName(),user2.getName());
            billSharingSystem.addUserInFriendList(user1.getName(),user3.getName());
            billSharingSystem.addUserInFriendList(user1.getName(),user4.getName());
            billSharingSystem.addUserInFriendList(user2.getName(),user3.getName());
            billSharingSystem.addUserInFriendList(user2.getName(),user4.getName());
            billSharingSystem.addUserInFriendList(user3.getName(),user4.getName());
        } catch (BillSharingException e) {
            e.printStackTrace();
        }

        IBillSharingUserService billSharingUserService =new BillSharingUserService();
        BillSharingManagerService billSharingManagerService=new BillSharingManagerService(
                new BillSharingValidationService(),
                new BillSharingSplitService(billSharingUserService),
                new BillSharingUserHistoryService(),
                billSharingUserService

        );

        SplitDetailsDto splitDetailsDto=new SplitDetailsDto();
        splitDetailsDto.setPaidAmount(1000);
        splitDetailsDto.setBillPaidByUser(user1.getName());
        splitDetailsDto.setUserAccountId(user1.getName());
        splitDetailsDto.setSplitUserList(Arrays.asList(user2.getName(),user3.getName(),user4.getName()));
        try {
            billSharingManagerService.addBill(splitDetailsDto);
        } catch (BillSharingException e) {
            e.printStackTrace();
        }

        billSharingManagerService.showUserBillInfo();
        try {
            billSharingManagerService.settleAmount(user2.getName(), user1.getName(),500);
            billSharingManagerService.settleAmount(user1.getName(), user2.getName(),250);
            billSharingManagerService.settleAmount(user3.getName(), user1.getName(),250);
            billSharingManagerService.settleAmount(user4.getName(), user1.getName(),251.10);
        } catch (BillSharingException e) {
            e.printStackTrace();
        }
        billSharingManagerService.showUserBillInfo();

    }
}
