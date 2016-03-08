package com.iteso.nintendo.Powers.impl;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by lnvitado on 04/03/2016.
 */
public class InhalePower implements iPower {

    public boolean canGetPower() {
        String character = null;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        character = stackTraceElements[4].getClassName();

        //System.out.println(character + "whocalled?");

        boolean isKirby = character.matches(".*Kirby.*");

        if(isKirby)
            return true;
        else
            return false;
    }

    public String getActionA() {
        if(this.canGetPower())
            return "jump >> float";
        else
            return "Can't get this power";
    }

    public String getActionB() {
        if(this.canGetPower())
            return "inhale >> throw";
        else
            return "Can't get this power";
    }

    public String getSpeed() {
        if(this.canGetPower())
            return "slow";
        else
            return "Can't get this power";
    }

    public String getPowerName() {
        if(this.canGetPower())
            return "inhale";
        else
            return "Can't get this power";
    }
}

