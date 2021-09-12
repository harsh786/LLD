package LLDProblems.BillSharingApp.Concretes;

import LLDProblems.BillSharingApp.Entity.UserEntity;
import LLDProblems.BillSharingApp.Exceptions.BillSharingException;
import LLDProblems.BillSharingApp.Interfaces.IBillSharingSplitService;
import LLDProblems.BillSharingApp.Interfaces.IBillSharingUserService;
import LLDProblems.BillSharingApp.SplitDetailsDto;
import java.util.*;

public class BillSharingSplitService implements IBillSharingSplitService {

    private IBillSharingUserService billSharingUserService;
    public BillSharingSplitService(IBillSharingUserService billSharingUserService){
    this.billSharingUserService = billSharingUserService;
    }

    public int getFilteredSplitUserListCount(SplitDetailsDto splitDetailsDto){

        return splitDetailsDto.getSplitUserList().size()+1;
    }
    public double getSplitAmount(int splitUserCount,double paidAmount){
     return paidAmount/splitUserCount;
    }

    public void splitBillAmongUser(SplitDetailsDto splitDetailsDto, double splitAmount) throws BillSharingException {
        UserEntity billPaidByUserEntity= billSharingUserService.getUser(splitDetailsDto.getBillPaidByUser());
        billPaidByUserEntity.setPaid(splitDetailsDto.getPaidAmount());
        billPaidByUserEntity.setOwe(splitAmount);
        for(String user:splitDetailsDto.getSplitUserList()){
            billSharingUserService.getUser(user).setOwe(splitAmount);
        }

        addLentMoneyAgainstUser(splitDetailsDto,splitAmount,billPaidByUserEntity);

    }

    private void addLentMoneyAgainstUser(SplitDetailsDto splitDetailsDto, double splitAmount,UserEntity billPaidByUserEntity) throws BillSharingException {
        Map<UserEntity,Double>mappedUserEntityList= billPaidByUserEntity.getMappedUserEntityList();
        for(String user:splitDetailsDto.getSplitUserList()){
           UserEntity oweUserEntity= billSharingUserService.getUser(user);
            if(mappedUserEntityList.containsKey(oweUserEntity)){
                mappedUserEntityList.put(oweUserEntity,mappedUserEntityList.get(oweUserEntity)+splitAmount);
            }
        }
    }

    public void settleAmount(String fromUserName, String toUserName, double settleAmount) throws BillSharingException {
        SplitDetailsDto splitDetailsDto=new SplitDetailsDto();
        splitDetailsDto.setBillPaidByUser(fromUserName);
        splitDetailsDto.setSplitUserList(Arrays.asList(toUserName));
        splitDetailsDto.setPaidAmount(settleAmount);
        UserEntity billPaidByUserEntity= billSharingUserService.getUser(splitDetailsDto.getBillPaidByUser());
        UserEntity billToUserEntity= billSharingUserService.getUser(splitDetailsDto.getBillPaidByUser());

        billPaidByUserEntity.setPaid(settleAmount);
        billToUserEntity.setOwe(settleAmount);
        addLentMoneyAgainstUser(splitDetailsDto,settleAmount,billPaidByUserEntity);
    }
}
