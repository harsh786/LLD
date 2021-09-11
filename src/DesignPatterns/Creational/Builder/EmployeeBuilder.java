package DesignPatterns.Creational.Builder;

public class EmployeeBuilder {

        private long id;
        private String name;
        private String rollNo;

        private EmployeeBuilder()
        {

        }
        public static EmployeeBuilder getBuilder()
        {
            return new EmployeeBuilder();
        }


        public EmployeeBuilder setId(int id){
            this.id=id;
            return this;
        }

        public EmployeeBuilder setName(String name){
            this.name=name;
            return this;
        }

        public EmployeeBuilder setRollNo(String rollNo){
            this.rollNo=rollNo;
            return this;
        }

        public Employee build()
        {
            Employee emp=new Employee();
            emp.setRollNo(this.rollNo);
            emp.setId(this.id);
            emp.setName(this.name);
            return emp;
        }




}
