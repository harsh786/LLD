package DesignPatterns.Behavioural.State.Concretes;

import DesignPatterns.Behavioural.State.EnumTrafficLightState;
import DesignPatterns.Behavioural.State.Interfaces.ITrafficLight;
import DesignPatterns.Behavioural.State.Interfaces.ITrafficLightState;
import DesignPatterns.Behavioural.State.Interfaces.ITrafficLightTimerCalculationStartegy;

import java.util.HashMap;
import java.util.Map;

public class TrafficLight implements ITrafficLight {
    private Map<EnumTrafficLightState,ITrafficLightState> map=null;

    private EnumTrafficLightState currentState=null;

    public TrafficLight(EnumTrafficLightState currentState,Map<EnumTrafficLightState,Integer>mapLightTimer){
        this.currentState=currentState;
        InitializeTrafficLight(mapLightTimer);

    }
    public void request(){
        while(true){
            System.out.println(this.currentState.toString());
            map.get(this.currentState).handle();
        }

    }
    public EnumTrafficLightState getCurrentState() {
        return currentState;
    }

    public void updateCurrentState(EnumTrafficLightState currentState) {
        this.currentState = currentState;

    }
    private void InitializeTrafficLight(Map<EnumTrafficLightState,Integer>mapLightTimer) {
        map=new HashMap<>();
        map.put(EnumTrafficLightState.RED,new RedTrafficLightState(this,mapLightTimer.get(EnumTrafficLightState.RED)));
        map.put(EnumTrafficLightState.GREEN,new GreenTrafficLightState(this,mapLightTimer.get(EnumTrafficLightState.GREEN)));
        map.put(EnumTrafficLightState.YELLOW,new YellowTrafficLightState(this,mapLightTimer.get(EnumTrafficLightState.YELLOW)));
    }



}
