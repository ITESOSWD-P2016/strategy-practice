package com.iteso.nintendo.Characters;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {

//////////////////// Attributes ////////////////////

    private String CharName = null;
    private String PowerName = null;
    private String currentPower = null;
    private String speed = null;

    private iPower power;


///////////////////// Setters /////////////////////

    public void setPower(iPower powerItem){
        this.power = powerItem;
        setPowerName(this.power.getPowerName());
        setCurrentPower(this.power.getAction());
        setSpeed(this.power.getSpeed());
    }

    public void setCharName(String CharName) {
        this.CharName = CharName;
    }

    public void setPowerName(String PowerName){
        this.PowerName = PowerName;
    }

    public void setCurrentPower(String currentPower){
        this.currentPower = currentPower;
    }

    public void setSpeed(String speed){
        this.speed = speed;
    }

///////////////////// Getters /////////////////////

    public String getCharName() {
        return CharName;
    }

    public String getPowerName() {
        return PowerName;
    }

    public String getCurrentPower() {
        return currentPower;
    }

    public String getSpeed() {
        return speed;
    }

///////////////////// Buttons /////////////////////

// X
    public abstract String performXButtonAction();

// Y
    public abstract String performYButtonAction();

// A
    public abstract String performAButtonAction();

// B
    public String performBButtonAction(){
        return power.getAction();
    }

///////////////////////////////////////////////////




}
