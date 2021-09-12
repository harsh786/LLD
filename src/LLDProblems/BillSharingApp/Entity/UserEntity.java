package LLDProblems.BillSharingApp.Entity;
import java.util.*;

public class UserEntity {

    private String name;
    private double owe;
    private double paid;
    private Map<UserEntity,Double>mappedUserEntityList;
    private List<String> historyList;

    public UserEntity(){
        owe=0.0;
        paid=0.0;
        mappedUserEntityList=new HashMap<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOwe() {
        return owe;
    }

    public void setOwe(double owe) {
        this.owe += owe;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid+= paid;
    }

    public Map<UserEntity,Double> getMappedUserEntityList() {
        return mappedUserEntityList;
    }


    public void addUserInfFriendList(UserEntity userEntity) {
        this.mappedUserEntityList.put(userEntity,0.0);
    }

    public List<String> getHistoryList() {
        return historyList;
    }

    public void setHistoryList(List<String> historyList) {
        this.historyList = historyList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return  Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


}
