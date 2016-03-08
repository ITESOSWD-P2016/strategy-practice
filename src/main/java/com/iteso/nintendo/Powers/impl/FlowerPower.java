package com.iteso.nintendo.Powers.impl;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by lnvitado on 04/03/2016.
 */
public class FlowerPower implements iPower {

    public boolean canGetPower() {
        String character = null;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        character = stackTraceElements[4].getClassName();

        //System.out.println(character + "whocalled?");

        boolean isMario = character.matches(".*Mario.*");
        boolean isLuigi = character.matches(".*Luigi.*");
        boolean isKirby = character.matches(".*Kirby.*");

        if(isMario || isLuigi || isKirby)
            return true;
        else
            return false;
    }

    public String getActionA() {
        if(this.canGetPower())
            return "brick break jump";
        else
            return "Can't get this power";
    }

    public String getActionB() {
        if(this.canGetPower())
            return "fireball";
        else
            return "Can't get this power";
    }

    public String getSpeed() {
        if(this.canGetPower())
            return "normal";
        else
            return "Can't get this power";
    }

    public String getPowerName() {
        if(this.canGetPower())
            return "fire";
        else
            return "Can't get this power";
    }

}
