package com.iteso.nintendo.Powers.impl;

import com.iteso.nintendo.Powers.iPower;

/**
 * Created by lnvitado on 04/03/2016.
 */
public class BombPower implements iPower {

    public boolean canGetPower() {
        String character = null;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        character = stackTraceElements[4].getClassName();

        //System.out.println(character + "whocalled?");

        boolean isLink = character.matches(".*Link.*");
        boolean isKirby = character.matches(".*Kirby.*");

        if(isLink||isKirby)
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
            return "bomb throw";
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
            return "bomberman";
        else
            return "Can't get this power";
    }
}

