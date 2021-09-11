package DesignPatterns.Behavioural.Command.Concretes;

import DesignPatterns.Behavioural.Command.Interfaces.ICommand;

public abstract class AbstractBaseCommand implements ICommand {
    protected Receiver receiver;
    public AbstractBaseCommand(Receiver receiver){
        this.receiver=receiver;
    }

    public abstract void execute(int data);
    public abstract void unExecute(int data);

}
