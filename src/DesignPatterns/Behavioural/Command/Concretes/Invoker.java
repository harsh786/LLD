package DesignPatterns.Behavioural.Command.Concretes;

import DesignPatterns.Behavioural.Command.Interfaces.ICommand;

public class Invoker {
  Receiver receiver=null;
  public Invoker(){
    receiver=new Receiver();
  }

  public void add(int data){
    execute(new AddCommand(receiver),data);
    System.out.println("Value after Adding:"+receiver.getInitial());
  }
  public void subract(int data){
    execute(new SubractCommand(receiver),data);
    System.out.println("Value after subract:"+receiver.getInitial());
  }
  public void multiply(int data){
    execute(new MultiplyCommand(receiver),data);
    System.out.println("Value after multiply:"+receiver.getInitial());
  }
  public void divide(int data){
    execute(new DivideCommand(receiver),data);
    System.out.println("Value after divide:"+receiver.getInitial());
  }

  private void execute(ICommand command,int data)
  {
    command.execute(data);

  }

  private void unExecute(ICommand command,int data)
  {
    command.unExecute(data);
  }

}
