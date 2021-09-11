package DesignPatterns.Behavioural.Template.Concretes;

import DesignPatterns.Behavioural.Startegy.Interfaces.IStartegy;
import DesignPatterns.Behavioural.Template.Interfaces.AbstractBaseTemplate;

public class AStartegy extends AbstractBaseTemplate {

    @Override
    protected String getData() {
        return "Data from A startgey";
    }
}
