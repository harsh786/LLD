package DesignPatterns.Creational.Prototype;

public class PrototypeClient {
    public static void main(String[] args){
        Employee employee=new Employee();
        employee.setRollNo("123");
        employee.setName("harsh");
        employee.setId(1);
        Employee emp= employee.clone();
    }
}
