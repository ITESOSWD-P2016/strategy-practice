package com.iteso.nintendo.caracteres;

import com.iteso.nintendo.powers.IPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
    private String speed = null;
    private String name = null;
    private String currentPower = null;
    private IPower power;



    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }
    public String getBAction() {
        return power.getBAction();
    }
    public String getAAction() {
        return power.getAAction();
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String performXButtonAction();
    public abstract String performYButtonAction();
    public abstract String performAButtonAction();
    public abstract String performBButtonAction();


    public void setPower(IPower powerItem) {
        this.power=powerItem;
        setCurrentPower(this.power.getPowerName());
    }


    public String getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(String currentPower) {
        this.currentPower = currentPower;
    }
}
