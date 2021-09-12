package LLDProblems.BillSharingApp;
import java.util.*;
public class SplitDetailsDto {
    private String userAccountId;
    private String billPaidByUser;
    private List<String>splitUserList;
    private double paidAmount;

    public String getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(String userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getBillPaidByUser() {
        return billPaidByUser;
    }

    public void setBillPaidByUser(String billPaidByUser) {
        this.billPaidByUser = billPaidByUser;
    }

    public List<String> getSplitUserList() {
        return splitUserList;
    }

    public void setSplitUserList(List<String> splitUserList) {
        this.splitUserList = splitUserList;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }
}
