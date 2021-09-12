package LLDProblems.BillSharingApp.Concretes;
import LLDProblems.BillSharingApp.Entity.UserEntity;
import LLDProblems.BillSharingApp.Exceptions.BillSharingException;
import LLDProblems.BillSharingApp.Interfaces.IBillSharingValidationService;
import LLDProblems.BillSharingApp.SplitDetailsDto;

import java.util.*;
public class BillSharingValidationService implements IBillSharingValidationService {
    private BillSharingUserService billSharingUserService;
    public BillSharingValidationService(){
        billSharingUserService =new BillSharingUserService();
    }

    public void isBillCanSplit(SplitDetailsDto splitDetailsDto) throws BillSharingException {

        if(!(splitDetailsDto.getUserAccountId().equalsIgnoreCase(splitDetailsDto.getBillPaidByUser()) ||
                splitDetailsDto.getSplitUserList().contains(splitDetailsDto.getUserAccountId())
        )){
             throw  new BillSharingException("BILL CANNOT BE SPLIT");
          }

        UserEntity billPaidByUser= billSharingUserService.getUser(splitDetailsDto.getBillPaidByUser());
        Map<UserEntity,Double> userEntityMap=  billPaidByUser.getMappedUserEntityList();
        for(String user:splitDetailsDto.getSplitUserList()){
            if(!userEntityMap.containsKey(billSharingUserService.getUser(user))){
                throw  new BillSharingException("BILL CANNOT BE SPLIT BECAUSE USER NOT NOWN EACH OTHER");
            }
        }



    }

}
