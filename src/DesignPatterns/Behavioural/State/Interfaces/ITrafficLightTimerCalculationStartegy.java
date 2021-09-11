package DesignPatterns.Behavioural.State.Interfaces;

import DesignPatterns.Behavioural.State.EnumTrafficLightState;

import java.util.Map;

public interface ITrafficLightTimerCalculationStartegy {
    public Map<EnumTrafficLightState,Integer> calculate(int trafficLightCount, int timerEach);
}
