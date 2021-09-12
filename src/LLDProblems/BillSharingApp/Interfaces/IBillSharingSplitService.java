package LLDProblems.BillSharingApp.Interfaces;

import LLDProblems.BillSharingApp.Exceptions.BillSharingException;
import LLDProblems.BillSharingApp.SplitDetailsDto;

public interface IBillSharingSplitService {
    public int getFilteredSplitUserListCount(SplitDetailsDto splitDetailsDto);
    public double getSplitAmount(int splitUserCount,double paidAmount);
    public void splitBillAmongUser(SplitDetailsDto splitDetailsDto, double splitAmount) throws BillSharingException;
    public void settleAmount(String fromUserName, String toUserName, double settleAmount) throws BillSharingException;
}
