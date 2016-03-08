package com.iteso.nintendo.Powers.impl;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by lnvitado on 04/03/2016.
 */
public class SwordPower implements iPower {

    public boolean canGetPower() {
        String character = null;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        character = stackTraceElements[4].getClassName();

        //System.out.println(character + "whocalled?");

        boolean isLink = character.matches(".*Link.*");

        if(isLink)
            return true;
        else
            return false;
    }

    public String getActionA() {
        if(this.canGetPower())
            return "jump slash";
        else
            return "Can't get this power";
    }

    public String getActionB() {
        if(this.canGetPower())
            return "sword slash";
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
            return "swordsmanship";
        else
            return "Can't get this power";
    }
}

