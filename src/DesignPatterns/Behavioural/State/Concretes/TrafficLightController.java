package DesignPatterns.Behavioural.State.Concretes;

import DesignPatterns.Behavioural.State.EnumTrafficLightState;
import DesignPatterns.Behavioural.State.Interfaces.ITrafficController;
import DesignPatterns.Behavioural.State.Interfaces.ITrafficLight;
import DesignPatterns.Behavioural.State.Interfaces.ITrafficLightTimerCalculationStartegy;

import java.util.Map;

public class TrafficLightController implements ITrafficController {

    private int trafficLightCount;
    private int trafficLightTimer;
    private TrafficLight[] trafficLights;
    private ITrafficLightTimerCalculationStartegy trafficLightTimerCalculationStartegy=null;

    public TrafficLightController(int trafficLightCount, int trafficLightTimer,
                                  ITrafficLightTimerCalculationStartegy trafficLightTimerCalculationStartegy){
        this.trafficLightCount=trafficLightCount;
        this.trafficLightTimer=trafficLightTimer;
        this.trafficLights=new TrafficLight[trafficLightCount];
        this.trafficLightTimerCalculationStartegy=trafficLightTimerCalculationStartegy;

    }

    public int getTrafficLightCount() {
        return trafficLightCount;
    }

    public void setTrafficLightCount(int trafficLightCount) {
        this.trafficLightCount = trafficLightCount;
    }

    public int getTrafficLightTimer() {
        return trafficLightTimer;
    }

    public void setTrafficLightTimer(int trafficLightTimer) {
        this.trafficLightTimer = trafficLightTimer;
    }



    @Override
    public void start(){
        boolean isGreenSet=false;
        EnumTrafficLightState state=EnumTrafficLightState.GREEN;
        Map<EnumTrafficLightState,Integer> map= this.trafficLightTimerCalculationStartegy.calculate(trafficLightCount,trafficLightTimer);
         int counter=0;
        for(TrafficLight trafficLight: trafficLights){
          if(!isGreenSet){
              isGreenSet=true;
          }else{
              state=EnumTrafficLightState.RED;
          }
          trafficLight=new TrafficLight(state,map);
            trafficLights[counter++]=trafficLight;
          TrafficLight finalTrafficLight = trafficLight;
            finalTrafficLight.request();

      }
    }


    @Override
    public void reset() {

    }



    @Override
    public void display() {
        while(true){
            for (int i = 0; i <trafficLights.length ; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Traffic light:"+i+ " current state is:"+trafficLights[i].getCurrentState());
            }
        }

    }
}
