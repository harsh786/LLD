package DesignPatterns.Creational.Builder;

public class EmployeeBuilderClient {

    public static void main(String[] args)
    {
        Employee emp= EmployeeBuilder
                .getBuilder()
                .setId(1)
                .setName("harsh")
                .setRollNo("786")
                .build();

    }
}
