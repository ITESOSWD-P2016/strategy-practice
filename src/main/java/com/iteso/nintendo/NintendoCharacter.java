package com.iteso.nintendo;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
      private String speed = null;
      private String name = null;
      private String currentPower = null;
    private iPower power = null;


    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String performXButtonAction();
    public abstract String performYButtonAction();
    public abstract String performAButtonAction();


    public String performBButtonAction(){
        return this.power.getAction();
    }

    public void setPower(iPower powerItem){
        this.power = powerItem;
        setCurrentPower(this.power.powerName());
    }



    public String getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(String currentPower) {
        this.currentPower = currentPower;
    }
}
