package DesignPatterns.Behavioural.Template.Interfaces;

public abstract class AbstractBaseTemplate implements IStartegy{
    @Override
    public void compute(){
        /*
        Here we create a template at run time we decide which implementation will be called
         */
        System.out.println("Data compute in class plus from data strategy:"+getData());

    }

    protected  abstract String getData();
}
