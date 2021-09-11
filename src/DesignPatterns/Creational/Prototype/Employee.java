package DesignPatterns.Creational.Prototype;

public class Employee implements IClonable{


    private long id;
    private String name;
    private String rollNo;

    public Employee(){

    }

    public Employee(Employee target)
    {
        if(target!=null){
           this.setId(target.getId());
           this.setName(target.getName());
           this.setRollNo(target.getRollNo());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public Employee clone() {
      return new Employee(this);
    }
}
