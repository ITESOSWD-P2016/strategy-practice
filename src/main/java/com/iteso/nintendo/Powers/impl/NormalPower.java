package com.iteso.nintendo.Powers.impl;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by lnvitado on 04/03/2016.
 */
public class NormalPower implements iPower {

    public boolean canGetPower() {
        String character = null;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        character = stackTraceElements[4].getClassName();

        //System.out.println(character + "whocalled?");

        boolean isMario = character.matches(".*Mario.*");
        boolean isLuigi = character.matches(".*Luigi.*");

        if(isMario||isLuigi)
            return true;
        else
            return false;
    }

    public String getActionA() {
        if(this.canGetPower())
            return "jump";
        else
            return "Can't get this power";
    }

    public String getActionB() {
        if(this.canGetPower())
            return "none";
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
            return "normal";
        else
            return "Can't get this power";
    }
}
