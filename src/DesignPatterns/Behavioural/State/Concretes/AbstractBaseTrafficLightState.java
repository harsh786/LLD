package DesignPatterns.Behavioural.State.Concretes;

import DesignPatterns.Behavioural.State.Interfaces.ITrafficLight;
import DesignPatterns.Behavioural.State.Interfaces.ITrafficLightState;

public abstract class AbstractBaseTrafficLightState implements ITrafficLightState {

   protected TrafficLight trafficLight;
   protected int trafficLightTimer;
   public AbstractBaseTrafficLightState(TrafficLight trafficLight,int trafficLightTimer){
     this.trafficLight=trafficLight;
     this.trafficLightTimer=trafficLightTimer;
   }
    public abstract void handle();
}
