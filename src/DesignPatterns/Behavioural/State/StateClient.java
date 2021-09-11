package DesignPatterns.Behavioural.State;

import DesignPatterns.Behavioural.State.Concretes.TrafficLightController;
import DesignPatterns.Behavioural.State.Concretes.TrafficLightTimerCalculationStartegy;
import DesignPatterns.Behavioural.State.Interfaces.ITrafficController;

public class StateClient {
    public static void main(String[] args) {
        ITrafficController controller=new TrafficLightController(1,5,
                new TrafficLightTimerCalculationStartegy());

        controller.start();
        controller.display();

    }
}
