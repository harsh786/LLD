package DesignPatterns.Behavioural.State.Concretes;

import DesignPatterns.Behavioural.State.EnumTrafficLightState;
import DesignPatterns.Behavioural.State.Interfaces.ITrafficLight;

public class YellowTrafficLightState extends AbstractBaseTrafficLightState {

    public YellowTrafficLightState(TrafficLight trafficLight,int timer) {
        super(trafficLight,timer);
    }

    @Override
    public void handle() {
        try {
            Thread.sleep(super.trafficLightTimer);
            super.trafficLight.updateCurrentState(EnumTrafficLightState.GREEN);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
