package DesignPatterns.Behavioural.State.Concretes;

import DesignPatterns.Behavioural.State.EnumTrafficLightState;
import DesignPatterns.Behavioural.State.Interfaces.ITrafficLightTimerCalculationStartegy;

import java.lang.invoke.SwitchPoint;
import java.util.HashMap;
import java.util.Map;

public class TrafficLightTimerCalculationStartegy implements ITrafficLightTimerCalculationStartegy {
    @Override
    public Map<EnumTrafficLightState, Integer> calculate(int trafficLightCount, int timerEach) {

        int greenLightTimer=timerEach;
        int yellowTimer=2;
        int redLightTimer=trafficLightCount*timerEach-greenLightTimer-yellowTimer;
        Map<EnumTrafficLightState, Integer>map=new HashMap<>();
//        map.put(EnumTrafficLightState.GREEN,greenLightTimer*1000);
//        map.put(EnumTrafficLightState.YELLOW,yellowTimer*1000);
//        map.put(EnumTrafficLightState.RED,redLightTimer*1000);
        map.put(EnumTrafficLightState.GREEN,2*1000);
        map.put(EnumTrafficLightState.YELLOW,2*1000);
        map.put(EnumTrafficLightState.RED,5*1000);
        return map;

    }
}
