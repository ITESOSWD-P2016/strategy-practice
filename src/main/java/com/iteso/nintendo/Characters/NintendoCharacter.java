package com.iteso.nintendo.Characters;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
      private String speed = null;
      private String name = null;
      private String currentPower = null;
      private iPower power = null;

    public void setName(iPower power){
        name= power.getpowername();
    }
    public void setspeed(iPower power){
        speed = power.getspeed();
    }
    public void setPower(iPower power){
        currentPower=power.getpowername();
    }

    public String getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }



    public void setName(String name) {
        this.name = name;
    }

    public abstract String performXButtonAction();
    public abstract String performYButtonAction();
    public abstract String performAButtonAction();
    public String performBButtonAction(){
        return power.getaction();
    }

    public abstract void setPower(String powerItem);


    public String getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(String currentPower) {
        this.currentPower = currentPower;
    }
}
