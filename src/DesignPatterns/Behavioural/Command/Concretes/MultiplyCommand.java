package DesignPatterns.Behavioural.Command.Concretes;

import DesignPatterns.Behavioural.Command.Interfaces.ICommand;

public class MultiplyCommand extends AbstractBaseCommand {
    public MultiplyCommand(Receiver receiver) {
        super(receiver);
    }


    @Override
    public void execute(int data) {
        super.receiver.setInitial(super.receiver.getInitial()*data);
    }

    @Override
    public void unExecute(int data) {
        super.receiver.setInitial(super.receiver.getInitial()/data);
    }
}
