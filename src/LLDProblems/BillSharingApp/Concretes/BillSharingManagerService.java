package LLDProblems.BillSharingApp.Concretes;

import LLDProblems.BillSharingApp.Entity.UserEntity;
import LLDProblems.BillSharingApp.Exceptions.BillSharingException;
import LLDProblems.BillSharingApp.Interfaces.IBillSharingSplitService;
import LLDProblems.BillSharingApp.Interfaces.IBillSharingValidationService;
import LLDProblems.BillSharingApp.Interfaces.IBillSharingUserService;
import LLDProblems.BillSharingApp.SplitDetailsDto;

public class BillSharingManagerService {

    private IBillSharingValidationService billSharingValidationService;
    private IBillSharingSplitService billSharingSplitService;
    private BillSharingUserHistoryService billSharingUserHistoryService;
    private IBillSharingUserService splitBillUserService;
    public BillSharingManagerService(IBillSharingValidationService billSharingValidationService,
                                     IBillSharingSplitService billSharingSplitService,
                                     BillSharingUserHistoryService billSharingUserHistoryService,
                                     IBillSharingUserService splitBillUserService){
        this.billSharingValidationService=billSharingValidationService;
        this.billSharingSplitService=billSharingSplitService;
        this.billSharingUserHistoryService=billSharingUserHistoryService;
        this.splitBillUserService= splitBillUserService;
    }

    public void addBill(SplitDetailsDto splitDetailsDto) throws BillSharingException {
        billSharingValidationService.isBillCanSplit(splitDetailsDto);
        int splitCount= billSharingSplitService.getFilteredSplitUserListCount(splitDetailsDto);
        double splitAmount= billSharingSplitService.getSplitAmount(splitCount,splitDetailsDto.getPaidAmount());
        billSharingSplitService.splitBillAmongUser(splitDetailsDto,splitAmount);

    }

    public void settleAmount(String fromUserName,String toUserName,double settleAmount) throws BillSharingException {
        billSharingSplitService.settleAmount(fromUserName,toUserName,settleAmount);
    }

    public UserEntity getUserEntityInfo(String userName) throws BillSharingException {
        return splitBillUserService.getUser(userName);
    }

    public void showUserBillInfo(){
        splitBillUserService.showUserBillInfo();
    }

}
