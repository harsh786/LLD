package DesignPatterns.Behavioural.Template.Concretes;

import DesignPatterns.Behavioural.Startegy.Interfaces.IStartegy;
import DesignPatterns.Behavioural.Template.Interfaces.AbstractBaseTemplate;

public class BStartegy extends AbstractBaseTemplate {

    @Override
    protected String getData() {
        return "Data from B startgey";
    }

}
