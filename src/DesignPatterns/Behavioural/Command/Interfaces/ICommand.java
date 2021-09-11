package DesignPatterns.Behavioural.Command.Interfaces;

public interface ICommand {
    public void execute(int data);
    public void unExecute(int data);
}
